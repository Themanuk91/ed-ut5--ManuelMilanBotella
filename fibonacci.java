import java.util.Scanner;

public class fibonacci {
    static float fibonacci(int n) {
        float i;
        if (n == 0 || n == 1)
            i = n;
        else
            i = fibonacci(n - 1) + fibonacci(n - 2);
        return i;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("elige la anotacion posicional de la serie de fibonacci: ");
        int n = sc.nextInt();
        System.out.println("el termino de la serie de Fibonacci que has elegido es : " + fibonacci(n));
        System.out.println("el enésimo término de la serie de Fibonacci es " + fibonacci(11));

    }
}
