import java.util.Scanner;
import java.util.HashMap;

public class Ej3 {
    public static void main (String [] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext() == true) {
            String n = in.next();
            int [] array = new int [10];
            for (int i=0;i<n.length();i++){
                int j = (int)n.charAt(i)-48;
                array[j]++;                
            }
            int referencia = array[0];
            boolean subnormal = true;
            for (int a=0;a< array.length;a++){
                if (array[a] != referencia){
                    subnormal = false;
                }
            }
            if (subnormal){
                System.out.println("subnormal");
            }else{
                System.out.println("no subnormal");
            }
        }
    }
}