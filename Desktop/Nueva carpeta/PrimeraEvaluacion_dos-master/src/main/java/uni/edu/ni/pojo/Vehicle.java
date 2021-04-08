/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uni.edu.ni.pojo;

/**
 *
 * @author JADPA03
 */
public class Vehicle {
    
    private int stockNumber;
    private int year;
    private String make;
    private String model;
    private String style;
    private String vin;
    private String exteriorColor;
    private String interiorColor;
    private String miles;
    private float price;
    private Transmission transmission;
    private String engine;
    private String image;
    private String status;
    
    public enum Transmission {
        AUTOMATIC, MANUAL;
    }
    
    public Vehicle() {}

    public Vehicle(int stockNumber, int year, String make, String model, Transmission transmission, String status) {
        this.stockNumber = stockNumber;
        this.year = year;
        this.make = make;
        this.model = model;
        this.transmission = transmission;
        this.status = status;
    }

    public Vehicle(int stockNumber, int year, String make, String model, String style, String vin, String exteriorColor, String interiorColor, String miles, float price, Transmission transmission, String engine, String image, String status) {
        this.stockNumber = stockNumber;
        this.year = year;
        this.make = make;
        this.model = model;
        this.style = style;
        this.vin = vin;
        this.exteriorColor = exteriorColor;
        this.interiorColor = interiorColor;
        this.miles = miles;
        this.price = price;
        this.transmission = transmission;
        this.engine = engine;
        this.image = image;
        this.status = status;
    }

    public int getStockNumber() {
        return stockNumber;
    }

    public void setStockNumber(int stockNumber) {
        this.stockNumber = stockNumber;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getStyle() {
        return style;
    }

    public void setStyle(String style) {
        this.style = style;
    }

    public String getVin() {
        return vin;
    }

    public void setVin(String vin) {
        this.vin = vin;
    }

    public String getExteriorColor() {
        return exteriorColor;
    }

    public void setExteriorColor(String exteriorColor) {
        this.exteriorColor = exteriorColor;
    }

    public String getInteriorColor() {
        return interiorColor;
    }

    public void setInteriorColor(String interiorColor) {
        this.interiorColor = interiorColor;
    }

    public String getMiles() {
        return miles;
    }

    public void setMiles(String miles) {
        this.miles = miles;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public Transmission getTransmission() {
        return transmission;
    }

    public void setTransmission(Transmission transmission) {
        this.transmission = transmission;
    }

    public String getEngine() {
        return engine;
    }

    public void setEngine(String engine) {
        this.engine = engine;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
    
    @Override
    public String toString() {
        return "Vehicle { " + "stockNumber=" + stockNumber + ", year=" + year + ", make=" + make + ", model=" + model + ", style=" + style + ", vin=" + vin + ", exteriorColor=" + exteriorColor + ", interiorColor=" + interiorColor + ", miles=" + miles + ", price=" + price + ", transmission=" + transmission + ", engine=" + engine + ", image=" + image + ", status=" + status + " }";
    }
}
