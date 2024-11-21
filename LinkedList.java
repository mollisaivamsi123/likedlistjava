// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;
class Main {
    public static void main(String[] args) {
        System.out.println("Try programiz.pro");
        List<String> linkedlist = new LinkedList<>();
        Scanner scan = new Scanner(System.in);
        String s = "";
        while(!s.equals("e")){
            linkedlist.add(scan.nextLine());
            s = scan.nextLine();
        }
        ListIterator<String> itr = linkedlist.listIterator();
        while(itr.hasNext()){
            System.out.print(itr.next()+"->");
        }
        System.out.println("null");
        itr = linkedlist.listIterator();
        while(itr.hasNext()){
            if(itr.next().equals("vamsi")){
                itr.set("rolex");
            }
        }
        linkedlist.addFirst("krish");
        itr = linkedlist.listIterator();
        while(itr.hasNext()){
            System.out.print(itr.next()+"->");
        }
        System.out.println("null");
        linkedlist.remove("sai");
        itr = linkedlist.listIterator();
        while(itr.hasNext()){
            System.out.print(itr.next()+"->");
        }
        System.out.println("null");
        System.out.println(linkedlist);
        linkedlist.clear();
    }
}
