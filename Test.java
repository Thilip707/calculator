import java.util.Scanner;
  public class Test{
      public static void main(String[] args) {
          Scanner personage = new Scanner(System.in);
          System.out.println("please enter your age");
          int age = personage.nextInt();
          System.out.println("your age is: " + age);
      }
  }