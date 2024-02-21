import java.util.Scanner;
class HelloWorld {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int a=s.nextInt();
        int rev=0;
        while(a!=0){
            int neq=a%10;
            rev=rev*10+neq;
            a=a/10;
        }
        System.out.print("reverse is;"+rev);
    }
}
