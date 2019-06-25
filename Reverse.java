import java.util.Scanner;
public class Reverse {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num;
        int x=0,res=0;
        System.out.print("Enter a number:");
        num=sc.nextInt();
        while(num!=0){
            x=num%10;
            res=res*10+x;
            num=num/10;
        }
        System.out.println("The reverse of a number is:"+res);
    }
}

