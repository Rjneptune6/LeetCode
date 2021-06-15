public class FactorialTrailingZeros {
    public static int trailingZeroes(int n) {
        int count = 0;
        while(n > 0){
            n /= 5;
            count += n;
        }
        return count;
    }

    public static void main(String[] args) {
        int res = trailingZeroes(9);
        int res2 = trailingZeroes(7);
        int res3 = trailingZeroes(10);
        System.out.println(res3);
    }
}
