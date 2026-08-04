// Thanyathon Kitsakun
// 6887101
import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter your number: ");
        double n1 = in.nextDouble();
        System.out.print("Enter your number: ");
        Double n2 = in.nextDouble();
        System.out.print("Enter your case: ");
        int c = in.nextInt();

        switch (c) {
            case 1:
                System.out.print(n1 + n2);
                break;
            case 2:
                System.out.print(n1 - n2);
                break;
            case 3:
                System.out.print(n1 * n2);
                break;
            case 4:
                System.out.print(n1 / n2);
                break;
            default:
                System.out.print("Invalid operation");
        }

        in.close();
    }
}