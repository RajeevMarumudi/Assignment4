import java.util.Scanner;
public class Amstrong {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n;
        int check=0,r=0,k;
        System.out.print("Enter a number:");
        n=sc.nextInt();
        k=n;
        while(n!=0){
            r=n%10;
            check=check+r*r*r;
            n=n/10;
        }
        if(check==k){
            System.out.println("The number is an Amstrong");
        }
        else{
            System.out.println("The number is not an Amstrong");
        }
    }
}
