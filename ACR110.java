import java.util.Scanner;
import java.util.ArrayList;

public class ACR110 {
    public static void main (String [] args) {
        Scanner in = new Scanner(System.in);

        ArrayList<Integer> list = new ArrayList<>();
        int numBikes = 0;
        String lineaTiempos = null;
        String [] arrayParciales = new String[3];
        int contadorPeloton = 1;

        while (in.hasNext) {
            numBikes = in.nextInt();
            for (int i=0;i<numBikes;i++) {
                lineaTiempos = in.nextLine();
                arrayParciales = lineaTiempos.split(":");

                list.add(( Integer.parseInt(arrayParciales[0])*3600 +
                 Integer.parseInt(arrayParciales[1])*60 +
                 Integer.parseInt(arrayParciales[2]) ));

                for (int j=0;j<list.size();j++) {
                    if (!j.equals(list.size()-1)) {
                        if ((j+1)-j <= 1) {
                            System.out.println(contadorPeloton)

                        }
                    }
                }
            }
        }
    }
}