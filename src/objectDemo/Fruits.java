package objectDemo;

public class Fruits {

    String name;
    String color;
    String shape;
    float weight;

    public void texture(){
        System.out.println("fruits texture");

    }


    public void aroma(){
        System.out.println("fruits aroma");
    }


    public void test(){
        System.out.println("fruits test");
    }

    public static void main(String[] args) {
     Fruits Apple =new Fruits();
       Apple.name="Apple";
        Apple.shape="round";
        Apple.color="red";
        Apple.weight=2.5f;
       Apple.texture();
       Apple.aroma();
        Apple.test();
        System.out.println(Apple.color);


        Fruits Banana =new Fruits();
        Banana.name="Banana";
        Banana.shape="crescent";
        Banana.color="yellow";
        Banana.weight=0.2f;
        Banana.texture();
        Banana.aroma();
        Banana.test();


        System.out.println(Apple.name);











    }













}
