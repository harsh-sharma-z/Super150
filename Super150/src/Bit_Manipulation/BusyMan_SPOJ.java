package Bit_Manipulation;
import java.io.*;
import java.util.Arrays;
import java.util.Comparator;

public class BusyMan_SPOJ {

    public static class Pair{
        int start;
        int end;

        public Pair(int start, int end)
        {
            this.start=start;
            this.end=end;
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int t=Integer.parseInt(br.readLine());
        while(t-->0)
        {
            int n=Integer.parseInt(br.readLine());
            Pair[] arr=new Pair[n];
            for(int i=0;i<n;i++)
            {
                String s=br.readLine();
                String[] str=s.split(" ");
                int start=Integer.parseInt(str[0]);
                int end=Integer.parseInt(str[1]);
                arr[i]=new Pair(start,end);
            }
            Arrays.sort(arr, new Comparator<Pair>() {
                @Override
                public int compare(Pair o1, Pair o2) {
                    return o1.end-o2.end;
                }
            });

            int activities=1;
            int end=arr[0].end;
            for(int i=0;i< arr.length;i++)
            {
                if(end<=arr[i].start)
                {
                    activities++;
                    end=arr[i].end;
                }
            }
            System.out.println(activities);
        }
    }
}
