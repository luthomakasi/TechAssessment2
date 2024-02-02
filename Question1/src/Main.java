import java.util.Scanner;

public class Main {
    public boolean isSixtyFive(int num1, int num2){
        if(num1 == 65 || num2 == 65 || num1 + num2 == 65){
            return true;
        }else {
            return false;
        }
    }
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter first number: ");
        int num1 = scan.nextInt();

        System.out.println("Enter Second number: ");
        int num2 = scan.nextInt();


        Main main = new Main();


        System.out.println(main.isSixtyFive(num1, num2));
    }
}