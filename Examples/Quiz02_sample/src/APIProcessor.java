// Concrete subclass representing API data source
class APIProcessor extends DataProcessor {
	
    @Override
    void initializeDataSource() {
        System.out.println("Connecting to API...");
    }

    @Override
    void retrieveData() {
        System.out.println("Fetching data from API...");
    }

    
    @Override
    void cleanupDataSource() {
        System.out.println("Closing API connection...");
    }
}
