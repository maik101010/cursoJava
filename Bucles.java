class Bucles {

	public static void main(String arg[]){
		// int [] numeros = new int [5]; //largo del arreglo es 5
		// numeros[0] = 4;  //1
		// numeros[1] = 3;	//2
		// numeros[2] = 5; //3
		// numeros[3] = 7;
		// numeros[4] = 1;
						 // 0 1 2 4... 
		

		/**
		 * Recorriendo el arreglo con do while
		 */
		// int posicion=0;
		// do{
		// 	System.out.println("El valor del arreglo en posicion es " + numeros[posicion]);
		// 	posicion++;

		// }while(posicion<largo);

		/**
		 * Recorriendo el arreglo con el bucle while
		 */

		/*int posicion=0;
		while (posicion<largo) {
			System.out.println("El valor de la posicion es "+ posicion);
			System.out.println("El valor del arreglo en posicion es " + numeros[posicion]);
			posicion++;
		}
*/
		/**
		 * Recorriendo el arreglo con el bucle for
		 */

		/*System.out.println("Mostrando la posición 0 del arreglo: " + numeros[0]);
		System.out.println("Iniciando el for ");

		for (int i=0; i < largo; i++) {
			System.out.println("El valor de i es "+ i);
			System.out.println("El valor del arreglo en i es " + numeros[i]);
		}*/


		/**
		 * Que me muestre los numeros pares, los numeros impares hasta 10...
		 * Los que sean mayores de 18 a 23, que me imprima eres mayor de edad
		 *   
		 */
			
		int [] numeros = {4, 3, 5, 7, 1, 18, 23, 34, 111, 2, 3, 4, 5 ,6, 7, 8, 12, 34, 56, 66, 67}; 

		int largo = numeros.length; //largo del array es 5

		/*for (int i=0; i<largo; i++ ) {

			if (numeros[i]<=10) {
				if (numeros[i]%2 == 0) {
					System.out.println("Este numero " + numeros[i] + " es par");
				}else if(numeros[i]%2 == 1){
					System.out.println("Este numero " + numeros[i] + " es impar");
				}
			}else if (numeros[i]>= 18 && numeros[i]<= 23) {
				System.out.println("Eres mayor de edad: " + numeros[i]);
			}		

		}*/

		/*
			Hayar el número menor
		 */
		int mayor = numeros[0];
		for (int i=0; i<largo; i++) {
			if (numeros[i]> mayor) {
				mayor = numeros[i];
			}
		}
		System.out.println("El numero mayor del arreglo es " + mayor);

	}
	
}