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

  //Write a function that returns a new array, that contains all of the values of ary1 followed by all of the values of ary2. 
  //The order of the values should remain the same.
  public static int[] concatArray(int[]ary1,int[]ary2){
    int [] outAry = new int [ary1.length + ary2.length];
    for (int i = 0; i < ary1.length; i++) {
      outAry[i] = ary1[i]; 
  }
    for (int i = 0; i < ary2.length; i++) {
        outAry[ary1.length + i] = ary2[i];
    }
    return outAry;
    
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
