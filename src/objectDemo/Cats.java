package objectDemo;

public class Cats {


    String name;
    String color;
    int age;
    float weight;

    public void hunting(){
        System.out.println("cats hunt");
    }


    public void scratching(){
        System.out.println("cat,s scratch");
    }

    public void climbing(){
        System.out.println("cat,s climb");

    }

    public static void main(String[] args) {

        Cats mini=new Cats();
        mini.name="Mini";
        mini.age=2;
        mini.color="white";
        mini.weight=2.5f;
        mini.hunting();
        mini.scratching();
        mini.climbing();


        Cats milo=new Cats();
        milo.name="Milo";
        milo.age=1;
        milo.color="black";
        milo.weight=3.4f;
        milo.hunting();
        milo.scratching();
        milo.climbing();

        Cats lina=new Cats();
        lina.name="Lina";
        lina.age=3;
        System.out.println(lina.age);
        lina.color="gray";
        lina.weight=2.1f;
        lina.hunting();
        lina.scratching();
        lina.climbing();

        System.out.println(lina.name);

    }




















}
