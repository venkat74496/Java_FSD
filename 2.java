import java.util.Scanner;
class HelloWorld {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int a=s.nextInt();
        if(a>0)
            System.out.print("the given number is positive");
        else if(a<0)
            System.out.print("the given number is negative");
        else if(a==0)
            System.out.print("the given number is zero")
    }
}
