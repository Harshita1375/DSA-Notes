class PerfetArr{
    public static int perfect(int[] arr){
        int t=arr[arr.length-1]+1;
        int c=0;
        for(int i=1;i<arr.length;i++){
            if(arr[i-1]==arr[i]){
                arr[i]=t;
                t=t+1;
                c++;

            }
        }
        return c;

    }
    public static void main(String[] args) {
        int[] arr={1,2,2,3,4,4,5,5,6,7,8,8,9};
        int c=perfect(arr);
        System.out.println("no of operations : "+ c);
    }
}