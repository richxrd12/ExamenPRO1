import java.util.Scanner;

public class ejercicio3 {
    public static void main(String[] args) {

        Scanner base = new Scanner(System.in);

        int THIS_YEAR = 2023;
        String firstName, secondName, thirdName;
        int firstYear, secondYear, thirdYear;

        System.out.println("Escriba el nombre de la primera persona y su año de nacimiento en ese orden");
        firstName = base.next();
        firstYear = base.nextInt();

        System.out.println("Escriba ahora el nombre de la segunda persona y su año de nacimiento");
        secondName = base.next();
        secondYear = base.nextInt();

        System.out.println("Por último, escriba el nombre de la tercera persona y su año de nacimiento");
        thirdName = base.next();
        thirdYear = base.nextInt();

        int firstYearsOld, secondYearsOld, thirdYearsOld;

        firstYearsOld = THIS_YEAR - firstYear;
        secondYearsOld = THIS_YEAR - secondYear;
        thirdYearsOld = THIS_YEAR - thirdYear;

        if(firstYearsOld > secondYearsOld && firstYearsOld > thirdYearsOld){
            if(secondYearsOld > thirdYearsOld){
                System.out.println(firstName + " " + firstYearsOld + " años, " + secondName + " " + secondYearsOld + " años y " + thirdName + " " + thirdYearsOld + " años");
            }
            else{
                System.out.println(firstName + " " + firstYearsOld + " años, " + thirdName + " " + thirdYearsOld + " años y " + secondName + " " + secondYearsOld + " años");
            }
        }
        else if (secondYearsOld > firstYearsOld && secondYearsOld > thirdYearsOld){
            if(firstYearsOld > thirdYearsOld){
                System.out.println(secondName + " " + secondYearsOld + " años, " + firstName + " " + firstYearsOld + " años y " + thirdName + " " + thirdYearsOld + " años");
            }
            else{
                System.out.println(secondName + " " + secondYearsOld + " años, " + thirdName + " " + thirdYearsOld + " años y " + firstName + " " + firstYearsOld + " años");
            }
        }
        else if(thirdYearsOld > firstYearsOld && thirdYearsOld > secondYearsOld){
            if(firstYearsOld > secondYearsOld){
                System.out.println(thirdName + " " + thirdYearsOld + " años, " + firstName + " " + firstYearsOld + " años y " + secondName + " " + secondYearsOld + " años");
            }
            else{
                System.out.println(thirdName + " " + thirdYearsOld + " años, " + secondName + " " + secondYearsOld + " años y " + firstName + " " + firstYearsOld + " años");
            }
        }
        else{
            System.out.println("Todos tienen la misma edad");
        }
    }
}