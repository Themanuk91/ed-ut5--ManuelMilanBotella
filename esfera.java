import java.util.Scanner;
public class esferamodificado {

    /*Calcula la superficie de la esfera*/
    public float superficie(float r) {
        double superficie = 4 * Math.PI * Math.pow(r, 2);
        return (float) superficie; // superficie == 4 * PI * radio al cuadrado
    }

    /*calcula el volumen de la esfera*/
    public double volumen(float r) {
        double volumen = (4.0 / 3.0) * Math.PI * Math.pow(r, 3); // volumen == 4/3 * PI * radio al cubo
        return volumen;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Diga el radio: ");
        float r = sc.nextFloat();
        esfera esfera = new esfera();

        // Calcular y mostrar la superficie
        float superficie = esfera.superficie(r);
        System.out.printf("La superficie es: %.2f%n", superficie);
        /* Uso de printf permite formatear la salida con dos decimales
        * el%.2f%n hace que se imprima un número flotante con dos decimales*/

        // Calcular y mostrar el volumen
        double volumen = esfera.volumen(r);
        System.out.printf("El volumen es: %.2f%n", volumen);
        /* Uso de printf permite formatear la salida con dos decimales
         * el%.2f%n hace que se imprima un número flotante con dos decimales
         * ejemplo si el resultado es: 314.15927 se imprimiria 314.16*/

        sc.close(); /*Cerrar el Scanner*/
    }
}
