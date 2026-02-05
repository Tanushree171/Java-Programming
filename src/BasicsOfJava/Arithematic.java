package BasicsOfJava;
import java.util.Scanner;
public class Arithematic {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = a+b ;
        System.out.println("The sum is: "+c);
    }
}
