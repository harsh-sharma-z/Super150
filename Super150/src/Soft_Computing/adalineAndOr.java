package Soft_Computing;

public class adalineAndOr {
    public static void main(String[] args) {
        int[][] input = {
                {-1 , -1},
                {-1 , 1},
                {1 , -1},
                {1 , 1}
        };
        int[] labels = {-1 , 1 , 1 , 1}; // will change accoording to OR and AND

        double[] weights = {0.5 , 0.5};

        double bias = 0.1;
        double learning_rate = 0.2;
        int epoch = 10;

        for(int i = 0 ; i < epoch ; i ++){
            System.out.println("epoch : " + (i + 1));
            double sum_squared_error = 0.0;

            for(int j = 0 ; j < input.length ; j++){
                int actual = labels[j];
                int x1 = input[j][0];
                int x2 = input[j][1];

                double unit = (x1 * weights[0]) + (x2 * weights[1]) + bias;

                double error = actual - unit;

                System.out.println("Error : " + error);

                sum_squared_error = sum_squared_error + (error * error);

                weights[0] += (learning_rate * error * x1);
                weights[1] += (learning_rate * error * x2);

                bias += (learning_rate * error);
            }
            System.out.println("Sum of squared error = " + sum_squared_error/4.0 +"\n\n");
        }
    }
}
