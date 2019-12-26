package Java.String;

import java.util.ArrayList;
import java.util.Arrays;

public class StringSplit {
    String[] parse(String stringToVerify, String delimeter)
    {
        String[] temp = stringToVerify.split(delimeter);
        return temp;
    }

    public static void main(String[] args) {
        ArrayList<String> ar = new ArrayList<String>(Arrays.asList("Yousuf"));
        ar.add("Yousuf");
        System.out.println(ar.indexOf("Yousuf"));
        StringSplit ss = new StringSplit();
        String[] parsedStringToVerify = ss.parse("3-598-21507-X","-");
        for (String str : parsedStringToVerify) {
            //System.out.println(str.length());
            System.out.println(str.charAt(0));
        }
    }
}
