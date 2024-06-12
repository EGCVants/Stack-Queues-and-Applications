import java.io.InputStream; //Needed to read text file
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    System.out.println("1) Base counter");
    System.out.println("2) Postfix calculator");

    Scanner sc = new Scanner(System.in);
    if (!sc.hasNextInt()) {
      System.err.println("Invalid choice");
      System.exit(1);
    }
    int choice = sc.nextInt();
    switch (choice) {
      case 1 -> baseCounter();
      case 2 -> postfixCalculator();
      default -> {
        System.out.println("Invalid choice");
        System.exit(1);
      }
    }
  }

  private static void baseCounter() {
    //Code from slides: 28-31
    InputStream is = baseCounterCalc.class.getResourceAsStream("base_test.txt");
    Scanner sc = new Scanner(is);
    int base = sc.nextInt();
    int number = sc.nextInt();
    baseCounterCalc calc = new baseCounterCalc(base, number);//create obj
    calc.calculate(); //method call to base count
  }

  private static void postfixCalculator() {
    postFixCalc calc = new postFixCalc();
    InputStream is = postFixCalc.class.getResourceAsStream("postfix_test.txt");
    Scanner sc = new Scanner(is);
    calc.calculate(is,  sc);//method to do the rest of postfix in class
  }
}