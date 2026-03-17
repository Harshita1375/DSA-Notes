import java.util.*;
class  Tcs_q1{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        int z=0;
        int j=0;
        for(int i=0;i<n;i++){
            int x=sc.nextInt();
            if(x==0) {
                z++;
                continue;
            }
            arr[j]=x;
            j++;

        }
        for(int i=0;i<n;i++){
            System.out.print(arr[i]);
        }
    }
}