class Ejercicio {
	public static void main(String[] args) {
		Hilos p1 = new Hilos();
		Hilos p2 = new Hilos();
		Hilos p3 = new Hilos();

		p1.start();

		try{
			p1.join();
		}
		catch (InterruptedException e) {
			e.printStackTrace();
		}		

		p3.start();

		try{
			p3.join();
		}
		catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("Terminadas p1 y p3");
		p2.start();

		try{
			p2.join();
		}
		catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("Finalizado");
		
	}
}
class Hilos extends Thread{

	public void run(){
		for (int i=0; i<5; i++) {
			if (getName().equals("Thread-0")) {
				System.out.println("Ejecutando p1");
			}else if (getName().equals("Thread-1")) {
				System.out.println("Ejecutando p2");
			}else{
				System.out.println("Ejecutando p3");
			}
			
			try{
				//Damos descanso de 5 milisegundos por cada vuelta de bucle.
				Thread.sleep(500);
			}
			catch (InterruptedException e) {
				e.printStackTrace();
			}
			
		}
	}
}