package part1.lesson03.task01;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

public class task01 {
    private static String str;

    public static void main(String[] args) {
        MathBox[] numberBox = new NumbersForMathBox().createNumbersArray();
        for (MathBox s:numberBox
             ) {

            System.out.println(s);
        }
    }
}
