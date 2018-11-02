public class IceCream extends Sweats {
    boolean isCoveredByChocolate;

    public IceCream(String name, int wight, int price, boolean isCoveredByChocolate) {
        super (name, wight, price);
        this.isCoveredByChocolate = isCoveredByChocolate;
    }
}
