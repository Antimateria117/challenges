import java.util.*;

public class Problema108 {
	public static void main (String [] args) {
		Scanner in = new Scanner(System.in);
		
		ArrayList<String> almacen = new ArrayList<String>();
		ArrayList<String> almacenDias = new ArrayList<String>();
		ArrayList<Double> almacenGastos = new ArrayList<Double>();
		String tmp = "";

		while (in.hasNext()){
			almacenDias.add(in.next());
			almacenGastos.add(Double.parseDouble(in.next()));
		}
		
		double min = almacenGastos.get(0), max = 0;
		int tamaño = almacenDias.size();
		int i=0, contadorN=0, contadorComidas = 0;
		String diaMax="", diaMin=almacenDias.get(0);

		for (int j=0;j<tamaño;j++){
			if ((almacenDias.get(j)).equals("N")){
				contadorN++;
			}
		}

		double minTmp, maxTmp;
		for (int contador=0;contador<contadorN;contador++){
			while (!almacenGastos.get(i).equals(0.0)){
				if (almacenGastos.get(i) > max){
					max = almacenGastos.get(i);
					diaMax = almacenDias.get(i);
				}
				if (almacenGastos.get(i) < min){
					min = almacenGastos.get(i);
					diaMin = almacenDias.get(i);
				}
				i++;
			}
			almacen.add(diaMax);
			almacen.add(diaMin);
			i++;
			if (i != tamaño){
				minTmp = min;
				min = almacenGastos.get(i);
				maxTmp = max;
				max = 0;
				diaMin = almacenDias.get(i);
			}
		}
	
		i=0;
		int contadorMax = 0, contadorMin =0;
		for (int contador=0;contador<contadorN;contador++){
			while (!almacenGastos.get(i).equals(0.0)){
				if (almacenGastos.get(i) == maxTmp){
					contadorMax++;
				}
				if (almacenGastos.get(i) == minTmp){
					contadorMin++;
				}
				i++;
			}
			if (contadorMax >= 2){
				almacen.add(contador, "EMPATE");
			}
			if (contadorMin >= 2){
				almacen.add(contador+1, "EMPATE");
			}
			contadorMax=0;
			contadorMin=0;
			i++;
		}
		for (int k=0;k<almacen.size()/2;k++){
			System.out.println(almacen.get(k) + "#" + almacen.get(k+1));
		}

	}
}




















