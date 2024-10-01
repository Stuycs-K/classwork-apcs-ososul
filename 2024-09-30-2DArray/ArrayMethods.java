public class ArrayMethods{
    //Simon Liu: simonl105@nycstudents.net
    //Adi Murgescu: adrianm199@nycstudents.net
    public static void main(String[] args){
      int[][] test = {{}, {}};
      int[][] test1 = {{1,2,3}, {23, 4, 7}, {16, 15, 3}};
      int[][] test2 = {{1, 2}, {2, 7, 5, 6}, {}};
      System.out.println(arrToString(new int []{1,2,3,4,5}));
      System.out.println(arrToString(test));
      System.out.println(arrToString(test1));
      System.out.println(arrToString(test2));
    }
    public static String arrToString(int[] ary){
      String arrString = "[";
      for (int i = 0; i < ary.length; i++){
        arrString += ary[i];
        if (i < ary.length-1){
          arrString += ", ";
        }
      }
      return arrString + "]";
    }
    //3. Write arrToString, with a 2D array parameter.
    //Note: Different parameters are allowed with the same function name.
    /**Return a String that represets the 2D array in the format:
      * "[[2, 3, 4], [5, 6, 7], [2, 4, 9]]"
      * Note the comma+space between values, and between arrays
      * You are encouraged to notice that you may want to re-use
      * previous code, but you should NOT duplicate that code. (Don't copy/paste or retype it)
      */
    public static String arrToString(int[][]ary){
      String output = "[";
      for (int i = 0; i < ary.length; i++){
        output += arrToString(ary[i]);
        if (i < ary.length - 1){
            output += ", ";
          }
    }
      return output + "]";
    }
  
    /*Return the sum of all of the values in the 2D array */
    public static int arr2DSum(int[][]nums){
      //use a nested loop to solve this
      int sum = 0;
      return null;//place holder return value so it compiles.
    }
  
    /**Rotate an array by returning a new array with the rows and columns swapped.
      * You may assume the array is rectangular and neither rows nor cols is 0.
      * e.g. swapRC({{1,2,3},{4,5,6}}) returns {{1,4},{2,5},{3,6}}
      */
  //  public static int[][] swapRC(int[][]nums){
  //    return new int[1][1];
  //  }
}