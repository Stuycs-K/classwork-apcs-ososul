import java.util.ArrayList;

public class ArrayListPractice {

  public static ArrayList<String> createRandomArray (int size){
  ArrayList<String> ary = new ArrayList<String>();
  for (int i = 0; i < size; i++){
    String elm = "" + (int)(11*Math.random());
    if (elm.equals("0")) {
      elm = "";
    }
    ary.add(elm);
  }
  return ary;
  }

  public static void replaceEmpty( ArrayList<String> original){
  //Modify the ArrayList such that it has all of the empty strings are
  //replaced with the word "Empty".
  for (int i = 0; i < original.size(); i++) {
    if (original.get(i).equals("")) {
        original.set(i, "Empty");
    }
  }
}

public static ArrayList<String> makeReversedList( ArrayList<String> original){
  //return a new ArrayList that is in the reversed order of the original.
  ArrayList<String> out = new ArrayList<String>();
        for (int i = original.size() - 1; i >= 0; i--) {
            out.add(original.get(i));
        }
        return out;
}

public static ArrayList<String> mixLists( ArrayList<String> a,  ArrayList<String> b){
  //return a new ArrayList that has all values of a and b in alternating order that is:
  //a[0], b[0], a[1], b[1]...
  //If one list is longer than the other, just attach the remaining values to the end.
  ArrayList<String> out = new ArrayList<String>();
        int i = 0;
        while (i < a.size() || i < b.size()) {
            if (i < a.size()) out.add(a.get(i));
            if (i < b.size()) out.add(b.get(i));
            i++;
        }
        return out;
}




}
