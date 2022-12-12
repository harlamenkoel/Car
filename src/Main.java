import transport.Car;

public class Main {
    public static void main(String[] args) {
        Car lada = new Car("Lada",
                null,
                1.7,
                "желтый",
                2015,
                "Россия",
                "МКПП", "седан",
                null,
                5);
        Car audi = new Car("Audi",
                "A8 50 L TDI quattro",
                0,
                "черный",
                2020,
                "Германия",
                "МКПП",
                "купе",
                "к537кв154",
                4);


        Car bmw = new Car(
                "BMW",
                "Z8",
                3.0,
                "черный",
                2021,
                null,
                null,
                "купе",
                null,
                2);
        Car kia = new Car(
                "KIA",
                "Sportage",
                2.4,
                "",
                2018,
                "Южная Корея",
                "AКПП",
                "кроссовер",
                null,
                7);
        kia.setTire(false);
        Car hyundai = new Car(
                null,
                "Avante",
                1.6,
                "оранжевый",
                2016,
                "Южная Корея",
                "МКПП",
                "кроссовер",
                null,
                5);


        printInfoRegNumber(audi.isCorrectRegNumber(), audi.getBrand());
        bmw.setRegisterNumber("123erd67");
        printInfoRegNumber(bmw.isCorrectRegNumber(), bmw.getBrand());

        System.out.println(lada);
        System.out.println(audi);
        System.out.println(bmw);

        System.out.println(kia);
        System.out.println(hyundai);
    }

    public static void printInfoRegNumber(boolean isCorrectRegNumber, String brand) {
        if (isCorrectRegNumber) {
            System.out.println("Регистрационный номер " + brand + " указан верно");
        } else {
            System.out.println("Регистрационный номер " + brand + " указан неверно");
        }
    }
}