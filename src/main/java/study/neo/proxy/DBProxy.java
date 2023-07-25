package study.neo.proxy;

public class DBProxy implements DBConnector{
    private final DBConnectorImpl dbConnector;

    public DBProxy(DBConnectorImpl dbConnector) {
        this.dbConnector = dbConnector;
    }

    @Override
    public void connect(String dbName) {
        System.out.println("Подключаемся к базе данных с названием: " + dbName);
        dbConnector.connect(dbName);
    }
}
