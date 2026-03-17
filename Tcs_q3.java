import java.util.*;
class Tcs_q3{
    public static void main(String args[]){
        ArrayList<String> days=new ArrayList<>();
        days.addAll(Arrays.asList("Sun","Mon","Tue","Wed","Thu","Fri","Sat"));
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        int n=sc.nextInt();
        int c=n/7;
        int r=n%7;
        int p=0;
        for(int i=0;i<7;i++){
            if(s.equals(days.get(i))) {
                p=i;
                break;
            }
        }
        if(p+r>=7) c++;
        System.out.print(c);
    }
}