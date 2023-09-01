import  java.util.Scanner;

class Programme{


     public static void main(String[] arg){
        Scanner saisie = new Scanner(System.in);
        int a,b,c;
        System.out.print("a = ");

        a = saisie.nextInt();
        System.out.print("b = ");
        b = saisie.nextInt();
        System.out.print("c = ");
        c = saisie.nextInt();

        int temp;
        temp = a;
        a = b;
        b = c;
        c = temp;

        System.out.print("a = " + a + ", b = " + b + ", c = " + c);
        saisie.close();


     }
}