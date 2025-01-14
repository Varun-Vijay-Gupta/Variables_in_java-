import java.util.Scanner;

public class Simple_Interest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter principle value: ");
        int p = sc.nextInt();
        System.out.print("Enter rate of interest: ");
        int r = sc.nextInt();
        System.out.print("Enter time: ");
        int t = sc.nextInt();

        double si = (p * r * t)/100;
        System.out.println("simple interest: "+si);

        }
}
