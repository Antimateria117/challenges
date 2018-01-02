import java.util.Scanner;

public class Ej6 {
    public static void main (String [] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNextLine()) {
            String frase = in.nextLine();
            int letras=0;
            int exclamacion=0;
            for (int i=0;i<frase.length();i++){
                if ((int)frase.charAt(i) >= 65 & (int)frase.charAt(i) <= 90){
                    letras++;
                }
                if ((int)frase.charAt(i) >= 97 & (int)frase.charAt(i) <= 122){
                    letras++;
                }
                if ((int)frase.charAt(i) == 33){
                    exclamacion++;
                }
            }
            if (exclamacion>letras) {
                System.out.println("ESGRITO");
            }else {
                System.out.println("escrito");
            }
        }
    }
}