import java.util.Scanner;

public class Currency {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value of money in Indian currency: ");
        int i = sc.nextInt();
        float u = (float) (i / 85.61);
        System.out.println("The value of money in USD currency will be: "+u);
    }
}
