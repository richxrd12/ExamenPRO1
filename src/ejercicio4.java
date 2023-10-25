import java.util.Scanner;

public class ejercicio4 {
    public static void main(String[] args) {

        Scanner base = new Scanner(System.in);

        int puntuacion;

        System.out.println("¿Qué te ha parecido la estancia en Valleseco? Introduzca un número del 0 al 5, siendo el 0 la peor experiencia y el 5 la mejor");
        puntuacion = base.nextInt();

        if(puntuacion > 5 || puntuacion < 0){
            System.out.println("Introduzca un valor válido");
        }
        else if(puntuacion == 5){
            System.out.println("-Fantástico");
        }
        else if(puntuacion == 4){
            System.out.println("-La recomendaré");
        }
        else if(puntuacion == 3){
            System.out.println("-Lo mismo de siempre");
        }
        else if(puntuacion == 2 || puntuacion == 1){
            System.out.println("-Ni fu, ni fa");
        }
        else{
            System.out.println("No vuelvo jamás");
        }
    }
}