package scannerDemo;

import java.util.Scanner;

public class ScannerPractice {
    /**
     *
     */
    public void information (){
        Scanner scan =new Scanner(System.in);

        String name = scan.nextLine();
        int age = scan.nextInt();
        boolean isStudent= scan.nextBoolean();
        byte noStudy = scan.nextByte();
        float myHeight= scan.nextFloat();




        System.out.println("My name is " + name );
        System.out.println("My age is " + age );
        System.out.println(isStudent );
        System.out.println("The amount of dayes I didn,t study is "  +  noStudy  );
        System.out.println("My  actual height is "  +  myHeight);



    }

    public static void main(String[] args) {

        ScannerPractice obj = new ScannerPractice();
        obj.information ();

    }









}
