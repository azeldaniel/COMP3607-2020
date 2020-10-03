package solutions.question_7;

public class AnimalTest {

    public AnimalTest() {
        super();
    }

    public static void main(String args[]) {
        Animal animal = new Animal();
        DeafDog deafDog = new DeafDog();

        Cat cat = new Cat();
        cat.makeNoise();

        Dog dog = new Dog();
        dog.makeNoise();
    }
}
