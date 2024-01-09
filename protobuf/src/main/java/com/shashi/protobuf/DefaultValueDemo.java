package shashi.protobuf;

import com.shashi.models.Person;

public class DefaultValueDemo {

    public static void main(String[] args) {
        Person person = Person.newBuilder().build();
        // It will not throw the null pointer exception because there is no null in protobuf
        System.out.println("City : " + person.getAddress().getCity());
        // So if you are not sure about the value then you can check as below
        System.out.println(" " + person.hasAddress());
        //But has method is only available for Object values not for Scalar values
    }

}
