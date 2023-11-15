package seminars.second.hw;

import org.junit.jupiter.api.Test;


import static org.assertj.core.api.AssertionsForClassTypes.assertThat;


class VehicleTest {

    Car car = new Car("Mitsubishi", "Pajero Sport 2", 2015);
    Motorcycle moto = new Motorcycle("Honda", "CB400SF", 2001);

    //- Проверить, что экземпляр объекта Car также является экземпляром транспортного средства (используя оператор instanceof).
    @Test
    void instanceOf() {
        assertThat(car instanceof Vehicle);
    }

    //- Проверить, что объект Car создается с 4-мя колесами.
    @Test
    void WheelsCar() {
        assertThat(car.getNumWheels()).isEqualTo(4);
    }

    // - Проверить, что объект Motorcycle создается с 2-мя колесами.
    @Test
    void MotorcycleWheels() {
        assertThat(moto.getNumWheels()).isEqualTo(2);
    }

    //- Проверить, что объект Car развивает скорость 60 в режиме тестового вождения (используя метод testDrive()).
    @Test
    void testDriveCar() {
        car.testDrive();
        assertThat(car.getSpeed()).isEqualTo(60);
    }

    // - Проверить, что объект Motorcycle развивает скорость 75 в режиме тестового вождения (используя метод testDrive()).
    @Test
    void testDriveMotorcycle() {
        moto.testDrive();
        assertThat(moto.getSpeed()).isEqualTo(75);
    }

    //- Проверить, что в режиме парковки (сначала testDrive, потом park, т.е. эмуляция движения транспорта) машина останавливается (speed = 0).
    @Test
    void parkCar() {
        car.testDrive();
        car.park();
        assertThat(car.getSpeed()).isEqualTo(0);
    }

    //- Проверить, что в режиме парковки (сначала testDrive, потом park, т.е. эмуляция движения транспорта) мотоцикл останавливается (speed = 0).
    @Test
    void parkMotorcycle() {
        moto.testDrive();
        moto.park();
        assertThat(moto.getSpeed()).isEqualTo(0);
    }

}