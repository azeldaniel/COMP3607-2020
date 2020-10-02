public class AnimalTest {

    public AnimalTest(){
        super();
    }

    public static void main(String args[]) {
        Animal animal = new Animal();
        animal.makeNoise();

        DeafDog deafDog = new DeafDog();
        deafDog.makeNoise();        
    }
}
