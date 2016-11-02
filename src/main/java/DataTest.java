import java.io.IOException;
import java.util.ArrayList;

public class DataTest {

    public static String startTest(String file) throws IOException {

        ArrayList<String> numList = Parser.getList(file);
        String skl = "";
        String fileString;
        String myString;

        int it = 0;
        int gt = 0;
        boolean ed;
        String info;
        while (it < numList.size() / 2) {

            fileString = numList.get(1 + gt);

            myString = JobConvert.numToTxt(numList.get(gt));

            ed = fileString.equals(myString);

            if (ed) info = "верно";
            else info = "строки различны";

            skl = skl + "------------\nСтрока: \t" + String.valueOf(it + 1) + "\n" +
                    "Исходное число: \t" + numList.get(gt) + "\n" +
                    "Тxt исходное число: \t" + fileString + "\n" +
                    "Txt число (мой метод): \t" + myString + "\n" +
                    info + "\n";

            it++;
            gt = gt + 2;

        }

        return skl;
    }

}