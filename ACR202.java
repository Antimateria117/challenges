import java.util.Scanner;
public class ACR202 {
  public static void main(String [] args){
    Scanner in = new Scanner(System.in);
    long a,b,r;
    while(in.hasNext()){
      a = in.nextLong();
      b = in.nextLong();
      if (a==0 & b==0)
        break;
      if (b==0){
        System.out.println(0);
      }else{
        long r;
        System.out.println(r);
      }
    }
  }

  public static long f (long n){
    long ac = 1;
    for(long i=1;i<=n;i++){
      ac = ac*i;
    }
    return ac;
  }
}
