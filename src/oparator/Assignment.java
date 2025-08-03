package oparator;

public class Assignment {

    void evnOrOdd(){
     int a =20;

     if (a%2 ==0){
         System.out.println(a  + " is a even number");


     }

      else{
         System.out.println(a + " is a odd number");


     }



    }
void positiveOrNegative(int a){

    if (a >0){
        System.out.println(a  + " is a positive number");


    }
    else if(a<0){
        System.out.println(a + " is a negative number");


    }
    else if (a==0){
        System.out.println(a + " is a zero");


    }

}



    public static void main(String[] args) {
        Assignment obj=new Assignment();
        obj.evnOrOdd();
obj.positiveOrNegative(0);
    }





}
