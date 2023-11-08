import java.util.Scanner;

public class Test {

    public static int maxGoodsPickup(int numRows, int numCols, int[][] grid) {
        int[][] dp = new int[numRows][numCols];

        // Initialize dp array with the values from the grid
        for (int i = 0; i < numRows; i++) {
            for (int j = 0; j < numCols; j++) {
                dp[i][j] = grid[i][j];
            }
        }

        // Iterate through the grid row by row
        for (int i = 1; i < numRows; i++) {
            for (int j = 0; j < numCols; j++) {
                dp[i][j] += Math.max(dp[i - 1][j], getMaxPrev(dp, i - 1, j));
            }
        }

        // Find the maximum value in the last row, which represents the maximum goods that can be picked by both robots
        int maxGoods = 0;
        for (int j = 0; j < numCols; j++) {
            maxGoods = Math.max(maxGoods, dp[numRows - 1][j]);
        }

        return maxGoods;
    }

    private static int getMaxPrev(int[][] dp, int row, int col) {
        int max = dp[row][col];
        if (col > 0) {
            max = Math.max(max, dp[row][col - 1]);
        }
        if (col < dp[0].length - 1) {
            max = Math.max(max, dp[row][col + 1]);
        }
        return max;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input
        int numRows = scanner.nextInt();
        int numCols = scanner.nextInt();
        int[][] grid = new int[numRows][numCols];

        for (int i = 0; i < numRows; i++) {
            for (int j = 0; j < numCols; j++) {
                grid[i][j] = scanner.nextInt();
            }
        }

        // Find and print the maximum number of goods that can be picked by both robots
        int result = maxGoodsPickup(numRows, numCols, grid);
        System.out.println(result);
    }
}
