import java.util.Scanner;
public class Ejercicio5 {
    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);

        System.out.println("Ingresa tu peso en kg: ");
        int peso = leer.nextInt();

        System.out.println("Ingresa tu altura en m: ");
        double alt = leer.nextDouble();

        double imc = peso / (alt*alt);

        System.out.println("IMC: " + imc);

        if (imc < 18.49)
            System.out.println("Bajo peso.");
        else if (imc >= 18.5 && imc < 24.99)
            System.out.println("Peso normal.");
        else if (imc >= 25 && imc < 29.99)
            System.out.println("Obesidad leve.");
        else if (imc >= 30 && imc < 34.99)
            System.out.println("Obesidad media.");
        else if (imc >= 40)
            System.out.println("Obesidad morbida.");
    }
}