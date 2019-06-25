import java.util.Scanner;
public class Sort {
    public static void main(String[] args) {
        int arr[]=new int[8];
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the elements in the array:");
        for(int i=0;i<8;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("The sorted array is:");
        for(int j=0;j<8;j++){
            for(int k=0;k<8;k++){
                if(arr[j]<arr[k]){
                    int temp=arr[j];
                    arr[j]=arr[k];
                    arr[k]=temp;
                }
            }
        }
        for(int a=0;a<8;a++){
            System.out.print(arr[a]);
        }
    }
}
