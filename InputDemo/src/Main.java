// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
package imputdemo;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        // Press Opt+Enter with your caret at the highlighted text to see how
        // IntelliJ IDEA suggests fixing it.
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int myInt=scanner.nextInt();
        System.out.printf("You entered %d.%n%n",myInt);

        System.out.print("Enter a double: ");
        double myDouble=scanner.nextDouble();
        System.out.printf("You entered %.2f.%n%n",myDouble);

        System.out.print("Enter a string: ");
        scanner.nextLine();
        String myString=scanner.nextLine();
        System.out.printf("You entered \"%s\".%n%n",myString);

    }
}