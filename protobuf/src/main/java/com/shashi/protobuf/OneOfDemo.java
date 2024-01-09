package shashi.protobuf;

import com.shashi.models.Credentials;
import com.shashi.models.EmailCredentials;
import com.shashi.models.PhoneOTP;

public class OneOfDemo {

    public static void main(String[] args) {

        EmailCredentials emailCredentials = EmailCredentials.newBuilder()
                .setEmail("shashi@gmail.com")
                .setPassword("admin@1234")
                .build();

        PhoneOTP phoneOTP = PhoneOTP.newBuilder()
                .setNumber(981125980)
                .setCode(456)
                .build();
        Credentials credentials = Credentials.newBuilder()
                // One  of means only one value will set if you set more than one value older one will be replaced
                .setPhoneMode(phoneOTP)
                .setEmailMode(emailCredentials)
                .build();
        login(credentials);
    }

    private static void login(Credentials credentials) {
        switch (credentials.getModeCase()) {
            case EMAILMODE:
                System.out.println(credentials.getEmailMode());
                break;
            case PHONEMODE:
                System.out.println(credentials.getPhoneMode());
                break;
        }
    }
}
