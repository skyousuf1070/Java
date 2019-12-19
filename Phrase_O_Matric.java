public class Phrase_O_Matric{
    public static void main(String[] args)
    {
        String[] wordListOne = {"yousuf","balu","mani","praveen","mahesh","Teja"};
        String[] wordListTwo = {"then","there","this","that","those","them"};
        String[] wordListThree = {"Apple","mango","banana","pineApple"};

        int oneLen = wordListOne.length;
        int twoLen = wordListTwo.length;
        int threeLen = wordListThree.length;

        int rand1 = (int) (Math.random()*oneLen);
        int rand2 = (int) (Math.random()*twoLen);
        int rand3 = (int) (Math.random()*threeLen);

        System.out.println(wordListOne[rand1]+" "+wordListTwo[rand2]+" "+wordListThree[rand3]);
    }
}