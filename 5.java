import java.util.Scanner;
class HelloWorld {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int a=s.nextInt();
        int after_disc;
        if(a<500){
            System.out.print("no discount is applied");
        }
        else if(a>=500 && a<=1000){
            after_disc=a-(a*10/100);
            System.out.print("price after 10% discount "+after_disc);
        }
        else if(a>1000){
            after_disc=a-(a*20/100);
            System.out.print("price after 20% discount "+after_disc);
        }
    }
}
