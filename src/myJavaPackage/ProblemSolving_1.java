package myJavaPackage;

public class ProblemSolving_1 {
    //Write a method named printName.
    //
    //Inside the method, create a String variable with your name.
    //
    //Print the name.


    static void printname(){
        String name="propa";
        System.out.println(name);

    }

    //Write a method named printAge.
    //
    //Create an int variable called age.
    //
    //Print "My age is: <age>".
    static void printAge(){
        int age=33;
        System.out.println("My age is " + age);

    }
//Write a method named addNumbers.
//
//Create two int variables (for example a = 5, b = 10).
//
//Print their sum.
static void addNumber(){
    int a=5;
    int b = 10;
    int c = (a+b);
    System.out.println(c);

}
// Write a method named greetings.
//
//It should take one String parameter (the name).
//
//Print "Hello, <name>!".

    static void greetings (String name){


        System.out.println("Hello " + name + "!");
    }

//    Write a method named printStudentInfo.
//
//It should take two parameters: String name, int age.
//
//Print "Name: <name>, Age: <age>".
static void printStudentInfo(String name, int age){


    //System.out.println("Name:" + name +"+  "Age: " + age );

    //System.out.println("My Age is " + age);
}

//Write a method named addNumbers.
//
//It should take two int parameters.
//
//Print their sum

    static void addNumbers (int a, int b){


        System.out.println(a+b);
    }
    public static void main(String[] args) {
       //printname();
        //printAge();
       // addNumber();
        //greetings("Batch 10");
        //printStudentInfo("propa", 33);
        addNumbers(10 ,15);
    }


}
