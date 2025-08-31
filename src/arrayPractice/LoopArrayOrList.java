package arrayPractice;

import java.util.ArrayList;

public class LoopArrayOrList {

    static void ArrayLoop() {

        String[] name = {"Basir", "Arafat", "Farhana", "Sabrina"};
        String FirstName = name[0];
        //System.out.println(FirstName);
       // for (int i = 0; i <=4; i++) {
          //  System.out.println(name[i]);


       // }
        // for Each
        for (String allname: name){
            System.out.println(allname);
        }




    }

    static void ArrayListLoop() {
        ArrayList<String> nameList = new ArrayList<>();
        nameList.add("Bashir");
        nameList.add("Arafat");
        nameList.add("Farhana");
        nameList.add("Sabrina");

        String firstName = nameList.get(0);
        //System.out.println(firstName);

        String lastName = nameList.get(1);
       // System.out.println(lastName);


       // for (int i = 0; i <=4; i++) {
            //System.out.println(nameList.get(i));


       // }
        for (String allname: nameList){
            System.out.println(allname);
        }

    }


    static void practice(){

        // 0, 20, 30, 40, 50 -- array and ArrayList

        Integer[] number = {0, 20, 30, 49, 50};

       // for (Integer a: number){
           // System.out.println("Printing the Arrylist by using for each loop " + a);
       // }

        for (int x = 4; x >= 0; x--) {
            System.out.println(number[x]);
        }


    }
    static void practice2() {
        ArrayList<Integer> numbers = new ArrayList<>();

        numbers.add(0);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);
        numbers.add(50);

        for (Integer b: numbers){
            System.out.println("Printing the Arrylist by using for each loop " + b);
        }
    }

static void practice3(){

    for (int i = 1; i <= 100; i++) {
        System.out.println(i);
    }

}
    static void practice4(){

        //10,30,25,50,8,15 max number
        int[] numbers = {10, 30, 25, 50, 8, 15};

        int max = numbers[0];
        for (int i = 1; i <=5; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
            }
        }

        System.out.println("Maximum number is: " + max);
    }

    public static void main(String[] args) {
        //ArrayLoop();
       // ArrayListLoop();
        practice4();


    }


}