public class CountSetBits {
    public static int countSetBits(int n) {
        int count = 0;
        while(n > 0) {
            if((n & 1) != 0) {
                count++;
            }
            n = n >> 1;
        }
        return count;
    }
    public static void main(String[] args) {
        //Count set bits in a number.
        System.out.println(countSetBits(15));
    }
}
