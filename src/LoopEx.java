import java.util.Scanner;

public class LoopEx {
public static void main(String[] args) {
    Scanner keybd = new Scanner(System.in);
    String answer;
    int numb1, numb2;
       // While loop example
    System.out.println ("/n/nWhile loop example***");
  System.out.println("Do you want to compute?") ;
  System.out.println("What`s good.");
  answer = keybd.nextLine();

while (answer.equalsIgnoreCase("yes")) {
    System.out.println("Enter your first number ");
    numb1 = keybd.nextInt();
    keybd.nextLine();

    System.out.println("Enter your second number ");
    numb2 = keybd.nextInt();
    keybd.nextLine();
    System.out.println(numb1 + " * " + numb2 + " = " + (numb1*numb2));
    System.out.println("Do you want to compute again?");
      answer = keybd.nextLine();

}
}







}






