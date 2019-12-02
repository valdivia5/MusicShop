package instruments;
import interfaces.Iplay;
import interfaces.ISell;

public abstract class Instrument implements ISell, Iplay {
    private String make;
    private String model;
    private double costPrice;
    private double sellPrice;


    public Instrument(String make, String model, double costPrice, double sellPrice) {

        this.make = make;
        this.model = model;
        this.costPrice = costPrice;
        this.sellPrice = sellPrice;
    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }


    public double getCostPrice() {
        return costPrice;
    }

    public double getSellPrice() {
        return sellPrice;
    }

}
