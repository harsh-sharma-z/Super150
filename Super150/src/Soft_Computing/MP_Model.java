package Soft_Computing;
import java.util.*;
public class MP_Model {
    static class Neuron {
        private static double[] weights;
        private static double threshold;

        public Neuron(int numInputs) {
            // Initializing the weights with random values between -1 and 1
            weights = new double[numInputs];
            for (int i = 0; i < numInputs; i++) {
                weights[i] = Math.random() * 2 - 1;
            }

            // Initializing the threshold with a random value between -1 and 1
            threshold = Math.random() * 2 - 1;
        }
        public static int activationFunc(int[] inputs) {
            double sum = 0;
            for (int i = 0; i < weights.length; i++) {
                sum += weights[i] * inputs[i];
            }

            return (sum > threshold) ? 1 : 0;
        }

        public static void printWeights() {
            System.out.println("Weights: " + Arrays.toString(weights));
            System.out.println("Threshold: " + threshold);
        }
    }


    public static void main(String[] args) {
        // Create a neural network with 2 input neurons
        Neuron neuron = new Neuron(2);

        // Set input values
        int[] inputs = {1, 0};

        // activationFunc the neuron
        int output = neuron.activationFunc(inputs);

        // Display the output
        System.out.println("Output: " + output);

        // Print the neuron's weights and threshold
        neuron.printWeights();
    }

}
