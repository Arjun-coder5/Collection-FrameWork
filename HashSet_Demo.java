
import java.util.HashSet;

public class HashSet_Demo {
  public static void main(String[] args) {
    HashSet<Double> nms = new HashSet<>();
    nms.add(14.4);
    nms.add(45.7);
    nms.add(new Double(594.6));
    System.out.println(nms);
    
  }
}
