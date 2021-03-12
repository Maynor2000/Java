package Threads;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class BancoSinSincronizar {

	public static void main(String[] args) {
		banco k = new banco();
		for (int i=0;i<100;i++) {
			ejecucionTransferencias tr = new ejecucionTransferencias(k,i,2000);
			Thread a = new Thread(tr);
			a.start();
		}

	}

}
class banco{
	public banco() {
		cuentas = new double[100];
		for(int i=0;i<100;i++) {
			cuentas[i]=2000;
		}
		//saldosuficiente=cierrebanco.newCondition();
		condicion = candado.newCondition();
	}
	ReentrantLock candado = new ReentrantLock();
	public void transferencia(int cuentaOrigen,int cuentaDestino,double cantidad) throws InterruptedException  {
		//cierrebanco.lock();
		//try {
		candado.lock();
		while(cuentas[cuentaOrigen]<cantidad) {
			//System.out.println("....Cantidad insuficiente "+cuentaOrigen+"..."+cuentas[cuentaOrigen]+"...."+cantidad);
			//return;
			//saldosuficiente.await();
			condicion.await();
		}/*else {
			System.out.println("......ok....."+cuentaOrigen);
		}*/
		
		System.out.println(Thread.currentThread().getName());
		cuentas[cuentaOrigen]-=cantidad;
		System.out.printf("%10.2f de %d para: %d ",cantidad,cuentaOrigen,cuentaDestino);
		cuentas[cuentaDestino]+=cantidad;
		System.out.printf("saldo total: %10.2f\n",getsaldototal());
		//candado.unlock();
		condicion.signalAll();
		//saldosuficiente.signalAll();
		}//finally {
			//cierrebanco.unlock();
		//}
	//}
	public double getsaldototal() {
		double sumas_cuentas=0;
		for(double a: cuentas) {
			sumas_cuentas+=a;
		}
		return sumas_cuentas;
	}
	private final double[]cuentas;
	private Condition condicion;
	//private Lock cierrebanco=new ReentrantLock();
	//private Condition saldosuficiente;
}
class ejecucionTransferencias implements Runnable{
 public ejecucionTransferencias(banco b, int d,double max) {
	 this.banco=b;
	 delacuenta=d;
	 cantidadmax=max;
 }
	@Override
	public void run() {
			while(true) {
				
				int paralacuenta=(int)(100*Math.random());
				double cantidad = cantidadmax*Math.random();
				try {
				banco.transferencia(delacuenta, paralacuenta, cantidad);
				
					Thread.sleep((int)(Math.random()*10));
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
	}
	private banco banco;
	private double cantidadmax;
	private int delacuenta;
	
}
