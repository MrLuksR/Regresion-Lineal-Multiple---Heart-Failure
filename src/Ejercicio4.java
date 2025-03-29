import java.util.Scanner;
public class Ejercicio4 {
    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);

        System.out.println("Ingresa el primer valor: ");
        int num1 = leer.nextInt();

        System.out.println("Ingresa el segundo valor: ");
        int num2 = leer.nextInt();

        System.out.println("Ingresa el tercer valor: ");
        int num3 = leer.nextInt();

        if (num1 > num2 && num1 > num3)
            System.out.println(num1 +" es el mayor.");
        if (num2 > num1 && num2 > num3)
            System.out.println(num2 +" es el mayor.");
        if (num3 > num1 && num3 > num2)
            System.out.println(num3 +" es el mayor.");
    }
}