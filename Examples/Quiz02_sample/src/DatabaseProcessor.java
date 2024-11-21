// Concrete subclass representing database data source
class DatabaseProcessor extends DataProcessor {
    @Override
    void initializeDataSource() {
        System.out.println("Connecting to database...");
    }

    @Override
    void retrieveData() {
        System.out.println("Fetching data from database...");
    }

 
    @Override
    void cleanupDataSource() {
        System.out.println("Closing database connection...");
    }
}
