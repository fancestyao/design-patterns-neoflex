package study.neo.factory;

public class CoffeeFactory {
    public Coffee makeCoffee(CoffeeType coffeeType) {
        Coffee coffee = null;
        switch (coffeeType) {
            case ESPRESSO: coffee = new Espresso();
            break;
            case AMERICANO: coffee = new Americano();
            break;
            default: throw new IllegalArgumentException("Задан неверный тип кофе.");
        }

        return coffee;
    }
}
