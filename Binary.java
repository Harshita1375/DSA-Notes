import java.util.*;
public class Binary{
    public static void main(String[] args) {
        int[] arr={2,5,6,8,15,35};
        Scanner ob=new Scanner(System.in);
        int target=ob.nextInt();
        int pos=search(arr,target);
        if(pos==-1){
            System.out.println("Not present");
        }else{
            System.out.println("element found at "+(pos+1));
        }

    }
    private static int search(int[] arr,int key){
        int start=0;
        int end=arr.length;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(arr[mid]==key){
                return mid;
            }
            else if(arr[mid]>key){
                end=mid-1;
            }else{
                start=mid+1;
            }
        }
        return -1;
    }
}