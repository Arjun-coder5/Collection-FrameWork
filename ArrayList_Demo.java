import java.util.*;
public class ArrayList_Demo {
  public static void main(String[] args) {
    // Creating Collection : 
    /*
    1) Type safe - same type of elements(objects) are added to collection.

    2) un safe type - different types of objects can be added to collection .
 
    */
  //  Type safe colln : 
  ArrayList<String> names = new ArrayList();
  names.add("Arjun");
  //names.add(123); - no integer bcz type is string
   names.add("Krish");
   names.add("OM");
   names.add("Dhoom");
   names.add("Power");
   System.out.println(names);
  //  We can get indexed data here : 
  // Duplicates Allowed Here : 
  //  System.out.println(names.get(0));
  //  System.out.println(names.get(1));
  names.remove(3);
  System.out.println(names);
  //  size : 
  System.out.println("SIZE = "+ names.size());
  // Check :  contains and equals : 
  System.out.println("Contain ="+ names.contains("Arjun"));
  System.out.println(names.equals("Arjun"));
  //  Empty check : 
  names.isEmpty();
  //  Set value : 
  names.set(1, "Khushi");
  // Add ;
  names.add(1,"Arjun");
  // Remove all the elements : 
  names.clear();
  

  }
}
