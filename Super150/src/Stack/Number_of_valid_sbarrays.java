package Stack;

import java.util.Stack;

public class Number_of_valid_sbarrays {
    public static void main(String[] args) {
        int []arr={1,4,2,5,3};
        System.out.println(validSubarray(arr));
    }

    private static int validSubarray(int []arr)
    {
        Stack<Integer> uwu=new Stack<>();
        int res=0;

        for(int i = 0; i < arr.length; i++) {
            while(!uwu.isEmpty() && arr[i]<uwu.peek())
            {
                uwu.pop();
            }
            uwu.push(arr[i]);
            res+=uwu.size();

     }
        return res;
    }
}
