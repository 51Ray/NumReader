import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.Charset;
import java.util.Properties;

public class numProperty {

    private static Properties property;

    static {

        property = new Properties();
        try {
            property.load(new InputStreamReader(new FileInputStream(new File("config.properties")), Charset.forName("UTF-8")));
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public static String get_thousand0() {
        String thousand0 = property.getProperty("thousand0");
        return thousand0;
    }

    public static String get_thousand1() {
        String thousand1 = property.getProperty("thousand1");
        return thousand1;
    }

    public static String get_thousand2() {
        String thousand2 = property.getProperty("thousand2");
        return thousand2;
    }


    public static String p2() {
        String p2 = property.getProperty("p2");
        return p2;
    }

    public static String p3() {
        String p3 = property.getProperty("p3");
        return p3;
    }

    public static String p4() {
        String p4 = property.getProperty("p4");
        return p4;
    }

    public static String p5() {
        String p5 = property.getProperty("p5");
        return p5;
    }

    public static String p6() {
        String p6 = property.getProperty("p6");
        return p6;
    }

    public static String p7() {
        String p7 = property.getProperty("p7");
        return p7;
    }

    public static String p8() {
        String p8 = property.getProperty("p8");
        return p8;
    }

    public static String p9() {
        String p9 = property.getProperty("p9");
        return p9;
    }

    public static String p10() {
        String p10 = property.getProperty("p10");
        return p10;
    }

    public static String p11() {
        String p11 = property.getProperty("p11");
        return p11;
    }

    public static String end0() {
        String end0 = property.getProperty("end0");
        return end0;
    }

    public static String end1() {
        String end1 = property.getProperty("end1");
        return end1;
    }

}