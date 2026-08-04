// Thanyathon Kitsakun
// 6887101
import java.util.Scanner;

public class Task2and3 {
    public static void main(String[] args){
        System.out.print("=== Welcome to Customized Wallpaper System ===");
        System.out.println("We have 3 popular styles here:");
        System.out.println("=== Style 1 ===");

        int total = 0, i, j,  k;
        for (i = 1; i <= 5; i++ ){
            for (j = 1; j <= i; j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }

        System.out.println("=== Style 2 ===");
        for (i = 1; i <= 5; i++){
            for (j = 2; j <= i; j++){

                System.out.print("  ");
            }
            for (k = 5 - i; k >= 0; k--){
                System.out.print("_ ");
            }
            System.out.println();
        }

        System.out.println("=== Style 3 ===");
        for (i = 1; i <= 5; i++){
            for (j = 1; j <= i; j++){

                System.out.print(j+" ");
            }
            for (k = 5 - i; k >= 1; k--){
                System.out.print("_ ");
            }
            System.out.println();
        }
        Scanner scanner = new Scanner(System.in);
        while (true) {
        System.out.print("Please choose your style: ");
        int style = scanner.nextInt();
        System.out.print("\nSize: ");
        int size = scanner.nextInt();
        System.out.print("\nSymbol: ");
        String symbol = scanner.next();
        
        if (style == 1){
            for (i = 1; i <= size; i++ ){
            for (j = 1; j <= i; j++){
                System.out.print(j+" ");
            }
            System.out.println();
            }
            total += 100;
        }
        else if (style == 2){
            for (i = 1; i <= size; i++){
                for (j = 2; j <= i; j++){

                    System.out.print("  ");
                }
                for (k = size - i; k >= 0; k--){
                    System.out.print(symbol+" ");
                }
            System.out.println();
            }
            total += 200;
        }
        else if (style == 3){
            for (i = 1; i <= size; i++){
                for (j = 1; j <= i; j++){

                    System.out.print(j+" ");
                }
                for (k = size - i; k >= 1; k--){
                    System.out.print(symbol+" ");
                }
            System.out.println();
            }
            total += 300;
        }
        else {
            System.out.print("Bye");
            System.out.print("\nTotal Bill: "+total);
            break;
            
        }
        }
        scanner.close();
    }
}