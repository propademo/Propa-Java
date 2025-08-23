package arrayPractice;

public class ArrayDemo {

    static void evenOdd() {
        Integer[] number = {2, 4, 5, 7, 8, 11, 13};
        //System.out.println(number.length);
        //System.out.println(number[0]);
        int a = 0;
        while (a <= 6) {
            System.out.println(number[a]);
            a++;
        }
    }


    static void accessToArray(){

   String []name={"Basir","Arafat","Sabrina","Shifat"};
int a=0;
while (a<=3){

    System.out.println(name[a]);
    a++;
}

for (int i =0;i<name.length; i++){
    System.out.println(name[i]);
}
        }







public static void main(String[] args) {

        //evenOdd();
        accessToArray();

}





}
