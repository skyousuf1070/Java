package Variables;

public class Variables {
    public static void main(String[] args)
    {
        byte b = 34;
        short s = 567;
        int i = 8987;
        long l = 6785490;

        float f = 45.67f;
        double d = 45690.9009;

        // Assigning a high sized variable to the low sized variable is not possible and we may loose data if we do.
      /*  b = l;
        s = l;
        i = l;
        s = i;
        b = i;
        b = s;  */

        l = b;
        System.out.println(l);

        l=s;
        System.out.println(l);

        l=i;
        System.out.println(l);

        d = f;
        System.out.println(d);
    }
}
