// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;
class Main {
    public static void main(String[] args) {
        System.out.println("Try programiz.pro");
        List<List<String>> vector = new Vector<>();
        List<String> row1 = new Vector<>();
        List<String> row2 = new Vector<>();
        Scanner scan = new Scanner(System.in);
        String s = "";
        while(!s.equals("e")){
            String[] ent = scan.nextLine().split(" ");
            row1.add(ent[0]);
            row2.add(ent[1]);
            s = scan.nextLine();
        }
        vector.add(row1);
        vector.add(row2);
        for(List<String> run : vector){
            ListIterator itr = run.listIterator();
            while(itr.hasNext()){
                System.out.print(itr.next()+" ");
            }
            System.out.println();
        }
        vector.get(0).set(0,"faf");
        for(int i=0;i< vector.size();i++){
            for(int j=0;j<vector.get(i).size();j++){
                System.out.print(vector.get(i).get(j)+" ");
            }
        }
        vector.get(1).clear();
        System.out.println();
        for(int i=0;i< vector.size();i++){
            for(int j=0;j<vector.get(i).size();j++){
                System.out.print(vector.get(i).get(j)+" ");
            }
        }
    }
}
