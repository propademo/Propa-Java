package loopDemo;

public class LoopPractice {


    static void loopIntro() {
        int a = 50;
        while (a <= 70) {

            System.out.println(a+ " times ---- Hello Evertone");
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


            } else if (a%2==1) {
                System.out.println(a+ "is an odd number");
            } else {
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


    static void print1_100() {
        int a = 1;
        while (a <= 10) {

            System.out.println(a);
            a++;
        }

    }
    static void whileloop() {
        int a = 1;
        while (a <= 10) {
            if (a>5){
                break;
            }

            System.out.println(a + " Hello");
            a++;

        }
    }


    static void loop() {
        int a = 1;
        while (a <= 20) {
            if (a<=10){
                System.out.println(a);
            }
            else {


                System.out.println("Hello");

            }
            a++;
        }
    }

//Create a loop from 1 to 15.
//
//For the first 5 numbers → print the number itself.
//
//For the next 5 numbers → print "Java".
//
//For the last 5 numbers → print "Done".
static void loop2() {
    for (int i = 1; i <= 15; i++) {
        if (i <= 5) {

            System.out.println(i);
        } else if (i <= 10) {

            System.out.println("Java");
        } else {

            System.out.println("Done");
        }
    }
}
//Create a loop from 1 to 10.
//
//If the number is odd, print the number.
//
//If the number is even, print "Even Number".

    public static void evenOdd2() {
        for (int i = 1; i <= 10; i++) {

            if (i <= 5) {
                System.out.println(i);
                if (i % 2 == 0) {
                    System.out.println("Even");
                }
                else {
                    System.out.println("Odd");
                }
            } else {

                System.out.println("Hello");
            }
        }
    }
//Take an int variable (say n = 5) and use a loop to print its multiplication table (5 × 1 … 5 × 10)
public static void loop3() {

    for (int i = 1; i <= 10; i++) {
        System.out.println(i + " × " + i + " = " + (i * i));
    }
}
//Write a program that checks between 1-20 if the number is divisible by 5.
public static void loop4() {

    for (int i = 1; i <= 20; i++) {
        if (i % 5 == 0) {
            System.out.println(i + " is divisible by 5");
        }
        else {
            System.out.println(i + " is not divisible by 5");
        }
    }
}

//Write a program that checks between 1-20 if the number is divisible by 5 or 3 or 5&3.

    public static void loop5() {
        for (int i = 1; i <= 20; i++) {
            if (i % 3 == 0 ) {
                System.out.println(i + " is divisible by 3");
            }
            else if (i % 5 == 0) {
                System.out.println(i + " is divisible by 5");
            }
            else if (i % 3 == 0 && i % 5 == 0) {
                System.out.println(i + " is divisible by both 3 and 5");
            }
            else {
                System.out.println(i + " is not divisible by 3 or 5");
            }
        }
    }


    public static void main(String[] args) {
       //evenOdd2();
        //whileloop();
        loop5();
    }

}
