import java.util.ArrayList;
public class Driver {

  public static void main (String[] args){
    ArrayList<String> randomList = ArrayListPractice.createRandomArray(5);
        System.out.println("Random List: " + randomList);

        ArrayList<String> list = new ArrayList<>();
        list.add("");
        list.add("2");
        list.add("");
        ArrayListPractice.replaceEmpty(list);
        System.out.println("After replaceEmpty: " + list);

        ArrayList<String> reversed = ArrayListPractice.makeReversedList(list);
        System.out.println("Reversed List: " + reversed);

        ArrayList<String> a = new ArrayList<>();
        a.add("1");
        a.add("3");
        ArrayList<String> b = new ArrayList<>();
        b.add("2");
        b.add("4");
        ArrayList<String> mixed = ArrayListPractice.mixLists(a, b);
        System.out.println("Mixed List: " + mixed);
  }




}
