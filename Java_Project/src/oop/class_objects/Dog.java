package oop.class_objects;

public class Dog {
    // Instance variables / fields
    public String name;
    public int age;
    public String color;
    public String bread;

    public String eat(){
        return "Omnom nom! Yummy";
    }

    public String bark(){
        return "Gav-Gav";
    }

    public String sleep(){
        return "Zzzz...";
    }

//    @Override
//    public String toString() {
//        return "Dog{" +
//                "name='" + name + '\'' +
//                ", age=" + age +
//                ", color='" + color + '\'' +
//                ", bread='" + bread + '\'' +
//                '}';
//    }
}
