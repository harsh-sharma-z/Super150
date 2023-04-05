import java.util.*;
class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int[][] grid=new int[n][m];
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                grid[i][j]=sc.nextInt();
            }
        }
        int area=0;
        for(int i=0; i<grid.length; i++){
            for(int j=0; j<grid[i].length; j++){
                if(grid[i][j]==1){
                    int sum=0;
                    sum=island(grid,i,j,sum,n,m);
                    area=Math.max(sum,area);
                    }
                }
            }
        System.out.println(area);
        }



    public static int island(int[][] grid, int i, int j, int count, int n, int m){
        if(i<0 || j<0 || i>=n || j>=m || grid[i][j]==0 ){
            return count;
        }
        grid[i][j]=0;
        count=island(grid, i+1, j, count+1,n,m);
        count=island(grid, i-1, j, count+1,n,m);
        count=island(grid, i, j+1, count+1,n,m);
        count=island(grid, i, j-1, count+1,n,m);
        return count;
    }

}


