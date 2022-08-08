package day01;

import java.time.LocalDate;
import java.lang.String;

class Car{
    static class Tire{

    }
}


class Person{

    public String name ;
    public char gender;
    public LocalDate DOB;

    public static boolean isHuman;

    public static String planet;

    static{
        isHuman =true;
        planet = "Earth";
    }

    public Person(String name) {
        this.name = name;
    }

    public Person(String name, char gender) {
        this(name);
        this.gender = gender;
    }

    public Person(String name, char gender, LocalDate DOB) {
        this(name, gender);
        this.DOB = DOB;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", gender=" + gender +
                ", DOB=" + DOB +
                '}';
    }

}



public class ClassAndObject {

    public static void main(String[] args) {

        Person person1 = new Person("Daniel");
        Person person2 = new Person("Ozer");
        Person person3 = new Person("Yulia", 'F');
        Person person4 = new Person("Ariane", 'F', LocalDate.of(1991,6, 2));

        /*
        person1.name = "Josh";
        person2.name = "Inci";
        person3.name = "Bella";

        person1.name = "Aaron";
*/

    //    person2.DOB = LocalDate.of(1990, 4, 7);

        System.out.println(person1);
        System.out.println(person2);
        System.out.println(person3);
        System.out.println(person4);


        /*
        Person person4 = null;
        person4.name = "James";
        person4.gender = 'M';
        System.out.println(person4);
         */


/*
        System.out.println(person1.planet);
        System.out.println(person2.planet);
        System.out.println(person3.planet);
        System.out.println(person4.planet);
*/

        System.out.println(Person.planet);



    }

}
