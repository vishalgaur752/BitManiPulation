public class UpdateIthBit {
    public static int clearIthbit(int n, int i) {
        int bitMask = ~(1 << i);
        return n | bitMask;
    }

    public static int setIthBit(int n, int i) {
        int bitMask = 1 << i;
        return n | bitMask;
    }

    public static int updateIthBitt(int n, int i, int newBit) {
        // n = clearIthbit(n, i);
        // int bitMask = newBit << i;
        // return n | bitMask;
        if (newBit == 0) {
            return clearIthbit(n, i);
        } else {
            return setIthBit(n, i);
        }
    }

    public static void main(String[] args) {
        System.out.println(updateIthBitt(10, 2, 1));
    }
}
