package guiaPseudocodigo;

import java.util.Random;

public class Arreglo {
	
	public int[] ArrayCreator() {
		
		int[] arreglo = new int[5];
		Random rnd = new Random();
		//System.out.println(rnd.nextInt(10));
		for (int i = 0; i < arreglo.length; i++) {
			
			arreglo[i]= rnd.nextInt(20);
			//System.out.println(arreglo[i]);
		}
		return arreglo;
	}//fin de arrayCreator
	
	
	public int[] OrdenarAscendente(int array[]) {
		int aux;
		for (int i = 0; i < array.length; i++) {
			for (int j = i+1; j < array.length; j++) {
				
				if (array[i]>array[j]){
					aux=array[i];
					array[i]=array[j];
					array[j]=aux;
				}
				
			}
			
		}
		return array;
	
	}

}
