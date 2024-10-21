public class ConcreteObserver implements Observer {

	private Subject subject;

	public ConcreteObserver(Subject subject) {
		this.subject = subject;
		subject.registerObserver(this);
	}

	// default update function
	public void update(int data) {
		System.out.println("do nothing from " + this);
	}
	
	
}