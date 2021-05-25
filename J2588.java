import java.util.Scanner;

public class J2588 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num1 = scan.nextInt();
        int num2 = scan.nextInt();

        System.out.println(num2%10*num1);
        System.out.println((num2/10)%10 * num1);
        System.out.println((num2/100) * num1);
        System.out.println(num2*num1);
        scan.close();
    }
}
