package ObjectOrientedProgramming;

class Person {
    private String firstName;
    private String lastName;

    public String getFirstName(){
        return this.firstName;
    }
    public void setFirstName(String firstName){
        this.firstName = firstName;
    }
    public String getLastName(){
        return this.lastName;
    }
    public void setLastName(String lastName){
        this.lastName = lastName;
    }
}

public class Encapsulation {
    public  static void  main(String[] args){
        Person person = new Person();
        person.setFirstName("King");
        System.out.println(person.getFirstName());
        person.setLastName("David");
        System.out.println(person.getLastName());
    }
}
