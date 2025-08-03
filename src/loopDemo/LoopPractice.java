package loopDemo;

public class LoopPractice {


    static void loopIntro() {
        int a = 50;
        while (a <= 70) {

            System.out.println("Hello");
            a++;

        }
    }
    static void loopIntro2() {
        int a = 50;
        while (a >= 1) {

            System.out.println("The value of a is"+ a);
            a--;

        }
    }
    static void evenOdd() {
        int a = 1;
        while (a <= 100) {
            if (a %2==0){
                System.out.println(a  + " is an even number");


            }
            else {
                System.out.println(a + " is an odd number");


            }
            a++;

        }
    }
    public static void forLoop() {
        for (int a = 1; a <= 100; a++) {
            System.out.println(a);
        }

    }


    public static void main(String[] args) {
        forLoop();
    }

}
