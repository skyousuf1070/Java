package For;

public class EnhancedForLoop {
    public static void main(String[] args)
    {
        String[] array = new String[3];
        array[0] = "Yousuf";
        array[1] = "Baba";
        array[2] = "Shaik";

        for (String name: array) {
            System.out.println(name);
        }
    }
}
