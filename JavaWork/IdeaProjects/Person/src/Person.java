import java.lang.String;
public class Person {
    String name;
    int age;
    String gender;
    static String[] interests = new String[3];


    public  Person(String name, int  age, String gender, String[] interests){
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.interests = interests;
    }


    public static void main(String[] args){
        Person person = new Person("Lwandile", 13, "male",
                new String[] {"being a hardarse", "agile", "ssd hard drives"} );


        System.out.println("Hello, My name is "+ person.name+" and I am "+person.age+
                " years old. My interests are "+ person.interests[0]+", "+
                person.interests[1]+", and "+person.interests[2]);
    }
}
