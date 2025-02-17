package LinkedList;
import java.util.*;

public class LL {
    class Node{
        String data;
        Node next;

        Node(String data){
            this.data = data;
            this.next = null;
        }
    }

    //add - first , last

    public void addFirst(String data){
        Node newNode = new Node(data);
        Node head = null;
        if(head == null){
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }
    public void addLast(String data){
        Node newNode = new Node(data);
        Node head = null;
        if(head == null){
            head = newNode;
            return;
        }
        Node currNode  = head;
        while(currNode != null){
            currNode = currNode.next;
        }
        currNode.next = newNode;
    }

    //print
    public void printList(){
        Node head = null;
        if(head == null){
            System.out.println("List is empty");
        }
        Node currNode = head;
        while(currNode != null){
            System.out.print(currNode.data + " -> ");
            currNode = currNode.next;
        }
        System.out.println("NULL");
    }

    public static void main(String[] args) {
        LL list = new LL();
        list.addFirst("a");
        list.addFirst("is");
        list.printList();
    }
}
