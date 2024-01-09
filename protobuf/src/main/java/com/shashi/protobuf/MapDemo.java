package shashi.protobuf;

import com.shashi.models.BodyStyle;
import com.shashi.models.Car;
import com.shashi.models.Dealer;

public class MapDemo {

    public static void main(String[] args) {
        Car alto = Car.newBuilder()
                .setMake("Alto")
                .setModel("K10")
                .setYear(2017)
                .setBodyStyle(BodyStyle.SEDAN)
                .build();

        Car swift = Car.newBuilder()
                .setMake("Swift")
                .setModel("VXI")
                .setYear(2017)
                .setBodyStyle(BodyStyle.COUPE)
                .build();

        Dealer dealer = Dealer.newBuilder()
                .putModels(2017, alto)
                .putModels(2022, swift)
                .build();

        System.out.println(

                dealer.getModelsOrThrow(2017).getBodyStyle()
        );
    }
}
