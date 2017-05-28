import java.util.Scanner;

public class aviones {
  public static void main (String [] args) {
    Scanner in = new Scanner (System.in);
    String pista;
    while (in.hasNext()) {
      pista = in.next();
      String numero = pista.substring(0,pista.length());
      int n1 = (int)numero.charAt(0)-48;
      int n2 = (int)numero.charAt(1)-48;
      int n = n1*10+n2;
      int opuesto=0;
      if (n>= 1 && n <=18)
        opuesto = n + 18;
      if (n> 18 && n <=36)
        opuesto = n-18;
      if (n>= 1 && n <= 36){
        if (opuesto<10)
          System.out.print(0);
        System.out.print(opuesto);
      }
      char r = 'R';
      char l = 'L';
      char c = 'C';
      if (pista.length()==3 & n>= 1 && n <= 36){
        if (pista.charAt(2) == r)
          System.out.print("L");
        if (pista.charAt(2) == l)
          System.out.print("R");
        if (pista.charAt(2) == c)
          System.out.print("C");
      }
      if (n>= 1 && n <= 36)
        System.out.println();
    };
  }
}
