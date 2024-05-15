public class OddOrEven {
    public static void oddEven(int n) {
        int bitMask = 1;
        if((n & bitMask) == 0) {
            System.out.println("even number");
        } else {
            System.out.println("odd number");
        }
    }
    public static void main(String[] args) {
        // check is a number is Odd or Even
        oddEven(4);
        oddEven(11);
        oddEven(14);
    }
}
