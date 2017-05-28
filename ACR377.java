import java.util.Scanner;
import java.math.*;

public class cuadrados {
  public static void main (String [] args) {
    Scanner in = new Scanner(System.in);
    while (in.hasNext()){
      String n = in.next();
      BigInteger numero = new BigInteger(n);
      int numero_decimal = numero.intValue();
      String numero_hex = Integer.toHexString(numero_decimal);
      int letra_final = (int)(numero_hex.charAt(numero_hex.length()-1));
      if (letra_final == 48 || letra_final == 49 || letra_final == 52 || letra_final == 57) {
        System.out.println("NO SE");
      }else{
        System.out.println("IMPERFECTO");
      }
    }
  }
}
