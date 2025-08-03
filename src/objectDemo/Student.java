package objectDemo;

public class Student {



    byte noStudy;



    public void study(){

        byte noStudy = 50;

    }




    public void homework(){
        System.out.println("we complete our homework each week");
        byte noStudy = 50;
    }



    public static void main(String[] args) {

        Student firstStudent = new Student();

        firstStudent.noStudy = 50;
        System.out.println(firstStudent.noStudy);
        firstStudent.study();


        firstStudent.homework();



        String name="propa";
        System.out.println(name);
    }


























    }


