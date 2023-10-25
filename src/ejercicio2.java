import java.util.Scanner;
import static java.lang.Math.*;

public class ejercicio2 {
    public static void main(String[] args) {

        Scanner base = new Scanner(System.in);

        int readNum;

        System.out.println("Escriba un número de 3 cifras");
        readNum = base.nextInt();

        int centena, decena, unidad;

        if (readNum < 100) {
            System.out.println("Escribe un número mayor que 99");
        }
        else{
            centena = readNum / 100;

            decena = (readNum - (centena * 100)) / 10;

            unidad = (readNum - ((centena * 100) + (decena * 10)));

            System.out.println("centenas " + centena + " decenas " + decena + " unidades " + unidad);
        }

    }
}