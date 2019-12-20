package Dog;

class Dog{
    String name;
    void bark()
    {
        System.out.println(name+" Ruff! Ruff!");
    }
}

public class DogArray {
    public static void main(String[] args)
    {
        Dog d1 = new Dog();
        d1.name = "Folk";
        d1.bark();

        Dog[] myDogs = new Dog[3];
        myDogs[0] = new Dog();
        myDogs[1] = new Dog();
        myDogs[2] = d1;

        myDogs[0].name = "Fido";
        myDogs[1].name = "Roy";


        int i=0;
        while(i<myDogs.length)
        {
            myDogs[i].bark();
            i++;
        }
    }
}
