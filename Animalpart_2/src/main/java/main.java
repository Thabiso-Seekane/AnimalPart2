public class main {
    public static  void main(String[] args){
        Home objhome = new Home();
        Dog objdog = new Dog();
        Dog objdog1 = new Dog();
        Cat cat = new Cat();


//        objhome.adoptPet(objdog);
//        objhome.adoptPet(objdog1);
//        objhome.adoptPet(cat);
//        objhome.makeAllSounds();

        System.out.println(objdog.eat());
        System.out.println(objdog.sounds());

        System.out.println(cat.eat());
        System.out.println(cat.sounds());

    }
}
