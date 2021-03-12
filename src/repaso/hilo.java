package repaso;

public class hilo {

	public static void main(String[] args) {
		Thread h1=new hilo1(),h2 = new hilo2(h1);
		h2.start();
		h1.start();
		

	}

}
/**
 * 
 * @author may_u
 *
 */
class hilo1 extends Thread{

	public void run() {
		for(int i=0;i<150;i++) {
			System.out.println("ejecucion de hilo "+getName());
		}
	}
}
class hilo2 extends Thread{
	private Thread t;
	public hilo2(Thread t) {
		this.t = t;
	}
	public void run() {
		try {
			t.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		for(int i=0;i<150;i++) {
			System.out.println("ejecucion de hilo "+getName());
		}
	}
}