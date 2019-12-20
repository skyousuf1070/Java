package SimpleDotComGame;

import static java.lang.Integer.parseInt;

public class SimpleDotCom {
    private int[] locationCells;
    private int numOfHits;

    String checkYourSelf(String guess)
    {
        int index = parseInt(guess);
        if (locationCells[index]!=0) {
            locationCells[index] = 0;
            numOfHits++;
            if (numOfHits==3){
                return "kill";
            }
            else {
                return "hit";
            }
        }
        else
        {
            return "miss";
        }
    }

    void setLocationCells(int[] loc) {
        locationCells = loc ;
    }

    int getNumOfHits(){
        return numOfHits;
    }
}
