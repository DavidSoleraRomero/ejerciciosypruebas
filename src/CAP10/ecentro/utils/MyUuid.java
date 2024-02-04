package CAP10.ecentro.utils;

public class MyUuid {
    public static String newUUID() {
        String ret = "";
        for (int i = 0; i <= 10; i++) {
            ret += String.valueOf((int) (Math.random() * 100));
        }
        return ret;
    }
}
