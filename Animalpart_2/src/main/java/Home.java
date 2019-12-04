import java.util.*;

public class Home {
    ArrayList<Animals> pets = new ArrayList<Animals>();

    public void adoptPet(Animals pet){
        pets.add(pet);
    }
    public void makeAllSounds(){
        for(Animals a: pets){
            a.sounds();
        }
    }

}
