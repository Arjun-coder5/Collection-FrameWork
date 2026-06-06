
import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.TreeSet;

public class TraverseExample {
  public static void main(String[] args) {
   ArrayList<String> names  =new  ArrayList();
  names.add("1");
  //names.add(123); - no integer bcz type is string
   names.add("2");
   names.add("3");
   names.add("4");
   names.add("5");
   for(String str : names){
    System.out.print(str + "\t"+str.length());
    StringBuffer br = new StringBuffer(str);
    System.out.println(" " +br.reverse());
   }
     System.out.println("-----------------------");
    // Traversing Using Iterator : 
    Iterator<String> i = names.iterator();
    while(i.hasNext()){
      String next = i.next();
      System.out.println(next);
    }
     System.out.println("-----------------------");
    // Backward traversal of collection LISTITERATOR :
    ListIterator<String> litr = names.listIterator();
    while(litr.hasPrevious()){
     String previous = litr.previous();
     System.out.println(previous);
    }
     System.out.println("-----------------------");

     TreeSet<String> set = new TreeSet();
     set.add("Arjun");
     set.add("Kunal");
     set.add("Babu");
     set.add("Khush");
     set.add("Devil");
     set.forEach(str->{
      System.out.println(str);
     });
   }
  }
