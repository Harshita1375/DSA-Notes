import java.util.*;
import java.io.*;
public class UniqueMedian{
    public static void main(String[] args){
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb=new StringBuilder();
        int n=Integer.parseInt(br.readLine());
        while(n>0){
            int size=Integer.parseInt(br.readLine());
            int[] a=Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            sb.append(countGoodArrays(a,size)).append("\n");
        }
        System.out.print(sb);
        
    } 
    private static int countGoodArrays(int[] a,int n){
        Map<Integer,Integer> map=new HashMap<>();
        int count=0;
        for(int i=0;i<n;i++){
            count+=map.getOrDefault(a[i],0)+1;
            map.put(a[i],map.getOrDefault(a[i],0)+1);
        }
        return count;
    }
}