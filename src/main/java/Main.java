
/**
 *
 * @author ramon
 */
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double a, b, c, troca;

        a = scanner.nextDouble();
        b = scanner.nextDouble();
        c = scanner.nextDouble();

 
        if (a < b) {
            troca = a;
            a = b;
            b = troca;
        }
        if (a < c) {
            troca = a;
            a = c;
            c = troca;
        }
        if (b < c) {
            troca = b;
            b = c;
            c = troca;
        }
        if (a >= b + c) {
            System.out.println("NAO FORMA TRIANGULO");
        } else {
            if (a * a == b * b + c * c) {
                System.out.println("TRIANGULO RETANGULO");
            } else {
                if (a * a > b * b + c * c) {
                    System.out.println("TRIANGULO OBTUSANGULO");
                } else {
                    System.out.println("TRIANGULO ACUTANGULO");                }
            }
            if (a == b && b == c) {
                System.out.println("TRIANGULO EQUILATERO");
            } else {
                if (a == b || a == c || b == c) {
                    System.out.println("TRIANGULO ISOSCELES");
                }
            }
        }
    }
}
