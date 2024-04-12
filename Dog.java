package Hospital;

public class Dog {

    public Dog(){

    }
    String name;
    String breed;
    int age;
    public Dog(String name){
        this.name = name;
    }

    public Dog(String name, String breed){
        this.name = name;
        this.breed = breed;
    }

    public Dog(String name, String breed, int age){
        this.name = name;
        this.breed = breed;
        this.age = age;
    }
}
