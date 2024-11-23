/*Escribe un programa que solicite varios números por teclado y que te permitan probar 10 de estas
        funciones (a tu elección), distintas a las mencionadas anteriormente. Escribe un comentario al
        lado de la llamada a cada función que explique qué realiza cada función.
*/
import java.util.Scanner;

public class Clase_math {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); //vamos añadir los numeros que vamos a utilizar, he puesto 4 porque ha dicho varios
        System.out.print("Ingrese el primer numero: ");
        double num1 = sc.nextDouble(); //numero 1
        System.out.print("Ingrese el segundo numero: ");
        double num2 = sc.nextDouble(); //numero 2
        System.out.print("Ingrese el tercer numero: ");
        double num3 = sc.nextDouble(); // numero 3
        System.out.print("Ingrese el quarto numero: ");
        double num4 = sc.nextDouble(); // numero 4

        System.out.println("pruebas de  la clase Math de las API de java");

        // el primero a probar es abs de static double
        System.out.println("valor absoluto del primer numero es " + Math.abs(num1));
        System.out.println("valor absoluto del segundo numero es " + Math.abs(num2));
        System.out.println("valor absoluto del tercer numero es " + Math.abs(num3));
        System.out.println("valor absoluto del quarto numero es " + Math.abs(num4));
        //segundo a probar cbrt del static double que devuelve la raiz cubica
        System.out.println("la raiz cubica del primer numero es " + Math.cbrt(num1));
        System.out.println("la raiz cubica del segundo numero es " + Math.cbrt(num2));
        System.out.println("la raiz cubica del tercer numero es " + Math.cbrt(num3));
        System.out.println("la raiz cubica del tercer numero es " + Math.cbrt(num4));
        // tercero para probar ceil Muestra el número entero más pequeño que no sea menor que el número determinado (se redondea hacia arriba).
        System.out.println("el entero mas cercano  del primero es: " + Math.ceil(num1));
        System.out.println("el entero mas cercano  del segundo es: " + Math.ceil(num2));
        System.out.println("el entero mas cercano  del tercer es: " + Math.ceil(num3));
        System.out.println("el entero mas cercano  del cuarto es: " + Math.ceil(num4));
        // el cuarto a probar es copysign que devuelve un valor flotante que consiste en el valor del primer parámetro y el signo(+/-) del segundo parámetro
        System.out.println("el valor del primer numero y el signo del segundo es: " + Math.copySign(num1, num2));
        System.out.println("el valor del primer tercero y el signo del cuarto es: " + Math.copySign(num3, num4));
        // el quinto a probar es exp que devuelve el número de Euler e elevado a la potencia de un doublevalor.
        System.out.println("el Euler elevado al primer numero  es: " + Math.exp(num1));
        System.out.println("el Euler elevado al segundo numero  es: " + Math.exp(num2));
        System.out.println("el Euler elevado al tercer numero  es: " + Math.exp(num3));
        System.out.println("el Euler elevado al cuarto numero  es: " + Math.exp(num4));
        // el sexto a probar es floor  redondea un número al múltiplo o al entero inferior más próximo de la cifra significativa especificada.
        System.out.println("redondea la multiplo o al entero inferior mas cercano del primer numero : " + Math.floor(num1));
        System.out.println("redondea la multiplo o al entero inferior mas cercano del segundo numero : " + Math.floor(num2));
        System.out.println("redondea la multiplo o al entero inferior mas cercano del tercer numero : " + Math.floor(num3));
        System.out.println("redondea la multiplo o al entero inferior mas cercano del cuarto numero : " + Math.floor(num4));
        // el septimo a probar es fma Devuelve la multiplicación y la suma fusionadas de los tres argumentos; es decir, devuelve el producto exacto de los dos primeros argumentos sumados con el tercer argumento y luego redondeado una vez al número más cercano double.
        System.out.println("la multiplicaciom y sumas fusionadas de primer numero, el segundo y el tercer " + Math.fma(num1, num2, num3));
        // el octavo a probar es log Devuelve el logaritmo natural (base e ) de un double valor.
        System.out.println("el logaritmo del primer numero es " + Math.log(num1));
        System.out.println("el logaritmo del segundo numero es " + Math.log(num2));
        System.out.println("el logaritmo del tercero numero es " + Math.log(num3));
        System.out.println("el logaritmo del cuarto numero es " + Math.log(num4));
        //  el noveno a probar es max devuelve el mayor de dos floatvalores.
        System.out.println("el mayor de primero y el segundo es: "  + Math.max(num1, num2));
        System.out.println("el mayor de tercero y el cuarto es: "  + Math.max(num3, num4));
        // el decimo a probar es min Devuelve el menor de dos floatvalores.
        System.out.println("el menor de primero y el segundo es: "  + Math.min(num1, num2));
        System.out.println("el menor de tercero y el cuarto es: "  + Math.min(num3, num4));





    }
}
