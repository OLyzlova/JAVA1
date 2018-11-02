public abstract class Sweats {
    String name;
    int weight;
    int price;

    public Sweats(String name, int weight, int price) {
        this.name = name;
        this.weight = weight;
        this.price = price;
    }

    public int getWeight() {
        return weight;
    }

    public int getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return name + " (" + weight + " г, " + price + " руб.)";
    }
}