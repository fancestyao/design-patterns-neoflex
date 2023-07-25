package study.neo.proxy;

import lombok.Data;

@Data
public class DBConnectorImpl implements DBConnector {
    public void connect(String dbName){
        System.out.println("localhost:8080/" + dbName);
    }
}
