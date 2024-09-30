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

  //Write a function that returns a new array with the same values as the parameter ary.
  public static int[] returnCopy(int[]ary){
    int [] outAry = new int [ary.length];
    for (int i = 0; i < ary.length; i++){
      outAry[i] = ary[i];
    }
    return outAry;
  }

  //public static int[] concatArray(int[]ary1,int[]ary2)
  public static int[] concatArray(int[]ary1,int[]ary2){
    
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
