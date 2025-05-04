import java.util.Arrays;
import java.util.Scanner;

public class BinarySearch {

    private static boolean binarySearch(int[] arr, int key,int high, int low){
        int mid=low+(high-low)/2;//This condition prevents the overflow.

        if(low>high)
             return false;
        if(key==arr[mid])
            return true;
        else if(key>arr[mid])
            binarySearch(arr,key,high,mid+1);
        else
            binarySearch(arr,key,mid-1,low);
        return false;
    }

    //Below is the code for same operation but in iterative manner
    //In this we maintain a loop until low remains lesser than high
    //In below method only two parameter needs to be passed.
//    private static boolean binarySearch(int[] arr, int key){
//        //The array is sorted.
//        int high=arr.length-1;
//        int low=0;
//
//        while(low<high){
//            int mid=low+(high-low)/2;
//            if(key==arr[mid])
//                return true;
//            else if(key<arr[mid])
//                high=mid-1;
//            else
//                low=mid+1;
//        }
//        return false;
//    }

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

        Arrays.sort(arr);
        if(binarySearch(arr,k,arr.length-1,0))
            System.out.println("Element Found!!");
        else
            System.out.println("Element not found!!");
    }
}
