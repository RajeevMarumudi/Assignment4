import java.util.Scanner;
public class Search {
    public static void main(String[] args) {
        int n,x,temp=0,i=0;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the no. of elements to be entered:");
        n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter the elements in the array:");
        for(i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.print("Enter the element to search:");
        x=sc.nextInt();
        for(i=0;i<n;i++){
            if(arr[i]==x){
                temp=1;
                break;
            }
            else{
                temp=0;
            }
        }
        if(temp==1){
            System.out.println("Element found at:"+(i+1));
        }
        else{
            System.out.println("Element not found!");
        }

    }
}
