class Z_arr{
    public static void main(String[] args){
        String s="aabcaadaab";
        int[] z=compute(s);
        for(int x:z){
            System.out.println(x+" ");
        }
    }
    public static int[] compute(String s){
        int n=s.length();
        int[] z=new int[n];
        int l=0,r=0;
        for(int i=1;i<n;i++){
            if(i>r){
                l=r=i;
                while(r<n && s.charAt(r)==s.charAt(r-l)) r++;
                z[i]=r-l;
                r--;

            }
            else{
                int k=i-l;
                if(z[k]<r-i+1){
                    z[i]=z[k];
                }else{
                    l=i;
                    while(r<n && s.charAt(r)==s.charAt(r-l)) r++;
                    z[i]=r-l;
                    r--;
                }
            }
        }
        return z;
    }
}