package study.neo;

import study.neo.adapter.*;
import study.neo.factory.Barista;
import study.neo.factory.CoffeeFactory;
import study.neo.factory.CoffeeType;
import study.neo.proxy.DBConnectorImpl;
import study.neo.proxy.DBProxy;
import study.neo.singleton.User;
import study.neo.singleton.SingletonLogger;

public class Main {
    public static void main(String[] args) {
        //Singleton
        SingletonLogger singletonLogger = SingletonLogger.getInstance();
        User user = new User();
        user.setName("Андрей");
        user.setSurname("Гигачаденко");
        user.setAge(18);
        String info = "Андрею крайне повезло с фамилией!";
        System.out.println(singletonLogger.classLogg(user, info));

        //Factory
        CoffeeFactory coffeeFactory = new CoffeeFactory();
        Barista barista = new Barista(coffeeFactory);
        barista.orderCoffee(CoffeeType.AMERICANO);
        barista.orderCoffee(CoffeeType.ESPRESSO);

        //Adapter
        MemoryCard memoryCard = new MemoryCard();
        USB cardReader = new CardReader(memoryCard);
        Computer computer = new Computer();
        computer.connect(cardReader);

        //Proxy
        DBConnectorImpl dbConnectorImpl = new DBConnectorImpl();
        DBProxy dbProxy = new DBProxy(dbConnectorImpl);
        dbProxy.connect("PostgreSQL");
    }
}