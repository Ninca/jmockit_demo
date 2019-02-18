import java.util.Random;

public class ADep {

    public static boolean isSth(String value) {
        if (value == null)
            return false;
        int orgLength = value.length();
        int randomNumber = randomNumber();
        return orgLength == randomNumber ? true : false;
    }

    private static int randomNumber() {
        return new Random().nextInt(7);
    }

}
