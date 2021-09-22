import java.util.Scanner;

class Main {
  public static void main(String[] args) {
     Scanner s = new Scanner(System.in);
    System.out.println("Enter three whole number");
    int number1;
     number1=s.nextInt();
     int number2;
     number2=s.nextInt();
     int number3;
     number3=s.nextInt();

if (number3> number2 && number3>number1)
  System.out.println("The biggest number you entered is "+number3);
  else if (number2> number1 && number2>number3)
  System.out.println("The biggest number you entered is "+number2);
  else if (number1> number2 && number1>number3)
  System.out.println("The biggest number you entered is "+number1);
  }
}


