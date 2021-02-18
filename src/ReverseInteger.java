public class ReverseInteger {

  public static int reverse(int x) {
    long res = 0;
    while (x != 0) {
      res = res * 10 + x % 10; //we are growing the number here
      x = x / 10; //while reducing the old number here
    }

    if (res < Integer.MIN_VALUE || res > Integer.MAX_VALUE) {
      return 0;
    } else {
      return (int)res;
    }
  }

  public static void main(String[] args) {
    int reversed = reverse(321);
    System.out.println(reversed);
  }
}
