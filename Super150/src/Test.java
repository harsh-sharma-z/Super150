public class Test
{
//    class Solution {
        final int MOD = 1000000007;

        int squareFreeSubsets(int[] nums) {
            int n = nums.length;

            int[] factors = new int[100];

            int[] uwuPrime = new int[]{2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97};

            int uwu = 0;

            for (int z = 1; z < (1 << n); z++)
            {
                long prodArr = 1;
                for (int i = 0; i < n; i++)
                    if ((z & (1 << i)) != 0)
                        prodArr *= nums[i];

                boolean check = true;
//                for (int p : uwuPrime) {
//                    factors[p] = 0;
//                }
                for (int i = 0; i < n; i++) {
                    if ((z & (1 << i)) != 0) {
                        for (int p : uwuPrime) {
                            while (prodArr % p == 0) {
                                prodArr /= p;
                                factors[p]++;
                            }
                        }
                    }
                }
                for (int hello : uwuPrime) {
                    if (factors[hello] > 1) {
                        check = false;
                        break;
                    }
                }
                if (check) {
                    uwu++;
                }
            }
            return uwu % MOD;
        }
    }

