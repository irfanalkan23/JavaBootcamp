package day01;

import java.time.LocalDate;

class Person{

    public String name;
    public char gender;
    public LocalDate DOB;

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


        Person person1 = new Person();

    }

}
