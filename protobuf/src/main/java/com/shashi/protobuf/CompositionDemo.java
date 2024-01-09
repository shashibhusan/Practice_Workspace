package shashi.protobuf;

import com.google.protobuf.Int32Value;
import com.shashi.models.Address;
import com.shashi.models.Car;
import com.shashi.models.Person;

import java.util.ArrayList;

public class CompositionDemo {
    public static void main(String[] args) {
        Address address = Address.newBuilder()
                .setPostbox(277207)
                .setStreet("Maniar")
                .setCity("Ballia")
                .build();

        Car alto = Car.newBuilder()
                .setMake("Alto")
                .setModel("K10")
                .setYear(2017)
                .build();

        Car swift = Car.newBuilder()
                .setMake("Swift")
                .setModel("VXI")
                .setYear(2017)
                .build();

        ArrayList<Car> cars = new ArrayList<Car>();
        cars.add(alto);
        cars.add(swift);

        Person person = Person.newBuilder()
                .setName("shashi")
                .setAge(Int32Value.newBuilder().setValue(35).build())
                .setAddress(address)
                .addAllCar(cars)
                .build();
        System.out.println(
                person.toString()
        );
    }
}
