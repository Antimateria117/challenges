/* 
 La primera antena solo puede comprobar con la distancia de la derecha.
 La ultima antena solo puede comparar con la distancia de la izquierda. 

 El resto de casos, primero se calcula la distancia entre las antenas,
 luego se mira si esa distancia es mayor o igual a la distancia de la izda, si es asi
 se puede pasar a la siguiente antena, sino se tiene que comprobar la siguiente antena por la parte
 izda, si no lo cumple podemos parar de comprobar y escribir un no, sino, tenemos que seguir. 
*/

import java.util.Scanner;

public class ACR389 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int entrada = in.nextInt();
        for (int i=0;i<entrada; i++ ) {
            int longitudTunel = in.nextInt();
            int numeroAntenas = in.nextInt();

            for (int j=0;j<numeroAntenas;j++) {
                
            }
        }
    }
}