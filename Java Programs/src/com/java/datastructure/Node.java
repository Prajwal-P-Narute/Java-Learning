package com.java.datastructure;

public class Node {
    public int data;
    public Node next;

    public Node(int data){
        this.data = data;
        this.next = null;
    }

    public static void main(String[] args) {
        Node head = new Node(12 );

        head.next = new Node(13);
        head.next.next = new Node(14);
        head.next.next.next = new Node(15);
        head.next.next.next.next = head;

        System.out.println(lengthOfLinkedlist(head, 12));
    }

    public static boolean lengthOfLinkedlist(Node head, int key){

            boolean flag = false;
        while(head != null){
           if(head.data == key) {
               flag = true;
               break;
           }
            head = head.next;
        }
        return flag;
    }
}
