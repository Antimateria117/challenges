import java.util.Scanner;

public class Ej2 {
    public static void main (String [] args) {
        Scanner in = new Scanner(System.in);
        int numCasos = in.nextInt();
        for (int i=0;i<numCasos;i++) {
            int numPalomas = in.nextInt();
            int numCajas = in.nextInt();
            if (numPalomas == numCajas) {
                System.out.println("ROMANCE");
            } else {
                if (numPalomas < numCajas){
                    System.out.println("ROMANCE");
                } else {
                    System.out.println("PRINCIPIO");
                }
            }
            
        }
    }
}