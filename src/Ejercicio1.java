//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;
public class Ejercicio1 {
    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);

        System.out.println("Ingresa un valor: ");
        int num = leer.nextInt();

        if (num > 0)
            System.out.println("El numero es positivo.");
        else if (num < 0)
            System.out.println("El numero es negativo.");
        else
            System.out.println("El numero es 0.");
    }
}