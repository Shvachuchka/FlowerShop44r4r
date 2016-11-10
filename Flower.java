package Flower;



public class Flower {

    private String nameFlower;
    private String colorFlower;
    private int heightFlower;
    private double priceFlower;
    private FreshFlower fresh_Flower;

    public Flower() {
    }

    public Flower(String nameFlower, String colorFlower, int heightFlower, double priceFlower, FreshFlower fresh_Flower) {
        this.nameFlower = nameFlower;
        this.colorFlower = colorFlower;
        this.heightFlower = heightFlower;
        this.priceFlower = priceFlower;
        this.fresh_Flower = fresh_Flower;
    }

    public String getNameFlower() {
        return nameFlower;
    }

    public void setNameFlower(String nameFlower) {
        this.nameFlower = nameFlower;
    }

    public String getColorFlower() {
        return colorFlower;
    }

    public void setColorFlower(String colorFlower) {
        this.colorFlower = colorFlower;
    }

    public int getHeightFlower() {
        return heightFlower;
    }

    public void setHeightFlower(int heightFlower) {
        this.heightFlower = heightFlower;
    }

    public double getPriceFlower() {
        return priceFlower;
    }

    public void setPriceFlower(double priceFlower) {
        this.priceFlower = priceFlower;
    }

    public FreshFlower getFresh_Flower() {
        return fresh_Flower;
    }

    public void setFresh_Flower(FreshFlower fresh_Flower) {
        this.fresh_Flower = fresh_Flower;
    }

    @Override
    public String toString() {
        return "Flower{" +
                "nameFlower='" + nameFlower + '\'' +
                ", colorFlower='" + colorFlower + '\'' +
                ", heightFlower=" + heightFlower +
                ", priceFlower=" + priceFlower +
                ", fresh_Flower=" + fresh_Flower +
                '}';
    }
}





