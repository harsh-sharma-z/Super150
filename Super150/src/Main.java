import java.lang.reflect.Array;
import java.util.*;
public class Main {
    public static int[] topK(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for(Integer i:nums){
            map.put(i,map.getOrDefault(i,0)+1);
        }
        ArrayList< Map.Entry<Integer, Integer>> list = new ArrayList<>(map.entrySet());

        list.sort((a,b) -> Objects.equals(a.getValue(), b.getValue())? b.getKey()-a.getKey():b.getValue()-a.getValue());

        int[] ans= new int[k];
        for(int i=0;i<k;i++){
            ans[i]=list.get(i).getKey();
        }

        //   System.out.println(list);
        return ans;
    }
    public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            int n=sc.nextInt();
            int k=sc.nextInt();
            int arr[]=new  int[n];
            for(int i=0;i<n;i++)
                arr[i]=sc.nextInt();
            int ans[]=topK(arr,k);

            for(int i:ans)
                System.out.print(i+" ");


    }
}