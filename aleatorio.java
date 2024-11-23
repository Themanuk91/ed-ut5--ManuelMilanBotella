import java.util.Scanner;

public class aleatorio {
    static void NumAleatorio(int n, int min, int max) {
        for (int i=0; i<n; i++) {
            System.out.print(min + (int)(Math.random() * (max - min +1)) + "\t");
            // int para qeu salga un entero , min es partir del minimo para que de el maximo hacemos max - min +1 para que salga el maxim
            //t es para el espacio

        }
        System.out.println("\n");
    }
    static void NumAleatorio(int n) {
        for (int i=0; i<n; i++) {
            System.out.print(Math.random() + "\t");
        }
    }
    public static void main(String[] args) {
        int cant, min, max;
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduzca la cantidad de numeros: ");
        cant = sc.nextInt();
        System.out.print("Introduzca la minima: ");
        min = sc.nextInt();
        System.out.print("Introduzca la maxima: ");
        max = sc.nextInt();

        NumAleatorio(cant, min, max);
        NumAleatorio(cant);

    }
}
