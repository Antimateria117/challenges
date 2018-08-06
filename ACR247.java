import java.util.Scanner;

public class ACR247 {
    public static void main (String [] args) {
        Scanner in = new Scanner(System.in);
        String message = null;
        boolean crece = true;
        String leerFinal = null;
        int contador = in.nextInt();
        while (contador != 0) {
            int anterior = 0;
            if (contador == 1) {
                crece = false; 
                leerFinal = in.nextLine();
                leerFinal = in.nextLine();
            } else {
                for (int i=0;i<contador;i++) {
                    int actual = in.nextInt();
                    //System.out.printf("%d-%d\n", anterior, actual);
                    if (i != 0 | i != contador-1){
                        if (actual <= anterior) {
                            leerFinal = in.nextLine();
                            crece = false;
                            break;
                        }
                    }
                    anterior = actual;
                }
            }
            message = crece ? "SI" : "NO";
            System.out.println(message);
            crece = true;
            contador = in.nextInt();
        } 
    }
}