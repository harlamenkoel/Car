import java.util.Objects;

public class Car {
    String brand;
    String model;
    double engineSize;
    String color;
    int age;
    String countryProduction;

    public Car(String brand, String model, double engineSize, String color, int age, String countryProduction) {
        this.brand = Objects.requireNonNullElse(brand, "default");
        this.model = Objects.requireNonNullElse(model, "default");
        this.countryProduction = Objects.requireNonNullElse(countryProduction, "default");

        if (engineSize <= 0) {
            this.engineSize = 1.5;
        } else {
            this.engineSize = engineSize;
        }

        if (color == null || color.equals("")) {
            this.color = "белый";
        }else {
            this.color = color;
        }

        if (age <= 0) {
            this.age = 2000;
        } else {
            this.age = age;
        }
    }

    void configuration() {
        System.out.println("Марка: " + brand + "| " + " Модель: " + model + "| " + " Объем двигателя: " + engineSize + "| " +
                " Цвет: " + color + "|" + " Год производства: " + age + "|" + " Страна приозвидства: " + countryProduction);
    }
}
