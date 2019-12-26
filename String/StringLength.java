package Java.String;

public class StringLength {
    public String[] listOfWords;
    StringLength(String[] words)
    {
        //System.out.println(words.length);
        int len = words.length;
        listOfWords = new String[len];
        for (int i=0; i<words.length; i++)
        {
            listOfWords[i] = words[i];
        }
    }

    void printWords()
    {
        for (String word: listOfWords)
        {
            System.out.println(word);
        }
    }
    public static void main(String[] args)
    {
        String[] words = new String[1];
        words[0] = "Yousuf";
        //System.out.println(words[0]);
        StringLength sl = new StringLength(words);
        sl.printWords();
    }
}
