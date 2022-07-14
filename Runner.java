import java.awt.*;
import java.time.Year;

public class Runner {
    public static void main(String[] args) {
        Car[] cars = new Car[5];

        cars[0] = new Car("wolkswagen", "passat", Year.of(2008), Color.BLACK, 3000, "BH2062AM");
        cars[1] = new Car("bmw", "v5", Year.of(2014), Color.gray, 30000, "BH2162AM");
        cars[2] = new Car("jeep", "compas", Year.of(2018), Color.magenta, 4000, "BH2092AM");
        cars[3] = new Car("bmw", "Q5", Year.of(2018), Color.darkGray, 45000, "BH4562AM");
        cars[4] = new Car("ford", "focus", Year.of(2015), Color.pink, 15000, "BH132AM");

        CarProcessor processor = new CarProcessor();
        processor.modelSearcher("focus", 4, cars);
        processor.brandSearcher("bmw", cars);
        processor.priceSearcher(3100, Year.of(2008), cars);
    }
}