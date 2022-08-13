import java.util.HashSet;

public class HashSetNum {
  public static void main(String[] args) {
    HashSet<Integer> numbers = new HashSet();
    numbers.add(12);
    numbers.add(8);
    numbers.add(2);
    numbers.add(23);
    System.out.println("Stored numbers are " + numbers);
  }
}