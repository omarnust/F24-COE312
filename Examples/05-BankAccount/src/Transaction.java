import java.util.Random;

public class Transaction implements Runnable{
	BankAccount bankAccount;
	Random r = new Random();
	private Thread t;
	
	Transaction(BankAccount bankAccount){	
		this.bankAccount = bankAccount;
		t = new Thread(this);
		t.start();
	}
	public Thread getThread() {
		return t;
	}
	public void run() {
		for (int i = 0; i < 10; i++) {
			try {
				int amount = r.nextInt(100);
                boolean deposit = r.nextBoolean();
                if (deposit) {
                    bankAccount.deposit(amount);
                    
                } else {
                    bankAccount.withdraw(amount);
                }
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
	}
}


