import java.util.*;
import java.io.*;

public class TravelingSalesman {
  public static void main(String[] args) {

    //here is the arraylist of cities
    Scanner scanner = new Scanner (Cities.txt);
    ArrayList<String> cities = new ArrayList<String>();
    while (scanner.hasNextLine()) {
      Scanner line = new Scanner(scanner.NextLine());
      String city1 = line.next();
      line.next();
      String city2 = line.next();
      if (!cities.contains(city1)) cities.add(city1);
      if (!cities.contains(city2)) cities.add(city2);
    }

    //
  }
}
