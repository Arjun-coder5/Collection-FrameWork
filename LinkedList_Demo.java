
import java.util.*;

public class LinkedList_Demo {
  public static void main(String[] args) {
    // UN Type Safe : 
    LinkedList list = new LinkedList<>();
    list.add("Kholi");
    list.add("101");
    list.add(true);
    list.add(4/3);
    list.add(4.60);
    System.out.println(list);
    
  }
}
