import java.util.Scanner;

public class Exercise_1 {

    public static void main(String[] args) throws Exception {
        double pi = Math.PI;
        Scanner scan = new Scanner(System.in);
        System.out.print("Input the radius: ");
        int radius = scan.nextInt();
        double area = pi*Math.pow(radius,2);
        System.out.printf("%s%d%s%f","The radius is, ",radius," The area is: ",area);
    }
}
