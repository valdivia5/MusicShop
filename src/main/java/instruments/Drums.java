package instruments;
import interfaces.Iplay;

public class Drums extends Instrument {

    private String style;

    public Drums(String make, String model, double costPrice, double sellPrice, String style) {
        super(make, model, costPrice, sellPrice);
        this.style = style;
    }
    public String getStyle() {
        return style;
    }

    public String play() {
        return "Boomtststststs";
    }

    public double calculateMarkup() {
        return this.getSellPrice() - this.getCostPrice();
    }
}
