public abstract class Product {
    private int cost; // Цена
    private String name;  // Имя

    // Конструктор с инициализацией полей
    public Product(String name, int cost) {
        this.name = name;
        this.cost = cost;
    }

    // Гетеры
    public int getCost() {
        return this.cost;
    }

    public String getName() {
        return this.name;
    }

    // Сетеры
    public void setCost(int value) {
        this.cost = value;
    }

    public void setName(String value) {
        this.name = value;
    }

    // Переопределение отображения класса в текстовом виде
    @Override
    public String toString() {
        //return "Name of product: " + this.name + ", cost is: " + this.cost;
        return  String.format("Name of product: %s, cost: %d rur", this.name, this.cost);
    }

}
