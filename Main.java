import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    try (Scanner input = new Scanner(System.in)) {
        System.out.print("Enter the side: ");
        double side = input.nextDouble();

        // Calculate the area of the hexagon
        double area = (3 * Math.sqrt(3) / 2) * Math.pow(side, 2);

        // Display the result
        System.out.println("The area of the hexagon is " + area);
    }
  }
}