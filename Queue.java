import java.util.*;
public class Queue{
    private int[] queue;
    private int front;
    private int rear;
    private int capacity;
    private int size;
    Queue(int size){
        queue=new int[size];
        capacity=size;
        front=0;
        rear=-1;
        this.size=0;
    }
    public void enqueue(int val){
        if(isFull()){
            return;
        }
        rear=(rear+1)%capacity;
        queue[rear]=val;
        size++;
    }
    public int dequeue(){
        if(isEmpty()){
            return -1;
        }
        int val=queue[front];
        front=(front+1)%capacity;
        size--;
        return val;

    }
    public int peek(){
        if(isEmpty()){
            return -1;
        }
        return queue[front];
    }
    public boolean isFull(){
        return capacity==size;
    }
    public boolean isEmpty(){
        return size==0;
    }
    public static void main(String[] args) {
        Scanner ob=new Scanner(System.in);
        Queue q=new Queue(ob.nextInt());
        q.enqueue(ob.nextInt());
        q.enqueue(ob.nextInt());
        q.enqueue(ob.nextInt());
        System.out.println(q.dequeue());
        q.enqueue(ob.nextInt());
        System.out.println(q.peek());
        System.out.println(q.dequeue());
        System.out.println(q.peek());
    }
}