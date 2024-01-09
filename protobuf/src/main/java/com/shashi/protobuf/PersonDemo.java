package shashi.protobuf;

import com.google.protobuf.Int32Value;
import com.shashi.models.Person;

public class PersonDemo {
    public static void main(String[] args) {
        Person shashi = Person.newBuilder()
                .setName("shashi")
                .setAge(Int32Value.newBuilder().setValue(35).build())
                .build();
        System.out.println(
                shashi.toString()
        );
    }
}
