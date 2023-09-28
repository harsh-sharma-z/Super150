package Computer_Vision;
import java.util.Arrays;
public class Back_Propagation {
    static class NeuralNetwork {
        private int inputSize;
        private int hiddenSize;
        private int outputSize;
        private double[][] weightsInputToHidden;
        private double[][] weightsHiddenToOutput;
        private double[] hiddenLayer;
        private double[] outputLayer;
        private double learningRate;

        public NeuralNetwork(int inputSize, int hiddenSize, int outputSize, double learningRate) {
            this.inputSize = inputSize;
            this.hiddenSize = hiddenSize;
            this.outputSize = outputSize;
            this.learningRate = learningRate;

            weightsInputToHidden = new double[inputSize][hiddenSize];
            weightsHiddenToOutput = new double[hiddenSize][outputSize];

            initializeWeights();

            hiddenLayer = new double[hiddenSize];
            outputLayer = new double[outputSize];
        }

        private void initializeWeights() {
            for (int i = 0; i < inputSize; i++) {
                for (int j = 0; j < hiddenSize; j++) {
                    weightsInputToHidden[i][j] = Math.random() - 0.5;
                }
            }

            for (int i = 0; i < hiddenSize; i++) {
                for (int j = 0; j < outputSize; j++) {
                    weightsHiddenToOutput[i][j] = Math.random() - 0.5;
                }
            }
        }

        private double sigmoid(double x) {
            return 1 / (1 + Math.exp(-x));
        }

        public double[] feedForward(double[] input) {
            // Calculate values in the hidden layer
            for (int i = 0; i < hiddenSize; i++) {
                double sum = 0;
                for (int j = 0; j < inputSize; j++) {
                    sum += input[j] * weightsInputToHidden[j][i];
                }
                hiddenLayer[i] = sigmoid(sum);
            }

            // Calculate values in the output layer
            for (int i = 0; i < outputSize; i++) {
                double sum = 0;
                for (int j = 0; j < hiddenSize; j++) {
                    sum += hiddenLayer[j] * weightsHiddenToOutput[j][i];
                }
                outputLayer[i] = sigmoid(sum);
            }

            return outputLayer;
        }

        public void train(double[] input, double[] target) {
            // Perform feedforward
            feedForward(input);

            // Backpropagation
            double[] outputErrors = new double[outputSize];
            for (int i = 0; i < outputSize; i++) {
                outputErrors[i] = target[i] - outputLayer[i];
            }

            double[] hiddenErrors = new double[hiddenSize];
            for (int i = 0; i < hiddenSize; i++) {
                double errorSum = 0;
                for (int j = 0; j < outputSize; j++) {
                    errorSum += outputErrors[j] * weightsHiddenToOutput[i][j];
                }
                hiddenErrors[i] = hiddenLayer[i] * (1 - hiddenLayer[i]) * errorSum;
            }

            // Update weights
            for (int i = 0; i < inputSize; i++) {
                for (int j = 0; j < hiddenSize; j++) {
                    weightsInputToHidden[i][j] += learningRate * hiddenErrors[j] * input[i];
                }
            }

            for (int i = 0; i < hiddenSize; i++) {
                for (int j = 0; j < outputSize; j++) {
                    weightsHiddenToOutput[i][j] += learningRate * outputErrors[j] * hiddenLayer[i];
                }
            }
        }
    }
    public static void main(String[] args) {
        int inputSize = 2;
        int hiddenSize = 3;
        int outputSize = 1;
        double learningRate = 0.1;

        NeuralNetwork neuralNetwork = new NeuralNetwork(inputSize, hiddenSize, outputSize, learningRate);

        // Training data
        double[][] trainingData = {
                {0, 0},
                {0, 1},
                {1, 0},
                {1, 1}
        };

        double[][] targetData = {
                {0},
                {1},
                {1},
                {0}
        };

        // Training
        int epochs = 10000;
        for (int i = 0; i < epochs; i++) {
            for (int j = 0; j < trainingData.length; j++) {
                neuralNetwork.train(trainingData[j], targetData[j]);
            }
        }

        // Testing
        for (int i = 0; i < trainingData.length; i++) {
            double[] input = trainingData[i];
            double[] output = neuralNetwork.feedForward(input);
            System.out.println("Input: " + Arrays.toString(input));
            System.out.println("Output: " + Arrays.toString(output));
        }
    }
}
