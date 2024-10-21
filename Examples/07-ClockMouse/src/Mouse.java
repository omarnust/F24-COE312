
public class Mouse extends ConcreteObserver {
	private int count;
	private int sum;
	
	public Mouse(Subject subject) {		
		super(subject);
		this.count = 0;
		this.sum = 0;
	}
	
	@Override
	public void update(int data) {
		this.count += 1;
		this.sum += data;
		System.out.println("Average: " + this.sum/this.count);
	}
}
