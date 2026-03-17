import java.util.*;
class Tcs_q2{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int t=n;
        String bin="";
        while(t>0){
            int r=t%2;
            if(r==0) r=1;
            else r=0;
            bin=r+bin;
            t=t/2;
        }
        int l=bin.length();
        int ans=0;
        for(int i=0;i<l;i++){

            ans+=(bin.charAt(i)-'0') * Math.pow(2,l-1-i);
        }
        System.out.println(ans);
    }
}