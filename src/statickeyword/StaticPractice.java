package statickeyword;

public class StaticPractice {
    String name;
    String color;
   static int age;
    float weight;

    public static void hunting(){
        System.out.println("cats hunt");
    }


    public static void scratching(){
        System.out.println("cat,s scratch");
    }

    public static void climbing(){
        System.out.println("cat,s climb");

    }

    public static void main(String[] args) {

       StaticPractice mini=new StaticPractice();
        mini.name="Mini";
        age=2;
        mini.color="white";
        mini.weight=2.5f;
        hunting();
        scratching();
        climbing();


        StaticPractice milo=new StaticPractice();
        milo.name="Milo";
        age=1;
        milo.color="black";
        milo.weight=3.4f;
        hunting();
        scratching();
        climbing();

        StaticPractice lina=new StaticPractice();
        lina.name="Lina";
       age=3;
        System.out.println(lina.age);
        lina.color="gray";
        lina.weight=2.1f;
        hunting();
        scratching();
        climbing();

        System.out.println(lina.name);
        System.out.println(age);
        System.out.println("hunting");
        System.out.println("scratching");
        System.out.println("climbing");



    }
































}
