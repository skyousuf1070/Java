package SimpleDotComGame;
import java.util.Scanner;
public class SimpleDotComGame {
    public static void main(String[] args)
    {
        int[] loc = {0,0,0,1,1,1,0};
        Scanner sc = new Scanner(System.in);
        SimpleDotCom sdc = new SimpleDotCom();

        sdc.setLocationCells(loc);
        int guessCount = 0;
        while(sdc.getNumOfHits()<3) {
            System.out.print("Enter a number: ");
            String s = sc.next();
            System.out.println(sdc.checkYourSelf(s));
            guessCount++;
        }
        //System.out.println("Kill");
        System.out.println("You took "+guessCount+" guesses");
    }
}
