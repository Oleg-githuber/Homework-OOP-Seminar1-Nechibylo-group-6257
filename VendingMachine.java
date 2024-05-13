
import java.util.ArrayList;
import java.util.List;

// Интерфейс Торговый автомат
interface VendingMachine {

    // Список продуктов в автомате
    //private List<Product> productList;

    // Конструктор
//    public VendingMachine() {
//        this.productList = new ArrayList<>();
//    }

    // Перезапись списка продуктов
    void initProducts(List<Product> productList);

    // Поиск продукта по названию
    Product getProduct(String name);

    // Поиск продукта по номеру
    Product getProductWithIndex(int index);

    void addProduct(Product product);
}
