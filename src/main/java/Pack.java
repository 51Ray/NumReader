import java.util.ArrayList;

/**
 * Created by Евгений on 31.10.2016.
 */
public class Pack {
    private ArrayList<PartNum> partNumList;

    public void fillList(String txt) {

        partNumList = new ArrayList<PartNum>();

        Integer len = txt.length();

        Integer add = len % 3;

        add = 3 - add;
        if (add == 3) add = 0;//не нуждаемся в трех нулях

        String n = "";

        for (int i = 0; i < add; i++) {

            n = n + "0";

        }

        txt = n + txt;

        Integer h = 0;
        Integer g = 0;
        len = txt.length();
        while (h < len) {

            char p1 = txt.charAt(len - (1 + h));
            char p2 = txt.charAt(len - (2 + h));
            char p3 = txt.charAt(len - (3 + h));

            PartNum pn1 = new PartNum(p1, p2, p3, g);
            partNumList.add(pn1);

            h = h + 3;
            g++;
        }
    }

    public String getPart(Integer index) {

        String s = partNumList.get(index).getPart();

        return s;
    }


    public Integer getSizeList() {

        Integer size = partNumList.size();

        return size;
    }

    public String getAllPart() {

        String s = "";

        for (int i = 0; i < partNumList.size(); i++) {

            s = s + partNumList.get(i).getPart();

        }

        return s;
    }

    public String getEnd(int index, char p1, char p2, char p3) {

        Integer p1_int = Character.getNumericValue(p1);
        Integer p2_int = Character.getNumericValue(p2);
        Integer p3_int = Character.getNumericValue(p3);
        String say = "";

        Integer p2p1_int = Integer.parseInt(String.valueOf(p2) + String.valueOf(p1));
        Integer p3p2p1_int = Integer.parseInt(String.valueOf(p3) + String.valueOf(p2) + String.valueOf(p1));

        //тысячи
        if (index == 1) {

            if (p1_int == 0 || p1_int == 5 || p1_int == 6 || p1_int == 7 || p1_int == 8 || p1_int == 9) p1_int = 0;
            if (p1_int == 2 || p1_int == 3 || p1_int == 4) p1_int = 2;


            switch (p1_int) {

                case 0:
                    say = numProperty.get_thousand0();
                    break;
                case 1:
                    say = numProperty.get_thousand0() + numProperty.get_thousand1();
                    break;
                case 2:
                    say = numProperty.get_thousand0() + numProperty.get_thousand2();
                    break;
                default:
                    say = "";
                    break;
            }

            if (p3p2p1_int == 0) {
                say = "";
            }
            if (p3p2p1_int == 100) {
                say = numProperty.get_thousand0();
            }

            if (p2p1_int >= 10 && p2p1_int < 20) say = numProperty.get_thousand0();

        }

        if (index > 1) {

            //млн и т.д.
            String t = "";

            switch (index) {

                case 2:
                    say = numProperty.p2();
                    break;
                case 3:
                    say = numProperty.p3();
                    break;
                case 4:
                    say = numProperty.p4();
                    break;
                case 5:
                    say = numProperty.p5();
                    break;
                case 6:
                    say = numProperty.p6();
                    break;
                case 7:
                    say = numProperty.p7();
                    break;
                case 8:
                    say = numProperty.p8();
                    break;
                case 9:
                    say = numProperty.p9();
                    break;
                case 10:
                    say = numProperty.p10();
                    break;
                case 11:
                    say = numProperty.p11();
                    break;
            }

            if (p1_int == 0 || p1_int == 5 || p1_int == 6 || p1_int == 7 || p1_int == 8 || p1_int == 9) p1_int = 0;
            if (p1_int == 2 || p1_int == 3 || p1_int == 4) p1_int = 2;


            switch (p1_int) {

                case 0:
                    t = numProperty.end0();
                    break;

                case 2:
                    t = numProperty.end1();
                    break;

            }

            if (p2p1_int >= 5 && p2p1_int < 20) t = numProperty.end0();

            say = say + t;
            if (p3p2p1_int == 0) {
                say = "";
            }
        }

        return say;
    }

    public String say1(PartNum pn) {
        char p1 = pn.getP1();
        char p2 = pn.getP2();
        char p3 = pn.getP3();

        Integer p1_int = Character.getNumericValue(p1);

        String say = "";
        String say1 = "";
        Integer index = pn.getIndex();


        switch (p1_int) {

            case 1:
                if (index == 1) say = "одна";
                else say = "один";
                break;
            case 2:
                if (index == 1) say = "две";
                else say = "два";
                break;
            case 3:
                say = "три";
                break;
            case 4:
                say = "четыре";
                break;
            case 5:
                say = "пять";
                break;
            case 6:
                say = "шесть";
                break;
            case 7:
                say = "семь";
                break;
            case 8:
                say = "восемь";
                break;
            case 9:
                say = "девять";
                break;
            default:
                say = "";
                break;
        }

        String probel = "";
        if (say != "") probel = " ";

        return say + probel + getEnd(index, p1, p2, p3);

    }

