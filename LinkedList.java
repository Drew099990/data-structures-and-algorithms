import static java.lang.System.out;
import java.util.Scanner;

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class SingleLinkedList {
    Node head;
    Node tail;

    void addLast(int data) {
        Node l1 = new Node(data);
        if (head == null) {
            head = l1;
            tail = l1;
        } else {
            tail.next = l1;
            tail = l1;
        }
    }
    void addFirst(int data){
        Node l1 = new Node(data);
        Node pointer = head;
        l1.next = pointer;
        head = l1;
    }

    void deleteFirst() {
        
        head = head.next;
        
    }
    void deleteLast(){
        Node pointer = head;
    while (pointer.next != tail) {
        pointer = pointer.next;
    }
    
    pointer.next = null;
    tail = pointer;
}
    void traverse() {
        Node pointer = head;
        while (pointer != null) {
            out.println("found data of " + pointer.data + " at address " + pointer);
            pointer = pointer.next;
            if (pointer.next == null){
                pointer = null;
            }
        }
    }
}
class dNode{
    String data ;
    dNode next;
    dNode prev;
    dNode(String data){
    this.data = data;
    this.next = null;
    this.prev = null;
    }
}

class doublyLinkedList{
    dNode head;
    dNode tail;
doublyLinkedList(){
    this.head = null;
    this.tail = null;
}

void addLast(String data){
    dNode l1 = new dNode(data);
    if(head == null){
        head = l1;
        tail = l1;
    }else{
        tail.next = l1;
        tail = l1;
    }
}

void addFirst(String data){
 dNode l1 = new dNode(data);
 l1.next = head;
 head.prev = l1;
 head = l1;
}

void removeFirst(){
    dNode l1 = head.next;
    l1.prev = null;
    head = l1;
}
void removeLast(){
    dNode l1 = head;
    while (l1.next != tail) {
        l1 = l1.next;
    }
    l1.next = null;
    tail = l1;

}
void traverse(){
    dNode pointer = head;
    while(pointer != null){
        out.println("found data of " + pointer.data + " at address " + pointer);
       pointer = pointer.next;
    }
}
}
public class LinkedList {
    public static void main(String[] args) {
        doublyLinkedList list_two = new doublyLinkedList();
        list_two.addLast("drew");
        list_two.addLast("william");
        list_two.addFirst("will");
        list_two.traverse();
        System.out.println("now deleting first element: \n");
        list_two.removeFirst();
        list_two.traverse();
        System.out.println("now deleting last element: \n");
        list_two.removeLast();
        list_two.traverse();
        System.out.println(" \n");
        SingleLinkedList list = new SingleLinkedList();
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of elements to add: ");
        int n = scanner.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.print("Enter element " + (i + 1) + ": ");
            int value = scanner.nextInt();
            list.addLast(value);
        }

        list.traverse();
        
        list.deleteFirst();
        System.out.println("now deleting one element: \n");
        list.traverse();
        System.out.println("now adding new first element: \n");
        list.addFirst(77);
        list.traverse();
        System.out.println("now deleting last element: \n");
        list.deleteLast();
        list.traverse();
    }

}



