package web.model;

public class Car {

    private String manufacturer;
    private String model;
    private int yearOfRelease;

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setYearOfRelease(int yearOfRelease) {
        this.yearOfRelease = yearOfRelease;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public String getModel() {
        return model;
    }

    public int getYearOfRelease() {
        return yearOfRelease;
    }

    public Car(String manufacturer, String model, int yearOfRelease) {
        this.manufacturer = manufacturer;
        this.model = model;
        this.yearOfRelease = yearOfRelease;
    }
}