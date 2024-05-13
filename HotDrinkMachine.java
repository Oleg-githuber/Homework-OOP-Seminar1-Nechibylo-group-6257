import java.util.ArrayList;
import java.util.List;

// Класс автомат горячих напитков
public class HotDrinkMachine implements VendingMachine {
    // Список продуктов в автомате
    private List<Product> productList;

    // Конструктор
    public HotDrinkMachine() {
        this.productList = new ArrayList<>();
    }

    public List<Product> getProductList() {
        return productList;
    }

    // Перезапись списка продуктов
    @Override
    public void initProducts(List<Product> productList) {
        this.productList = productList;
    }

    // Поиск продукта по названию
    @Override
    public Product getProduct(String name) {
        for (Product product : productList) {
            if (product.getName().equals(name)) return product;
        }
        return null;
    }

    // Поиск продукта по названию и объёму
    public Product getProduct(String name, double volume) {
        for (Product product : productList) {
            if (product.getName().equals(name) && (((HotDrink)product).getVolume() == volume)) return product;
        }
        return null;
    }

    // Поиск продукта по названию, объёму и температуре
    public Product getProduct(String name, double volume, int temperature) {
        for (Product product : productList) {
            if (product.getName().equals(name) && (((HotDrink)product).getVolume() == volume) && (((HotDrink)product).getTemperature() == temperature)) return product;
        }
        return null;
    }

    // Поиск продукта по номеру
    @Override
    public  Product getProductWithIndex(int index) {
        if (index < this.productList.size()) return this.productList.get(index);
        return null;
    }

    @Override
    public void addProduct(Product product) {
        this.productList.add(product);
    }
}
