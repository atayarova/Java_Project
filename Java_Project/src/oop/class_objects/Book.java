package oop.class_objects;

public class Book {
    public String name;
    public String avtor;
    public String janr;
    public int pages;
    public String open(){
        return "open";
    }
    public String emotions () {
        return "sadness";
    }
    public String closed(){
        return "page";
    }
    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", avtor='" + avtor + '\'' +
                ", janr='" + janr + '\'' +
                ", pages=" + pages +
                '}';
    }
}
