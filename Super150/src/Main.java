import java.util.*;
import java.io.*;

class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc=new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0) {

            int ULx = sc.nextInt();
            int ULy = sc.nextInt();
            int LRx = sc.nextInt();
            int LRy = sc.nextInt();


            int Dx = sc.nextInt();
            int Dy = sc.nextInt();

            int N = sc.nextInt();
            int[][] trees = new int[N][2];
            double[] radius = new double[N];
            for (int i = 0; i < N; i++) {
                trees[i][0] = sc.nextInt();
                trees[i][1] = sc.nextInt();
                radius[i] = sc.nextDouble();
            }

            int count = 0;
            for (int R = 1; R <= Math.max(Dx - ULx, LRx - Dx); R++) {
                boolean valid = true;
                for (int i = 0; i < N; i++) {
                    int x = trees[i][0];
                    int y = trees[i][1];
                    double d = Math.sqrt((x - Dx) * (x - Dx) + (y - Dy) * (y - Dy));
                    if (d - radius[i] < R - 1e-9) {
                        valid = false;
                        break;
                    }
                }
                if (valid) {
                    count++;
                }
            }

            System.out.println("Case " + t + ": " + count);
        }
    }
}
