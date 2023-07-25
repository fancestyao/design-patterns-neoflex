package study.neo.factory;

import lombok.Data;

@Data
public class Barista {
    private final CoffeeFactory coffeeFactory;

    public void orderCoffee(CoffeeType coffeeType) {
        Coffee coffee = coffeeFactory.makeCoffee(coffeeType);
        coffee.drinkCoffee();

        System.out.println("Кофе успешно выпит!");
    }
}
