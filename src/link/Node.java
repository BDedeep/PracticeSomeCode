package link;

public class Node {
    int data;
    Node next;
    Node(int data){
        this.data = data;
        this.next = this;
    }
}

class single{

    Node head =null;
    public void insert(int data){
        Node node = new Node(data);
        if(head == null){
            head = node;
            return;
        }

        Node temp = head;
        while (temp.next!=null){
            temp = temp.next;
        }
        temp.next=node;
    }


    public static void main(String[] args) {
        single single = new single();
        single.insert(1);
        single.insert(10);


    }
}
