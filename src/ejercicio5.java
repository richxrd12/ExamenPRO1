import java.util.Scanner;

public class ejercicio5 {
    public static void main(String[] args) {

        Scanner base = new Scanner(System.in);

        int userYear;

        System.out.println("Escriba su año de nacimiento ");
        userYear = base.nextInt();

        int userYearsOld = 2023 - userYear;

        if(userYear >= 1970 && userYear < 1980){
            System.out.println("Eres un@ babyboomer de " + userYearsOld + " años.");
        }
        else if(userYear >= 1980 && userYear < 1990){
            System.out.println("Eres un@ ochentero de " + userYearsOld + " años.");
        }
        else if(userYear >= 1990 && userYear < 2000){
            System.out.println("Eres un@ final de siglo de " + userYearsOld + " años.");
        }
        else if(userYear < 1970 || userYear > 2023){
            System.out.println("Introduzca un valor váludo");
        }
        else{
            System.out.println("Eres un pipiolo de " + userYearsOld + " años.");
        }
    }
}