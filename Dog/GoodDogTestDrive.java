package Dog;

public class GoodDogTestDrive {
    public static void main(String[] args)
    {
        EncapsulatedDog d1 = new EncapsulatedDog();
        d1.setSize(30);
        System.out.println(d1.getSize());
        d1.bark();

        EncapsulatedDog d2 = new EncapsulatedDog();
        d2.setSize(12);
        d2.bark();
    }
}
