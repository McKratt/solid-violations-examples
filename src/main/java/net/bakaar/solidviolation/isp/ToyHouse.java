package net.bakaar.solidviolation.isp;

public class ToyHouse implements Toy {
    private double price;


    public double getPrice() {
        return price;
    }

    @Override
    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public void fly() {
        //What can do this class with this method? A House doesn't fly !
        throw new UnsupportedOperationException(); // It is the least we can do.
    }
}
