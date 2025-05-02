//This is a simple program for performing linear search.
//Its time complexity improves if the array or the list to be traversed is sorted.
import java.util.Scanner;

public class LinearSearch {
    public static boolean search(int[] arr, int key){
        for(int i : arr){
            if(i==key)
                return true;
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number of elements in array : ");
        int m=sc.nextInt();

        System.out.println("Eneter the elements of array : ");
        int[] arr=new int[m];
        for(int i=0;i<m;i++)
            arr[i]=sc.nextInt();

        System.out.print("Enter the number to Search : ");
        int k= sc.nextInt();

        if(search(arr,k))
            System.out.println("Element Found!!");
        else
            System.out.println("Element not found!!");
    }
}
