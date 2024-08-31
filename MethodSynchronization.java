class PrintTable 
{	
	synchronized void printTable(int num){ //Synchronized Method 
		for(int i=1; i<=10; i++){
			System.out.println(num * i);
		}
		try{
			Thread.sleep(1000);
		}catch(Exception e){
			e.printStackTrace();
		}
	}
}

class MyThread1 extends Thread
{	
	PrintTable t;
	int n;
	MyThread1(PrintTable t, int n){
		this.t = t;
		this.n = n;
	}
	public void run(){
		t.printTable(n);
	}
}

/*class MyThread2 extends Thread
{	
	PrintTable t;
	MyThread2(PrintTable t){
		this.t = t;
	}
	public void run(){
		t.printTable(10);
	}
}
*/
public class MethodSynchronization extends Thread
{
	public static void main(String args[]){	
		PrintTable obj = new PrintTable();
		MyThread1 th1 = new MyThread1(obj, 5);
		MyThread1 th2 = new MyThread1(obj, 10);
		th1.start();
		th2.start();
	}
}