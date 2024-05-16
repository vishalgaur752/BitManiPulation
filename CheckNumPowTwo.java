public class CheckNumPowTwo {
    public static boolean isPowerOfTwo(int n) {
        return (n & (n-1))==0;
    }
    public static void main(String[] args) {
        //check if a number is a power of 2 or not.
        System.out.println(isPowerOfTwo(8));
    }
}
