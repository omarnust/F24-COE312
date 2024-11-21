// Concrete subclass representing file data source
class FileProcessor extends DataProcessor {
	
	FileProcessor(Strategy strategy){
		super(strategy);
	}
	
    @Override
    void initializeDataSource() {
        System.out.println("Initializing file data source...");
    }

    @Override
    void retrieveData() {
        System.out.println("Retrieving data from file...");
    }


    @Override
    void cleanupDataSource() {
        System.out.println("Cleaning up file data source...");
    }
}

