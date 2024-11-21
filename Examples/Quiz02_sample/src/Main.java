
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		APIProcessor apiProcessor = new APIProcessor();
		DatabaseProcessor databaseProcessor = new DatabaseProcessor();
		FileProcessor fileProcessor = new FileProcessor(new FilteringStrategy());
		
		apiProcessor.process();
		System.out.println("-------");
		databaseProcessor.process();
		System.out.println("-------");
		fileProcessor.process();
		System.out.println("-------");
		
		fileProcessor.setStrategy(new AggregationStrategy());
		fileProcessor.process();
		
	}

}
