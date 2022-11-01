package web.model;

public class Car {

    private String model;

    private int vin;

    private String color;

    public Car() {
    }

    public Car(String model, int vin, String color) {
        this.model = model;
        this.vin = vin;
        this.color = color;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getVin() {
        return vin;
    }

    public void setVin(int vin) {
        this.vin = vin;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

}
