public abstract class SomeDrink extends Product {
    private double volume; // Объём напитка

    public SomeDrink(String name, int cost, double value) {
        super(name, cost);
        this.volume = value;
    }

    public SomeDrink(String name, int cost) {
        super(name, cost);
        this.volume = 0.5;
        //SomeDrink(name, cost, 0.5);
    }

    // гетер и сетер для нового поля
    public double getVolume() {
        return volume;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }

    @Override
    public String toString() {
        //return String.format("Name of product: %s, volume: %f l, cost: %d rur", super.getName(), this.volume, super.getCost());
        return  String.format("%s, volume: %.2f l", super.toString(), this.volume);
    }


}
