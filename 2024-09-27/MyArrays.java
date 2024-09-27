public class MyArrays{
  public static String arrayToString(int[] nums){
    String out = "[";
    for (int i = 0; i < nums.length; i++){
      out += nums[i];
      if (i < nums.length - 1){
        out += ", ";
      }
    }
    return out + "]";
  }

  public static int[] returnCopy(int[]ary){

  }



  public static void main (String[] args){
    int [] test = {1,4,5,9};
    System.out.println(arrayToString(test));
    int [] test1 = {1};
    System.out.println(arrayToString(test1));
    int [] test2 = {};
    System.out.println(arrayToString(test2));
  }
}
