package Bit_Manipulation;

public class setBitOrNot {
    public static void main(String[] args) {
        int n=84;
        int pos=4;
        System.out.println(checkSetBit(n,pos));
    }
    private static boolean checkSetBit(int n, int pos)
    {
        if((n&(1<<pos))!=0)
            return true;
        else
            return false;
    }
}