    public String say10(PartNum pn) {
        char p1 = pn.getP1();
        char p2 = pn.getP2();
        char p3 = pn.getP3();

        Integer p1_int = Character.getNumericValue(p1);
        Integer p2_int = Character.getNumericValue(p2);
        Integer p3_int = Character.getNumericValue(p3);

        Integer p2p1_int = Integer.parseInt(String.valueOf(p2) + String.valueOf(p1));

        String say = "";
        String say1 = "";
        Integer index = pn.getIndex();

        if (p2p1_int >= 1 && p2p1_int < 10) p2p1_int = 1;
        if (p2p1_int >= 20 && p2p1_int < 30) p2p1_int = 20;
        if (p2p1_int >= 30 && p2p1_int < 40) p2p1_int = 30;
        if (p2p1_int >= 40 && p2p1_int < 50) p2p1_int = 40;
        if (p2p1_int >= 50 && p2p1_int < 60) p2p1_int = 50;
        if (p2p1_int >= 60 && p2p1_int < 70) p2p1_int = 60;
        if (p2p1_int >= 70 && p2p1_int < 80) p2p1_int = 70;
        if (p2p1_int >= 80 && p2p1_int < 90) p2p1_int = 80;
        if (p2p1_int >= 90 && p2p1_int < 100) p2p1_int = 90;

        switch (p2p1_int) {
            case 1:
                say1 = say1(pn);
                break;
            case 0:
                say = "";
                say1 = getEnd(index, p1, p2, p3);
                break;
            case 10:
                say = "десять";
                say1 = getEnd(index, p1, p2, p3);
                break;
            case 11:
                say = "одиннадцать";
                say1 = getEnd(index, p1, p2, p3);
                break;
            case 12:
                say = "двенадцать";
                say1 = getEnd(index, p1, p2, p3);
                break;
            case 13:
                say = "тринадцать";
                say1 = getEnd(index, p1, p2, p3);
                break;
            case 14:
                say = "четырнадцать";
                say1 = getEnd(index, p1, p2, p3);
                break;
            case 15:
                say = "пятьнадцать";
                say1 = getEnd(index, p1, p2, p3);
                break;
            case 16:
                say = "шестьнадцать";
                say1 = getEnd(index, p1, p2, p3);
                break;
            case 17:
                say = "семнадцать";
                say1 = getEnd(index, p1, p2, p3);
                break;
            case 18:
                say = "восемьнадцать";
                say1 = getEnd(index, p1, p2, p3);
                break;
            case 19:
                say = "девятнадцать";
                say1 = getEnd(index, p1, p2, p3);
                break;

            case 20:
                say = "двадцать";
                say1 = say1(pn);
                break;
            case 30:
                say = "тридцать";
                say1 = say1(pn);
                break;
            case 40:
                say = "сорок";
                say1 = say1(pn);
                break;
            case 50:
                say = "пятьдесят";
                say1 = say1(pn);
                break;
            case 60:
                say = "шестьдесят";
                say1 = say1(pn);
                break;
            case 70:
                say = "семьдесят";
                say1 = say1(pn);
                break;
            case 80:
                say = "восемьдесят";
                say1 = say1(pn);
                break;
            case 90:
                say = "девяносто";
                say1 = say1(pn);
                break;
            default:
                say = "";
                say1 = getEnd(index, p1, p2, p3);
                break;
        }


        String probel = "";
        if (say != "") probel = " ";

        return say + probel + say1;

    }

    public String say100(PartNum pn) {

        char p3 = pn.getP3();

        Integer p3_int = Character.getNumericValue(p3);

        String say = "";
        String say1 = "";
        Integer index = pn.getIndex();


        switch (p3_int) {

            case 1:
                say = "сто";
                break;
            case 2:
                say = "двести";
                break;
            case 3:
                say = "триста";
                break;
            case 4:
                say = "четыреста";
                break;
            case 5:
                say = "пятьсот";
                break;
            case 6:
                say = "шестьсот";
                break;
            case 7:
                say = "семьсот";
                break;
            case 8:
                say = "восемьсот";
                break;
            case 9:
                say = "девятьсот";
                break;

            default:
                say = "";
                break;
        }

        say1 = say10(pn);

        String probel = "";
        if (say != "") probel = " ";

        return say + probel + say1;
    }


    public PartNum getPartNum(int index) {
        PartNum pn = partNumList.get(index);
        return pn;
    }

}
