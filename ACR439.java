import java.util.Scanner;

public class Ej7 {
    public static void main (String [] args) {
        Scanner in = new Scanner(System.in);
        String casos=in.nextLine();
        int numCasos = Integer.parseInt(casos);
        for(int i=0;i<numCasos;i++) {
            String frase = in.nextLine();
            String [] igualdades = frase.split(" ");
            String [] ln1 = igualdades[0].split("=");
            String [] ln2 = igualdades[1].split("=");
          
            
            if (ln1[0].equals("D") & ln2[0].equals("T")) {
                System.out.println("V=" + (int)Math.round((double)Integer.parseInt(ln1[1])/Integer.parseInt(ln2[1])));
            }

            if (ln1[0].equals("T") & ln2[0].equals("D")) {
                System.out.println("V=" + (int)Math.round((double)Integer.parseInt(ln2[1])/Integer.parseInt(ln1[1])));
            }

            if (ln1[0].equals("V") & ln2[0].equals("T")) {
                System.out.println("D=" + (int)Math.round((double)Integer.parseInt(ln1[1])*Integer.parseInt(ln2[1])));
            }
            if (ln1[0].equals("T") & ln2[0].equals("V")) {
                System.out.println("D=" + (int)Math.round((double)Integer.parseInt(ln1[1])*Integer.parseInt(ln2[1])));
            }

            if (ln1[0].equals("V") & ln2[0].equals("D")) {
                System.out.println("T=" + (int)Math.round((double)Integer.parseInt(ln2[1])/Integer.parseInt(ln1[1])));
            }
            if (ln1[0].equals("D") & ln2[0].equals("V")) {
                System.out.println("T=" + (int)Math.round((double)Integer.parseInt(ln1[1])/Integer.parseInt(ln2[1])));
            }
        }
    }
}