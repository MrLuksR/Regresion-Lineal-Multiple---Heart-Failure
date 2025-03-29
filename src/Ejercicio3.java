import java.util.Scanner;
public class Ejercicio3 {
    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);

        System.out.println("Ingresa un valor entre 0 y 999: ");
        int num = leer.nextInt();

        if (num<0)
            System.out.println("El numero debe ser mayor que 0.");
        if (num>999)
            System.out.println("El numero debe ser menor que 999.");

        if (num >= 0 && num <= 9)
            System.out.println("El numero tiene una cifra.");
        else if (num >= 10 && num <= 99)
            System.out.println("El numero tiene dos cifras.");
        else if (num >= 100 && num <= 999)
            System.out.println("El numero tiene tres cifras.");
    }
}