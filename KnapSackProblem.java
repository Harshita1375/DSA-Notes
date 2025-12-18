import java.util.Arrays;
import java.util.Comparator;
class Item{
    int profit, weight;
    Item(int x,int y){
        this.profit=x;
        this.weight=y;
    }

}
class itemcomparator implements Comparator<Item>{
    @Override
    public int compare(Item a,Item b){
        double r1=(double)a.profit/(double)a.weight;
        double r2=(double)b.profit/(double)b.weight;
        if(r1>r2){
            return 1;
        }else if(r2>r1){
            return -1;
        }
        else{
            return 0;
        }
    }
}
public class KnapSackProblem{
    static double knapsackproblem(int W,Item[] arr,int n){
        Arrays.sort(arr, new itemcomparator()); 
        int w=0;
        double profit=0.0;
        for(int i=0;i<n;i++){
            if(w+arr[i].weight<=W){
                w+=arr[i].weight;
                profit+=arr[i].profit;
            }else{
                int remain=W-w;
                profit=profit+((double)arr[i].profit / (double)arr[i].weight) * (double)remain;
                break;

            }
        }
        return profit;
    }
    public static void main(String[] args){
        int n=5,weight=30;
        Item arr[] = {new Item (100,20),new Item(60,10),new Item(120,30),new Item(360,40),new Item(12,2)};
        double ans = knapsackproblem(weight, arr, n);
        System.out.println("The maximum value is "+ans);
    }
}