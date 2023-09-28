package Computer_Vision;
import java.util.Arrays;

public class MP_XOR {
    static class MPNeuron {
        private int[] weights;
        private int threshold;

        public MPNeuron(int[] weights, int threshold) {
            this.weights = weights;
            this.threshold = threshold;
        }

        public int activate(int[] inputs) {
            if (inputs.length != weights.length) {
                throw new IllegalArgumentException("Input size must match weight size");
            }

            int sum = 0;
            for (int i = 0; i < inputs.length; i++) {
                sum += inputs[i] * weights[i];
            }

            return (sum >= threshold) ? 1 : 0;
        }
    }
    public static void main(String[] args) {
        // Define weights and thresholds for two MP neurons in the hidden layer
        int[] hiddenNeuron1Weights = {1, 1};
        int hiddenNeuron1Threshold = 1;
        int[] hiddenNeuron2Weights = {-1, -1};
        int hiddenNeuron2Threshold = -1;

        // Define weights and threshold for the output neuron
        int[] outputNeuronWeights = {1, 1};
        int outputNeuronThreshold = 1;

        // Create MP neurons
        MPNeuron hiddenNeuron1 = new MPNeuron(hiddenNeuron1Weights, hiddenNeuron1Threshold);
        MPNeuron hiddenNeuron2 = new MPNeuron(hiddenNeuron2Weights, hiddenNeuron2Threshold);
        MPNeuron outputNeuron = new MPNeuron(outputNeuronWeights, outputNeuronThreshold);

        // Define XOR inputs
        int[][] inputs = {
                {0, 0},
                {0, 1},
                {1, 0},
                {1, 1}
        };

        // Calculate XOR function for each input

        System.out.println("MP Model output for XOR:");
        for (int[] input : inputs) {
            int hidden1Output = hiddenNeuron1.activate(input);
            int hidden2Output = hiddenNeuron2.activate(input);
            int[] hiddenOutputs = {hidden1Output, hidden2Output};
            int xorResult = outputNeuron.activate(hiddenOutputs);


            System.out.println("Input: " + Arrays.toString(input) + " => Output: " + xorResult);
        }
    }
}
