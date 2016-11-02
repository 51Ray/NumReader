import javafx.scene.control.Alert;

import java.util.regex.Pattern;

public class JobConvert {

    private static final Pattern CLEAR_PATTERN = Pattern.compile("[\\s]+");
    private static Pack pack;


    public static String numToTxt(String txt) {

        String global = "";

        //провека на корректность
        if (txt.matches("-?[\\d]+")) {

            pack = new Pack();
            pack.fillList(txt);

            for (int i = pack.getSizeList() - 1; i >= 0; i--) {

                global = global + pack.say100(pack.getPartNum(i)) + " ";

            }

            global = CLEAR_PATTERN.matcher(global).replaceAll(" ").trim();

        } else {

            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Ошибка");
            alert.setHeaderText("Некорректные исходные данные");
            alert.setContentText("Пожалуйста, измените исходные данные");
            alert.showAndWait();

        }
        return global;
    }

    public static String infoPart() {

        return pack.getAllPart();

    }
}