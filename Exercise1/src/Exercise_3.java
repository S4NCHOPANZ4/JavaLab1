import java.util.Scanner;
public class Exercise_3 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("Input a number: ");
        int num = scan.nextInt();
        for (int i=1; i<= 10; i++){
            System.out.printf("%d%s%d%s%d%n",i," x ",num," = ",i*num);
        }
    }
}
