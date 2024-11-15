// Online Java Compiler
// Use this editor to write, compile and run your Java code online
class Node{
    int data;
    Node next = null;
}

class Main {
    public static void main(String[] args) {
        System.out.println("Try programiz.pro");

        Node list = new Node();//linked list
        Node head = list;//header
        //assign
        for(int i = 0;i < 5;i++){
            list.data = i;
            list.next = new Node();
            list = list.next;
        }
        list = head;
        //print all
        while(list.next != null){
            System.out.print(list.data+"->");
            list =  list.next;
        }
        System.out.print("null\n");
        //insert
        list = head;
        while(list.data != 3){
            list=list.next;
        }
        Node newNode = new Node();
        newNode.data=7;
        newNode.next = list.next;
        list.next = newNode;
        
        list =  head;
        while(list.next != null){
            System.out.print(list.data+"->");
            list=list.next;
        }
        System.out.print("null");
        list = head;
        while(list.next)
    }
}