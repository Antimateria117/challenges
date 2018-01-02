import java.util.Scanner;

public class Ej4 {
    public static void main (String [] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNextInt()){
            double grosor = in.nextDouble();
            double altura = in.nextDouble();
            double dobleces = Math.log((altura/grosor)*1000000)/Math.log(2);
            int veces = (int)Math.ceil(dobleces);
            System.out.println(veces);
        }
    }
}