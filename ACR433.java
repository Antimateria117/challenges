import java.util.Scanner;

public class Ej1 {
    public static void main (String [] args) {
        Scanner in = new Scanner(System.in);
        int n = 0;
        n = in.nextInt();
        while (n != 0) {
            int contador=0;
            int i=0;
            while (contador<n) {
                contador = contador + i;
                i++;
            }
            System.out.printf("%d\n", i-1);
            n = in.nextInt();
        }
    }
}