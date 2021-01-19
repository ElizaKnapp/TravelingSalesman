import java.util.*;
import java.io.*;

public class TravelingSalesman {
  public static void main(String[] args) throws FileNotFoundException {

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
      line.next();
      int cost = line.nextInt();
      costs[cities.indexOf(city1)][cities.indexOf(city2)] = cost;
      //below adds the reverse to the array
      costs[cities.indexOf(city2)][cities.indexOf(city1)] = cost;
    }
    arrToString(costs);
  }

    public static void arrToString(int[][] arr) {
      System.out.print(" ");
      for (int k = 0; k < arr[0].length; k++) {
        System.out.print("   " + k);
      }
      System.out.println();
      for (int i = 0; i < arr.length; i++) {
        System.out.print(i + " [ ");
        for (int j = 0; j < arr[0].length; j++) {
          String curr = "" + arr[i][j];
          if (curr.length() == 1) {
            System.out.print(curr + "  ");
          } else if (curr.length() ==2) {
            System.out.print(curr + " ");
          } else {
            System.out.print(curr);
          }
          if (j != arr[0].length -1) {
            System.out.print(" ");
          }
        }
        System.out.print(" ]");
        System.out.println();
      }
    }

}
