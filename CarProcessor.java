import java.time.Year;

public class CarProcessor {
    public void brandSearcher(String brandToSearch, Car[] cars) {
        for (Car car : cars) {
            if (car.brand.equals(brandToSearch)) {
                infoPrinter(car);
            }
        }
    }

    public void modelSearcher(String modelToSearch, int n, Car[] cars) {
        for (Car car : cars) {
            if (car.model.equals(modelToSearch) && Year.now().compareTo(car.issue) > n) {
                infoPrinter(car);
            }
        }
    }

    public void priceSearcher(int price, Year year, Car[] cars) {
        for (Car car : cars) {
            if (price < car.price && year.equals(car.issue) == true) {
                infoPrinter(car);
            }
        }
    }

    public void infoPrinter(Car car) {
        System.out.println(car.brand + " " + car.model);
        System.out.println("Color:" + car.color + "\nRegistration Number:" + car.registrationNum + "\nCar's Issue:" + car.issue + "\nPrice:" + car.price + "\n");
    }
}
