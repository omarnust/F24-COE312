
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Thread.currentThread().setName("thisisamin");
				
		ExtendThread m1 = new ExtendThread("Thread 1");
		ExtendThread m2 = new ExtendThread("Thread 2");
		
		ImplementInterface im1 = new ImplementInterface("iThread 1");
		ImplementInterface im2 = new ImplementInterface("iThread 2");
		
		try {
			m1.join(); // wait for thread 1 to end
			m2.join(); // wait for thread 2 to end
			im1.getThread().join();
			im2.getThread().join();
		}catch (InterruptedException e) {	
	    }
					
		System.out.println("Main thread " +  Thread.currentThread().getName() + " terminated");
	}

}
