import java.util.Scanner;
public class Ejercicio2 {
    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);

        System.out.println("Ingresa un valor: ");
        int num = leer.nextInt();

        if (num % 2 == 0)
            System.out.println("El numero es par.");
        else
            System.out.println("El numero es impar.");
    }
}