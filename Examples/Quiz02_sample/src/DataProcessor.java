
// Abstract class representing a data processor
public abstract class DataProcessor {
	Strategy strategy;
	
	DataProcessor(){
		this.strategy = new AggregationStrategy();
	}
	
	DataProcessor(Strategy strategy){
		this.strategy = strategy;
	}
    // Template method defining the data processing workflow
    public void process() {
    	
        initializeDataSource();
        retrieveData();
        processData();
        cleanupDataSource();
    }

    // Abstract methods to be implemented by concrete subclasses
    abstract void initializeDataSource();
    abstract void retrieveData();
    abstract void cleanupDataSource();
    
    public void setStrategy(Strategy strategy) {
    	this.strategy = strategy;
    }
    
    void processData() {
        strategy.execute();
    }
}