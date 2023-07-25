package study.neo.singleton;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class SingletonLogger {
    private final static SingletonLogger singletonLogger = new SingletonLogger();

    private SingletonLogger() {}

    public static SingletonLogger getInstance() {
        return singletonLogger;
    }

    public String classLogg(Object o, String info) {
        return "Log info: " + LocalDate.now().format(DateTimeFormatter.ofPattern("d.MM.uuuu"))
                + " - " + o.getClass().getSimpleName() + " - " + info;
    }
}
