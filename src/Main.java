public class Main {
    public static void main(String[] args) {
        Car lada = new Car("Lada", null, 1.7, "желтый", 2015, "Россия");
        Car audi = new Car("Audi", "A8 50 L TDI quattro", 0, "черный", 2020, "Германия");
        Car bmw = new Car("BMW", "Z8", 3.0, "черный", 2021, null);
        Car kia = new Car("KIA", "Sportage", 2.4, "", 2018, "Южная Корея");
        Car hyundai = new Car(null, "Avante", 1.6, "оранжевый", 2016, "Южная Корея");

        lada.configuration();
        audi.configuration();
        bmw.configuration();
        kia.configuration();
        hyundai.configuration();
    }
}