package Soft_Computing;

public class min_max_composition {
    public static void main(String[] args) {
        int[][] m1 = {
                {0 , 1 , 0},
                {0 , 0 , 1},
                {0 , 0 , 0}
        };
        int[][] m2 = {
                {0 , 1 , 1},
                {0 , 0 , 1},
                {0 , 0 , 0}
        };

        int[][] res = new int[3][3];

        for(int i = 0 ; i < 3 ; i++){
            for(int j = 0 ; j < 3 ; j++){
                int max = Integer.MIN_VALUE;
                for(int k = 0 ; k < 3 ; k++){
                    max = Math.max(max , Math.min(m1[i][k] , m2[k][j]));
                }
                res[i][j] = max;
            }
        }

        System.out.println("Resultant relation:");
        for(int i[] : res){
            for(int j : i){
                System.out.print(j + "  ");
            }
            System.out.println("");
        }
    }
}
