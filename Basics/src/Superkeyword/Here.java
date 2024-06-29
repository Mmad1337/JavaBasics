package Superkeyword;

public class Here extends Person{
    String power;
    // set a constructor method 
    public Here(String name, int age, String power) {
        super(name, age);
        this.power = power;
    }
    public String toString(){
        return super.toString() + this.power;
    }
}
