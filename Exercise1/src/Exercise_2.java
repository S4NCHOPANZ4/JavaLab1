import java.util.Scanner;
public class Exercise_2 {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        System.out.print("Input the cents: ");
        float cents = scan.nextInt();
        float dollars,coins,minicoins;
        minicoins = cents%10;
        cents = cents/10;
        coins = cents%10;
        cents =cents/10;
        dollars =cents%10;
        System.out.printf("%s%.0f%s%.0f%.0f%s","The value is ",dollars," and ",coins,minicoins," cents");
    }
}
