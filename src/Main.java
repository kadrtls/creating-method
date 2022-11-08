import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Bir sayı giriniz.");
        int num= scanner.nextInt();
        int n=num%5;
        if (num>0){
            for (int i=num;i>=-4;i=i-5){
                System.out.print(i+",");
                if (i<=0){
                    for (int j=n;j<=num;j=j+5){
                        System.out.print(j+",");
                    }
                }
            }

        }
    }
}