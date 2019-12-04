public class Animals {
    private String name;

    public String sounds(){
//        System.out.println("test sound");
        return "sound";
    }
    public String eat(){
//        System.out.println(name + "food");
        return "Food";
    }
    public String getName(){
        return name;
    }

    public void setName(String name1) {
        this.name = name1;
    }
}
