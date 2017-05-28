import java.util.Scanner;
 public class marypopins{
   public static void main (String [] args){
     Scanner in = new Scanner(System.in);
     int n = in.nextInt();
     for (int j=0;j<n;j++){
       String line = in.next();
       char letra = line.charAt(0);
       int letra_numero = (int)letra;
       boolean mayuscula = false;
       if (letra_numero >= 65 && letra_numero <= 90){
         mayuscula = true;
       }
       String aux = line.toLowerCase();
       String aux1 = "";
       for (int i=aux.length()-1;i>=0;i--){
         aux1 = aux1 + aux.charAt(i);
       }
       if (mayuscula == true){
         char letra_primera = aux1.charAt(0);
         int valor_letra_primera = (int)letra_primera - 32;
         letra_primera = (char)(valor_letra_primera);
         aux1 = aux1.substring(1, aux1.length());
         System.out.println(letra_primera + aux1);
       }else{
        System.out.println(aux1);
       }
     }
   }
 }
