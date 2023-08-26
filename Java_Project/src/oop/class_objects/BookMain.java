package oop.class_objects;

import java.util.ArrayList;

public class BookMain {
    public static void main(String[] args) {
        Book harryPotter =new Book();
        harryPotter.name="Harry Potter";
        harryPotter.avtor="J.K. Rolling";
        harryPotter.janr="fantastic";
        harryPotter.pages=200;
        System.out.println(harryPotter.name);
        System.out.println(harryPotter.avtor);
        System.out.println(harryPotter.janr);
        System.out.println(harryPotter.pages);
        System.out.println(harryPotter.open());
        System.out.println(harryPotter.emotions());
        System.out.println(harryPotter.closed());
        System.out.println("_________");
        for(int i =0; i<harryPotter.name.length();i++){
            System.out.print(harryPotter.name.charAt(i));
        }
        System.out.println("______");
        Book novel=new Book();
        novel.name= "first master ";
        novel.avtor="Ch.Aitmatov";
        novel.janr="roman";
        novel.pages=100;
        ArrayList<Book>books=new ArrayList<>();
        books.add(novel);
        books.add(harryPotter);
        System.out.println(books);
//домашка
    }
}
