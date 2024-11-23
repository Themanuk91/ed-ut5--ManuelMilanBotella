import java.util.Scanner;

public class EJ1_RA2 {
    static double abs (double a) { //devuelve el valor absoluto
        if (a < 0)
            return -a; //Si el número es negativo, se convierte en positivo
        else{
            return a; // Si es positivo, devuelve el mismo valor.

        }
    }






public static void main(String[] args) {
    double a;
    Scanner sc = new Scanner(System.in);
    System.out.print("escriba un numero y le devolvera el absoluto: ");
    a = sc.nextDouble();
    abs(a);
    System.out.print("el numero es: " + abs(a));

}
}
