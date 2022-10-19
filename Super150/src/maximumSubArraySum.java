import java.util.*;
public class maximumSubArraySum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            long[] nums = new long[n];

            for (int i = 0; i < n; i++) {
                nums[i] = sc.nextLong();
            }


            System.out.println(help(nums));

        }
    }

        public static long kayden(long[] nums) {
            long ans = Long.MIN_VALUE;
            long sum = 0;

            for (long i : nums) {
                sum += i;
                ans = Math.max(ans, sum);

                if (sum < 0)
                    sum = 0;
            }

            return ans;
        }
            public static long help(long[] nums)
            {
                long lsum=kayden(nums);
                long sum=0;

                for(int i=0;i<nums.length;i++)
                {
                    sum+=nums[i];
                    nums[i]=nums[i]*-1;
            }
                long midsum=kayden(nums);
                sum+=midsum;

                if(sum==0)
                    return lsum;
                return Math.max(midsum,lsum);
        }
    }


