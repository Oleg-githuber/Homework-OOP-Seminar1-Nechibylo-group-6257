import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Создание экземпляров горячих напитков
        Product coffee = new HotDrink("coffee", 60, 0.25);
        Product coffeeDouble = new HotDrink("coffee", 120, 0.25);
        Product cappuccino = new HotDrink("cappuccino", 80);
        Product cappuccinoDouble = new HotDrink("cappuccino", 160, 0.5);
        Product teaBlack = new HotDrink("black tea", 50, 0.25, 2, 80);
        Product teaGreen = new HotDrink("green tea", 50, 0.25, 2, 80);
        Product chocolate = new HotDrink("chocolate", 50);
        // Создание машины по продаже напитков
        HotDrinkMachine machine1 = new HotDrinkMachine();
        // Добавление напитков в машину
        machine1.addProduct(coffee);
        machine1.addProduct(coffeeDouble);
        machine1.addProduct(cappuccino);
        machine1.addProduct(cappuccinoDouble);
        machine1.addProduct(teaBlack);
        machine1.addProduct(teaGreen);
        machine1.addProduct(chocolate);
        // Вывод в консоль информации о напитках
        for (Product hotDrink : machine1.getProductList()) {
            System.out.println(hotDrink);
        }
        System.out.println();
        // Поиск напитков
        System.out.println("Search for drinks:");
        System.out.println(machine1.getProduct("chocolate"));
        System.out.println(machine1.getProduct("cappuccino", 0.25));
        System.out.println(machine1.getProduct("coffee", 0.25, 60));
        // Поиск напитка по индексу (номеру в меню)
        System.out.println(machine1.getProductWithIndex(4));

        // Альтернативный способ реализации через initProducts
        System.out.println();
        System.out.println("Alternative work of program:");
        List<Product> newList = new ArrayList<>();
        newList.add(coffee);
        newList.add(coffeeDouble);
        newList.add(cappuccino);
        newList.add(cappuccinoDouble);
        newList.add(teaBlack);
        newList.add(teaGreen);
        newList.add(chocolate);
        machine1.initProducts(newList);
        for (Product hotDrink : machine1.getProductList()) {
            System.out.println(hotDrink);
        }
    }

}
