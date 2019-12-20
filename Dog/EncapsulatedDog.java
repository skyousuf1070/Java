package Dog;

public class EncapsulatedDog {
    private int size;

    void setSize(int asize) {
        if (asize > 0) {
            size = asize;
        }
    }

    int getSize()
    {
        return size;
    }

    void bark()
    {
        if (size>60)
        {
            System.out.println("Woof! Woof");
        }
        else if(size>14)
        {
            System.out.println("Roof! Roof!");
        }
        else
        {
            System.out.println("Yip! Yip!");
        }
    }
}
