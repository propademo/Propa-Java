package arrayPractice;

import java.util.ArrayList;

public class ArraylistDemo {



    public void listOfCar() {

        ArrayList<String> carName = new ArrayList<>();
        carName.add("Honda");
        carName.add("Toyota");
        carName.add("Lexus");
        carName.add("BMW");
        System.out.println(carName);

        int carSize = carName.size();


        System.out.println(carSize);


        boolean empty = carName.isEmpty();
        System.out.println(empty);

        carName.remove("BMW");
        carName.add("Acura");
        System.out.println(carName);

        for (int i = 0; i < carName.size(); i++) {
            System.out.println(carName);


        }
    }

    public static void main(String[] args) {
        ArraylistDemo obj = new ArraylistDemo();
           obj.listOfCar();


    }






}
