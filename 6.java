class HelloWorld {
    public static void main(String[] args) {
        for(int i=0;i<5;i++){
            int n=5;
            for(int j=0;j<=i;j++){
                System.out.print(n+" ");
                n--;
            }
            for(int k=i+1;k<5;k++){
                System.out.print(n+" ");
            }
            System.out.println();
        }
    }
}
