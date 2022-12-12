package transport;

import java.time.LocalDate;

public class Car {
    private final String brand;
    private final String model;
    private double engineSize;
    private String color;
    private final int age;
    private final String countryProduction;
    private String transmission;
    private final String bodyType;
    private String registerNumber;
    private final int seatsCount;
    private boolean isTire;
    private Key key;


    public Car(String brand,
               String model,
               double engineSize,
               String color,
               int age,
               String countryProduction,
               String transmission,
               String bodyType,
               String registerNumber,
               int seatsCount,
               Key key
    ) {
        if (brand == null) {
            this.brand = "default";
        } else {
            this.brand = brand;
        }

        if (model == null) {
            this.model = "default";
        } else {
            this.model = model;
        }

        if (countryProduction == null) {
            this.countryProduction = "default";
        } else {
            this.countryProduction = countryProduction;
        }

        if (Double.compare(engineSize, 0D) == 0) {
            this.engineSize = 1.5;
        } else {
            this.engineSize = engineSize;
        }

        if (color == null) {
            this.color = "белый";
        } else {
            this.color = color;
        }

        if (age <= 0) {
            this.age = 2000;
        } else {
            this.age = age;
        }
        if (key == null) {
            this.key = new Key();
        } else {
            this.key = key;
        }
        setTransmission(transmission);
        setRegisterNumber(registerNumber);
        this.bodyType = bodyType;
        this.seatsCount = 5;
        this.isTire = true;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public double getEngineSize() {
        return engineSize;
    }

    public String getColor() {
        return color;
    }

    public int getAge() {
        return age;
    }

    public String getCountryProduction() {
        return countryProduction;
    }

    public String getBodyType() {
        return bodyType;
    }

    public int getSeatsCount() {
        return seatsCount;
    }

    public void setEngineSize(double engineSize) {
        this.engineSize = engineSize;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getTransmission() {
        return transmission;

    }

    public Key getKey() {
        return key;
    }

    public void setKey(Key key) {
        this.key = key;
    }

    public void setTransmission(String transmission) {
        if (transmission == null) {
            this.transmission = "МКПП";
        } else {
            this.transmission = transmission;
        }
    }

    public String getRegisterNumber() {

        return registerNumber;
    }

    public void setRegisterNumber(String registerNumber) {

        if (registerNumber == null) {
            this.registerNumber = "x000xx000";
        } else {
            this.registerNumber = registerNumber;
        }
    }

    public boolean isTire() {
        return isTire;
    }

    public void setTire(boolean tire) {
        isTire = tire;
    }

    public void changeTire() {
        isTire = !isTire;
    }

    public boolean isCorrectRegNumber() {
        if (registerNumber.length() != 9) {
            return false;
        }
        char[] chars = registerNumber.toCharArray();
        if (!Character.isAlphabetic(chars[0]) || !Character.isAlphabetic(chars[4]) || !Character.isAlphabetic(chars[5])) {
            return false;
        } else if
        (!Character.isDigit(chars[1]) || !Character.isDigit(chars[2]) || !Character.isDigit(chars[3]) ||
                        !Character.isDigit(chars[6]) || !Character.isDigit(chars[7]) || !Character.isDigit(chars[8])) {
            return false;
        }
        return true;
    }

    public static class Key {
        private final boolean remoteRunEngine;
        private final boolean withoutKeyAccess;

        public Key(boolean remoteRunEngine, boolean withoutKeyAccess) {
            this.remoteRunEngine = remoteRunEngine;
            this.withoutKeyAccess = withoutKeyAccess;
        }

        public Key() {
            this(false, false);
        }

        public boolean isRemoteRunEngine() {
            return remoteRunEngine;
        }

        public boolean isWithoutKeyAccess() {
            return withoutKeyAccess;
        }
    }

    public static class Insurance {
        private final LocalDate expireDate;
        private final double coast;
        private final String number;

        public Insurance(LocalDate expireDate, double coast, String number) {
            if (expireDate == null) {
                this.expireDate = LocalDate.now().plusDays(365);
            } else {
                this.expireDate = expireDate;
            }

            this.coast = coast;

            if (number == null) {
                this.number = "123456789";
            } else {
                this.number = number;
            }
        }

        public LocalDate getExpireDate() {
            return expireDate;
        }

        public double getCoast() {
            return coast;
        }

        public String getNumber() {
            return number;
        }

        public void checkExpireDate(){
            if (expireDate.isBefore(LocalDate.now())||expireDate.isEqual(LocalDate.now())){
                System.out.println("Нужно срочно ехать оформлять новую страховку");
            }
        }
        public void checkNumber(){
            if (number.length()!=9){
                System.out.println("Номер страховки некорректный!");
            }
        }
    }



    @Override
    public String toString() {
        return "Марка: " + getBrand() + "| " +
                " Модель: " + getModel() + "| " +
                " Объем двигателя: " + getEngineSize() + "| " +
                " Цвет: " + getColor() + "|" +
                " Год производства: " + getAge() + "|" +
                " Страна приозвидства: " + getCountryProduction() + " | " +
                "Коробка передач: " + getTransmission() + " | " +
                "Кузов: " + getBodyType() + " | " +
                "Номер: " + getRegisterNumber() + " | " +
                "Количество мест: " + getSeatsCount() + " | " +
                (isTire() ? " летняя " : " зимняя ") + " резина";
    }
}