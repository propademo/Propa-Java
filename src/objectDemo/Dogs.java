package objectDemo;

public class Dogs {
    String name;
    String color;
    int age;
    float weight;
    String breed;

        public void protective() {

            System.out.println("dog is protective");
        }


        public void loyal() {

            System.out.println("dog is loyal");

        }


        public void playful() {

            System.out.println("dog is playful");
        }

        public static void main(String[] args) {
            Dogs willow = new Dogs();
            willow.name = "willow";
            willow.age = 1;
            willow.color = "black";
            willow.breed="labrador";
            willow.weight = 5.0f;
            willow.protective();
            willow.loyal();
            willow.playful();
            System.out.println(willow.color);

            Dogs goofy = new Dogs();
            goofy.name = "goofy";
            goofy.age = 2;
            goofy.color = "white";
            goofy.breed="bulldog";
            goofy.weight = 5.6f;
            goofy.protective();
            goofy.loyal();
            goofy.playful();
            System.out.println(goofy.age);

            Dogs luna = new Dogs();
            luna.name = "luna";
            luna.age = 1;
            luna.color = "white";
            luna.breed="husky";
            luna.weight = 6.2f;
            luna.protective();
            luna.loyal();
            luna.playful();
            System.out.println(luna.breed);










        }


    }
