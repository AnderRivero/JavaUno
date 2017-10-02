package guiaPseudocodigo;

import java.io.IOException;
import java.util.Scanner;

public class MainMenu {

	private static Scanner sc;

	public static void main(String[] args) throws IOException {
		
		int op=0;
		
		System.out.println("Ingrese una opcion segun lo que desee: ");
		System.out.println( 
				"1. Determinar si un número es primo.\r\n" + 
				"2. Ordenar un arreglo numerico\r\n" + 
				"3. Invertir una cadena de caracteres.\r\n" + 
				"4. Determinar el número mayor en un arreglo numero.\r\n" + 
				"5. Determinar el número menor en un arreglo numero.\r\n" + 
				"6. Convertir una cadena de dígitos a un valor numérico.\r\n" + 
				"7. Verificar si una contraseña es valida “AaaaAA99”.\r\n" + 
				"8. Comparar dos cadenas.\r\n" + 
				"9. Verificar si un número es multiplo de otro.\r\n" + 
				"10. Determinar si un número entero dado es perfecto.\r\n" + 
				"11. Encontrar el máximo común divisor (mcd) de dos números enteros.\r\n" + 
				"12. Visualizar el mayor el menor y el promedio de números agrupados en un arreglo y ver el arreglo ordenado al final.\r\n" + 
				"13. Invertir un número entero. r\n" + 
				"14. Llenar aleatoriamente en arreglo bidimensional de 3 x 3, con 1’s y 0’s.\r\n" + 
				"15. Determinar cuantos 1’s hay alrededor de una posición determinada del arreglo (fila, columna).");
		
		sc = new Scanner(System.in);
		Arreglo arreglo =new Arreglo();
		op=sc.nextInt();
		
		switch (op) {
		case 1:
			int num;
			
			System.out.println("Por favor, ingrese el número a evaluar: ");
				num=sc.nextInt();
				NumeroPrimo np = new NumeroPrimo();
				np.VerificarNum(num);
				
				if (np.VerificarNum(num)==true) {
					System.out.println("El numero "+num+" es Primo");
				}else {
					System.out.println("El numero "+num+" No es Primo");
					
				}
			
			break;
		case 2:
			int[] a = new int[5];
			int[] b = new int[5];
			
			
			a=arreglo.ArrayCreator();
			
			System.out.println("Arreglo desordenado:");
			for (int i = 0; i < a.length; i++) {
				
				System.out.println(a[i]);
			}
			
			b=arreglo.OrdenarAscendente(a);
			System.out.println("------------------");
			System.out.println("Arreglo ordenado:");

			for (int i = 0; i < b.length; i++) {
				
				System.out.println(b[i]);
			}
			break;
		case 3:
			
			String palabra=" ";
			System.out.println("Ingrese palabra a invertir: ");
			palabra=sc.next();
			Invertir invertir= new Invertir();
			System.out.println(invertir.InvertirCadena(palabra));
			break;
			
		case 4:
			int[] c = new int[5];
			int[] d = new int[5];
			c=arreglo.ArrayCreator();
			for (int i = 0; i < c.length; i++) {
				
				System.out.println(c[i]);
			}
			d=arreglo.OrdenarAscendente(c);
			System.out.println("--número mayor--");
			System.out.println(d[4]);
			break;
		case 5:
			int[] e = new int[5];
			int[] f = new int[5];
			e=arreglo.ArrayCreator();
			for (int i = 0; i < e.length; i++) {
				
				System.out.println(e[i]);
			}
			f=arreglo.OrdenarAscendente(e);
			System.out.println("--número mayor--");
			System.out.println(f[0]);
			break;
			
		case 6:
			String str;
			System.out.println("Inserte una cifra");			
			str=sc.next();			
			int num2 = Integer.parseInt(str);
			System.out.println("ya "+num2+" esta convertido");
			break;
			
		case 7:
			
			
			break;
		case 8:
			break;
		case 9:
			break;
		case 10:
			break;
		case 11:
			break;
		case 12:
			break;
		case 13:
			break;
		case 14:
			break;
		case 15:
			break;

		default:
			System.out.println("opcion invalida");
			break;
		}

	}

}
