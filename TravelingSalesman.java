import java.util.*;
import java.io.*;

public class TravelingSalesman {
  public static void main(String[] args) throws FileNotFoundException{

    //here is the arraylist of cities
    Scanner scanner = new Scanner(new File("Cities.txt"));
    ArrayList<String> cities = new ArrayList<String>();
    while (scanner.hasNextLine()) {
      Scanner line = new Scanner(scanner.nextLine());
      String city1 = line.next();
      line.next();
      String city2 = line.next();
      if (!cities.contains(city1)) cities.add(city1);
      if (!cities.contains(city2)) cities.add(city2);
    }

    //now that each city is associated with a number in the ArrayList
    scanner = new Scanner(new File("Cities.txt"));
    int length = cities.size();
    int[][] costs = new int[length][length];
    while (scanner.hasNextLine()) {
      Scanner line = new Scanner(scanner.nextLine());
      String city1 = line.next();
      line.next();
      String city2 = line.next();
      int cost = line.nextInt();
      costs[cities.indexOf(city1)][cities.indexOf(city2)] = cost;
      //below adds the reverse to the array
      costs[cities.indexOf(city2)][cities.indexOf(city1)] = cost;
    }


  }
}
