public class Fibonacci {
  public static int fib (int n){
    if (n == 0 || n == 1){
      return n;
    }
    else {
      return (fib(n-2) + fib(n-1));
    }
    // overflows at 47, doesn't at 46 //

    // 46 finishes under 10 seconds //
  }

  public static void makeWords(int remainingLetters, String result, String alphabet){
    if (remainingLetters < 1){
      return result;
    }
    for (int i = 0; i < alphabet.length(); i++){

      }
    }
  }

  public static void main(String[] args) {
    int k = 47;
    for (int i = 0; i <= k; i++){
      System.out.println(fib(i));
    }
  }











}
