import java.util.Scanner;

public class Ej5 {
    public static void main (String [] args) {
        Scanner in = new Scanner(System.in);
        int numCasos = in.nextInt();
        for (int i=0;i<numCasos;i++){
            String hora = in.next();
            String [] partes = hora.split(":");
            int horas = 23;
            horas = horas - Integer.parseInt(partes[0]);

            int minutos = 59;
            minutos = minutos - Integer.parseInt(partes[1]);
            

            int segundos = 59;
            segundos = segundos - Integer.parseInt(partes[2])+1;
            
            
            String horasS = Integer.toString(horas);
            if (horas < 10){
                horasS = "0"+horasS;
            }
            
            String minutosS = Integer.toString(minutos);
            if (minutos < 10){
                minutosS = "0"+minutosS;
            }

            String segundosS = Integer.toString(segundos);
            if (segundos < 10){
                segundosS = "0"+segundosS;
            }

            System.out.println(horasS + ":" + minutosS + ":" + segundosS);
        }
    }
}