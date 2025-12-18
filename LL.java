import java.util.*;
class Node{
    int data;
    Node next;
    Node(int data1,Node next1){
        this.data=data1;
        this.next=next1;
    }
    Node(int data1){
        this.data=data1;
        this.next=null;
    }
    
}

// LinkedList class contains utility methods for linked list operations
public class LL {

    // Function to check if a given element is present in the linked list
    public static int checkifPresent(Node head, int desiredElement) {
        Node temp = head;

        // Traverse the linked list
        while (temp != null) {
            // Check if the current node's data is equal to the desired element
            if (temp.data == desiredElement)
                return 1;  // Return 1 if the element is found

            // Move to the next node
            temp = temp.next;
        }

        return 0;  // Return 0 if the element is not found in the linked list
    }
    public static void display(Node head){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+"->");
            temp=temp.next;
        }
        System.out.print("null");
    }
    public static Node insert(Node head,int val){
        if(head==null){
            return new Node(val);
        }
        Node temp=head;
        while(temp.next!=null){
            temp=temp.next;
        }
        temp.next=new Node(val);
        return head;
        
    }

    // Main function
    public static void main(String[] args) {
        // Create a linked list: 1 -> 2 -> 3
        Node head=null;
        Scanner ob=new Scanner(System.in);
        System.out.println("Enter no of nodes: ");
        int n=ob.nextInt();
        for(int i=0;i<n;i++){
            int v=ob.nextInt();
            head=insert(head, v);
        }
        int val = 13;  // Element to be checked for presence in the linked list
        System.out.println("\n insert before");
        display(head);
        insert(head, 5);
        System.out.println("\n insert After");
        display(head);
        // Call the checkifPresent function and print the result
        System.out.print("\n"+checkifPresent(head, val));
    }
}