import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class JAVA {
  public static void main(String[] args) {
    System.out.println("# 1. declare and initialize an array");
    int[] scores = {90, 91, 100, 93, 82};
    scores[2] = 10;

    System.out.println(scores);
    for(int i=0; i < scores.length; i++) {
      System.out.println(scores[i]);
    }
    
    System.out.println("\n2. Arrays method: toString(), asList()");
    String[] cars = {"hyundai", "bmw", "benx", "toyota"};
    List<String> car_list = Arrays.asList(cars);
    System.out.println(car_list);
    System.out.println(car_list.get(1)); 
    
    System.out.println("\n3. arrays method: sort(array, comparator), sort(array, int fromindex, int toindex)");
    Arrays.sort(cars);
    System.out.println(Arrays.asList(cars));

    Arrays.sort(cars, Collections.reverseOrder());
    System.out.println(Arrays.asList(cars));
    Arrays.sort(cars, 0, 3);
    System.out.println(Arrays.asList(cars)); 

    System.out.println("#\n4. Arrays method: copyOf, copyOfRange");
    String[] cars_copylist = Arrays.copyOf(cars, 3);
    String[] cars_copylist2 = Arrays.copyOfRange(cars, 0, 2);
    System.out.println(Arrays.asList(cars_copylist2));
    System.out.println(Arrays.asList(cars_copylist));

    }
}