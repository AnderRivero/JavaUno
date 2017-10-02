package guiaPseudocodigo;

public class NumeroPrimo {

	public boolean VerificarNum(int num) {
		
		int i=0;
		//int resto;
		//boolean
		 
		for (int j = 1; j < num; j++) {
			//resto= num % j;
			if ((num % j)==0) {
				i++;
			}//fin del if
		}//fin del for
		
		
		if (i<=2) {             //
			return true;
		} else {
			return false;
		       }//fin del else
	}//fin del metodo

}//fin de la clase
