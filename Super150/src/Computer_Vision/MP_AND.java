package Computer_Vision;
import java.util.Arrays;



public class MP_AND {
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
        int[] weights = {1, 1};  // Weights for the AND function
        int threshold = 2;       // Threshold for AND function

        MPNeuron orNeuron = new MPNeuron(weights, threshold);

        // Define inputs
        int[][] inputs = {
                {0, 0},
                {0, 1},
                {1, 0},
                {1, 1}
        };

        // Calculate OR function for each input
        System.out.println("MP Model AND Results:");
        for (int[] input : inputs) {
            int result = orNeuron.activate(input);
            System.out.println("Input: " + Arrays.toString(input) + " => Output: " + result);
        }
    }
}
