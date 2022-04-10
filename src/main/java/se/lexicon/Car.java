package se.lexicon;

public class Car {
    private int id;
    private int year;
    private String model;
    private String colour;
    private String motorSize;

    public void drive() {
        System.out.println(model + " with motor " + motorSize + " can drive now.");
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public String getMotorSize() {
        return motorSize;
    }

    public void setMotorSize(String motorSize) {
        this.motorSize = motorSize;
    }
}
