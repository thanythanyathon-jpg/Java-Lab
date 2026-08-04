// Thanyathon Kitsakun
// 6887101
import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        // Task 1
        System.out.print("Please enter your weight: ");
        double w1 = in.nextDouble();
        System.out.print("Please enter your weight: ");
        double w2 = in.nextDouble();
        System.out.print("Please enter your weight: ");
        double w3 = in.nextDouble();
        System.out.print("Please enter your weight: ");
        double w4 = in.nextDouble();
        System.out.print("Please enter your height: ");
        double h1 = in.nextDouble();
        System.out.print("Please enter your height: ");
        double h2 = in.nextDouble();
        System.out.print("Please enter your height: ");
        double h3 = in.nextDouble();
        System.out.print("Please enter your height: ");
        double h4 = in.nextDouble();
    
        System.out.printf("The average weight " + "%.2f", (w1 + w2 + w3 + w4)/4);
        System.out.printf("\nThe average weight " + "%.2f", (h1 + h2 + h3 + h4)/4);

        // Task 2
        System.out.print("\nInput the money: ");
        int money = in.nextInt();
        int coin10 = money / 10;

        int money2 = money - (coin10 * 10);
        int coin5 = money2 / 5;

        int coin1 = money2 - (coin5 * 5);


        System.out.printf("10: " + coin10 + "\n5: " + coin5 + "\n1: " + coin1);
        
        // Task 3
        System.out.print("\nInput the price: ");
        int price = in.nextInt();

        if (price >= 1000){
            double final_price = price - (price * 20 / 100);
            System.out.print(final_price);}
        else if (price > 100 & price < 1000){
            double final_price = price - (price * 20 / 100);
            System.out.print(final_price);}
        else if (price > 50 & price < 100){
            double final_price = price - (price * 20 / 100);
            System.out.print(final_price);}
        else {
            double final_price = price;
            System.out.print(final_price);}
        in.close();
    }
}
    

