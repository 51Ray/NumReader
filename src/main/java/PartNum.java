/**
 * Created by Евгений on 31.10.2016.
 */
public class PartNum {

    private char p1;
    private char p2;
    private char p3;
    private Integer index;

    PartNum(char p1, char p2, char p3, Integer index) {

        this.p1 = p1;
        this.p2 = p2;
        this.p3 = p3;

        this.index = index;

    }

    public String getPart() {

        String s = String.valueOf(this.index) + ")\t[3][2][1]\t" + String.valueOf(this.p3) + " " + String.valueOf(this.p2) + " " + String.valueOf(this.p1) + "\n";

        return s;
    }

    public char getP1() {
        return this.p1;
    }

    public char getP2() {
        return this.p2;
    }

    public char getP3() {
        return this.p3;
    }

    public Integer getIndex() {
        return this.index;
    }
}
