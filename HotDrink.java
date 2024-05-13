public class HotDrink extends SomeDrink {
    private int temperature;    // Температура напитка
    private int sugar;      // Количество сахара

    // Конструкторы

    public HotDrink(String name, int cost, double value, int sugar, int temperature) {
        super(name, cost, value);
        this.temperature = temperature;
        this.sugar = sugar;
    }

    public HotDrink(String name, int cost, double value, int sugar) {
        super(name, cost, value);
        this.temperature = 60;
        this.sugar = sugar;
    }

    public HotDrink(String name, int cost, double value) {
        super(name, cost, value);
        this.temperature = 60;
        this.sugar = 3;
    }

    public HotDrink(String name, int cost) {
        super(name, cost, 0.25);
        this.temperature = 60;
        this.sugar = 3;
    }

    // Гетеры и сетеры
    public int getTemperature() {
        return temperature;
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }

    public int getSugar() {
        return sugar;
    }

    public void setSugar(int sugar) {
        this.sugar = sugar;
    }

    @Override
    public String toString() {
        return String.format("%s, temperature: %d, sugar: %d", super.toString(), this.temperature, this.sugar);
    }
}
