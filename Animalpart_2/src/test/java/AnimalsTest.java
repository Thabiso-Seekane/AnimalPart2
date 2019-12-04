import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AnimalsTest {

    Dog dog = new Dog();
    Cat cat = new Cat();

    @Test
    void dogSounds() {
        assertEquals("Barks", dog.sounds());
        System.out.println("Dog making a sound test passed!!");
    }

    @Test
    void dogEats() {
        assertEquals("Food",dog.eat());
        System.out.println("Dog eating food test passed!!");
    }

    @Test
    void catSounds(){
        assertEquals("Meow",cat.sounds());
        System.out.println("Cat making sound test passed!!");
    }
    @Test
    void catEats()
    {
        assertEquals("Food",cat.eat());
        System.out.println("Cat eating food test passed!!");
    }
}