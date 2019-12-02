package instruments;

import interfaces.Iplay;

public class Bass extends Instrument {

    private String style;

    public Bass(String make, String model, double costPrice, double sellPrice, String style) {
        super(make, model, costPrice, sellPrice);
        this.style = style;
    }
    public String getStyle() {
        return style;
    }

    public String play() {
        return "Duuuuuuuummmmm";
    }

    public double calculateMarkup() {
        return this.getSellPrice() - this.getCostPrice();
    }
}
