public class Fibonacci {
  public static int fib (int n){
    if (n == 0 || n == 1){
      return n;
    }
    else {
      return (fib(n-2) + fib(n-1));
    }
  }

  public static void main(String[] args) {
    int k = 47;
    for (int i = 0; i <= k; i++){
      System.out.println(fib(i));
    }
  }

  // overflows at 47, doesn't at 46 //









}
