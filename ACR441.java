import java.math.BigInteger;
import java.util.Scanner;

public class Ej9 {
    public static void main (String [] args) {
        Scanner in = new Scanner(System.in);

        while (in.hasNextLine()) {
            String numero = in.nextLine();
            if (numero.contains(".")){
                System.out.println(numero);
                String [] numSin = numero.split(".");
                System.out.println(numSin[0]);
                String n="";
                for (int i=0;i<numSin.length;i++){
                    System.out.println(numSin[i]);
                    n=n+numSin[i];
                }
                BigInteger num = new BigInteger(n);
                num.add(new BigInteger("1"));
                n=num.toString();

                for (int j=0;j<n.length();j++){
                    for (int a=0;a<3;a++){
                        System.out.print(n.charAt(j));
                    }
                    System.out.print(".");
                }
            }else{
                System.out.println(Integer.parseInt(numero)+1);
            }
            
        }
    }
}