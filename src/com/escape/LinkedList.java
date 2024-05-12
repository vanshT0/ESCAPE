package com.escape;

public class LinkedList {

    Node head;
    Node tail;
    int size;

    public int size(){
        return size;
    }


    public void addLast(int data){
            Node temp = new Node();
            temp.data = data;
            tail.next = null;
        if(size == 0){
            head = temp;

        }else{

           temp.next = tail;
           tail = temp;

        }

        size++;
    }

    public void displayList(){

        Node temp = head;
        while(temp.next != null){
            System.out.println("Printing the current node " + temp.data);
            temp = temp.next;
        }

    }

    public void removeFirst(){

        if(size == 0) {
            System.out.println("List is empty");
        }

        if(size == 1){
            head = null;
            tail = null;
            size = 0;

        }

        head = head.next;
        size--;



    }

    public int getFirst(){
        if(size == 0) {
            System.out.println("Empty");
        }

            return head.data;


    }

    public int getLast(){
        if(size == 0) {
            System.out.println("Empty");
        }

        return tail.data;


    }

    public int getAtIndex(int i){

        if(size == 0) {
            System.out.println("Empty");
        }

        Node temp = head;
        int count = 0;
        while(count < i){
            temp = temp.next;
        }

        return temp.data;
    }

    public void addFirst(int value){

        Node temp = new Node();
        temp.data = value;
        temp.next = head;
        head = temp;
        if(size == 0){
            tail = temp;
        }

       size++;

    }

    public void addAtIndex(int value, int idx){
        Node temp = new Node();
        temp.data = value;
        int count = 0;
        Node temp1 = head;

        while(temp1.next != null && temp1!= null){
            if(count == idx - 1){
                temp1.next = temp.next;
            }
            temp1 = temp1.next;
            count++;
        }
    }


}
