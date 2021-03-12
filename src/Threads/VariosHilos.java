package Threads;

public class VariosHilos {

	public static void main(String[] args) {
		misHilos h1=new misHilos();
		misHilos h2=new misHilos();
		h1.start();
		
		try {
			h1.join();
		}catch(InterruptedException e) {
			
		}
		h2.start();

	}

}
class misHilos extends Thread{
	public void run() {
		for(int i=0;i<15;i++) {
			System.out.println("Hilo "+ getName());
			try {
				Thread.sleep(700);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
