import java.awt.*;
import java.time.Year;
import java.util.Date;

public class Car {
    String brand;
    String model;
    Year issue;
    Color color;
    int price;
    String registrationNum;

    Car(String brand, String model, Year issue, Color color, int price, String registrationNum) {
        this.brand = brand;
        this.model = model;
        this.issue = issue;
        this.color = color;
        this.price = price;
        this.registrationNum = registrationNum;
    }
}
