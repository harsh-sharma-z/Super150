package Soft_Computing;
import java.util.Arrays;



public class Linearly_Separablle_Perceptron {
    static class Perceptron {
        private double[] weights;
        private double learningRate;
        private int maxEpochs;

        public Perceptron(int inputSize, double learningRate, int maxEpochs) {
            this.weights = new double[inputSize + 1]; // Additional weight for bias
            this.learningRate = learningRate;
            this.maxEpochs = maxEpochs;
        }

        public int predict(int[] inputs) {
            if (inputs.length != weights.length - 1) {
                throw new IllegalArgumentException("Input size must match weight size");
            }

            double sum = weights[0]; // Bias term
            for (int i = 0; i < inputs.length; i++) {
                sum += inputs[i] * weights[i + 1];
            }

            return (sum > 0) ? 1 : 0;
        }

        public void train(int[][] trainingData, int[] labels) {
            for (int epoch = 0; epoch < maxEpochs; epoch++) {
                boolean converged = true;
                for (int i = 0; i < trainingData.length; i++) {
                    int prediction = predict(trainingData[i]);
                    int error = labels[i] - prediction;

                    if (error != 0) {
                        converged = false;
                        weights[0] += learningRate * error; // Update bias term
                        for (int j = 0; j < trainingData[i].length; j++) {
                            weights[j + 1] += learningRate * error * trainingData[i][j];
                        }
                    }
                }

                if (converged) {
                    System.out.println("Converged in " + (epoch + 1) + " epochs.");
                    return;
                }
            }
            System.out.println("Did not converge in the specified number of epochs.");
        }
    }

    public static void main(String[] args) {
        int inputSize = 2;
        double learningRate = 0.1;
        int maxEpochs = 1000;

        int[][] trainingData = {
                {0, 0},
                {0, 1},
                {1, 0},
                {1, 1}
        };
        int[] labels = {0, 0, 0, 1};

        Perceptron perceptron = new Perceptron(inputSize, learningRate, maxEpochs);
        perceptron.train(trainingData, labels);

        System.out.println("Testing the trained Perceptron:");
        for (int i = 0; i < trainingData.length; i++) {
            int prediction = perceptron.predict(trainingData[i]);
            System.out.println("Input: " + Arrays.toString(trainingData[i]) + ", Prediction: " + prediction);
        }
    }
}
