package myJavaPackage;

public class ParameterDemo {

    public void addition(int a, int b, int d){
String c ="a+b";
        System.out.println("c =" + c);

    }


    public void information (String name, String profession){


        System.out.println("My name is " + name + " and profession is " + profession);
    }

    public static void main(String[] args) {
        ParameterDemo obj =new ParameterDemo();
        obj.addition(90,30,40);

        obj.information("propa","Student");


    }










}
