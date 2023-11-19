class Car {
    private String brand;
    private Motor motor;

    public Car(String brand) { //rakennin
        this.brand = brand;
        this.motor = new Motor();
    }

    public Motor getMotor() {
        return this.motor;
    }

    class Motor {
        public void printCarBrand() {
            System.out.println(brand);
        }
    }
}

class Main {
    public static void main(String[] args) {
        Car datsun = new Car("Datsun 100a");
        datsun.getMotor().printCarBrand();  // getMotor-metodia  moottorin saamiseks ja sit kutsutaan motor luokan printCarBrand-metodia.
    }
}
