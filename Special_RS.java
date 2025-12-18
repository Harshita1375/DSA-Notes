class Special_RS{
    public static void main(String[] args){
        int arr[] = { 170, 45, 75, 90, 802, 24, 2, 66 };
        int n=arr.length;
        RadixSort(arr);
        System.out.println("Result Array: \n");
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void RadixSort(int[] arr){
        int m=max(arr);
        for(int i=1;m/i>0;i*=10){
            countsort(arr,i,arr.length);
        }

    }
    public static void countsort(int[] arr,int exp,int n){
        int[] output=new int[n];
        int[] count=new int[10];
        for(int i=0;i<n;i++){
            count[(arr[i]/exp)%10]++;
        }
        for(int i=1;i<10;i++){
            count[i]+=count[i-1];
        }
        for(int i=n-1;i>=0;i--){
            output[count[(arr[i]/exp)%10]-1]=arr[i];
            count[(arr[i]/exp)%10]--;
        }
        
        for(int i=0;i<n;i++){
            arr[i]=output[i];
        }
    }
    public static int max(int[] arr){
        int m=-1;
        for(int x:arr){
            m=Math.max(m,x);
        }
        return m;
    }
}
    