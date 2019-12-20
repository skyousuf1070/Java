public class NinetyNineBottlesOfBeer{
    public static void main(String[] args)
    {
        int count = 99;
        String word = "bottles";
        while(count>0)
        {
            if (count == 1)
                word = "bottle";
            System.out.println(count+ " "+word+" of beer on the wall");
            System.out.println(count+" "+word+" of beer");
            System.out.println("Take it one and pass it on");
            count = count-1;
        }
        if(count==0)
        {
            System.out.println("No more beer");
        }
    }
}