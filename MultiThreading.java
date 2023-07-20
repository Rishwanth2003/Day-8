class Counter implements Runnable{
	int num;
	Counter(int num){
		this.num=num;
	}
	public void run() {
		for(int i=0;i<=5;i++) {
			System.out.println(num);
			try {
		    	   Thread.sleep(1000);
		       }
		       catch(InterruptedException e){
		    	   
		       }
		}
		 
	}
}
public class MultiThreading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Thread thread=new Thread(new Counter(5));
       Thread thread1=new Thread(new Counter(7));
       thread.start();
       thread1.start();
	}

}
