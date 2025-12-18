import java.util.*;
public class Stack{
    private int[] stack;
    private int capacity;
    private int top;
    Stack(int size){
        stack=new int[size];
        capacity=size;
        top=-1;
    }
    public void push(int val){
        if(isFull()){
            return;
        }
    
        stack[++top]=val;
    }

    public int pop(){
        if(isEmpty()){
            return -1;
        }
        return stack[top--];
        
    }
    public int peek(){
        if(isEmpty()){
            return -1;
        }
        return stack[top];
    }
    public boolean isEmpty(){
        return top==-1;
    }
    public boolean isFull(){
        return top==capacity-1;
    }
    public static void main(String[] args){
        Scanner ob=new Scanner(System.in);
        int n=ob.nextInt();
        Stack st=new Stack(n);
        st.push(ob.nextInt());
        st.push(ob.nextInt());
        st.push(ob.nextInt());
        st.push(ob.nextInt());
        System.out.println(st.pop());
        System.out.println(st.pop());
        System.out.println(st.peek());
    }
}
