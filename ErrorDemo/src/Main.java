import java.util.InputMismatchException;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
       int choice=0;
       int[] arr={1,2,3,4,5};
       Scanner scanner=new Scanner(System.in);
       try{
           System.out.print("Enter a choice: ");
           choice=scanner.nextInt();
           if(choice==0){
               throw new ArrayIndexOutOfBoundsException();
           }
           System.out.printf("The number at chosen index is %d.",arr[choice]);
       }catch(ArrayIndexOutOfBoundsException e){
           System.out.println("Error: Given is choice is out of bounds.");
       }catch (InputMismatchException e){
           System.out.println("Error: This program expects the choice to be of integer type");
       }catch(Exception e){
           System.out.println(e.getMessage());
       }
    }
}