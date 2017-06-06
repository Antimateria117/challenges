import java.util.Scanner;

public class ACR222 {
  public static void main (String [] args) {
    Scanner in = new Scanner(System.in);
    int b,p,s;
    while (in.hasNextInt()){
      b = in.nextInt();
      p = in.nextInt();
      if (b==1)
        System.out.println(p+1);
      else{
	s = ((1-(int)Math.pow(b,p+1))/(1-b))%1000007;
        System.out.println(s);
      }
    }
  }
}
