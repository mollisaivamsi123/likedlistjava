// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;
class Main {
    public static void main(String[] args) {
        System.out.println("Try programiz.pro");
        List<List<String>> arr = new ArrayList<>();
        List<String> row1 = new ArrayList<>();
        List<String> row2 = new ArrayList<>();
        String str = "";
        Scanner scan = new Scanner(System.in);
        while(!str.equals("exit")){
            System.out.print("enter the elements : ");
            String[] st = scan.nextLine().split(" ");
            row1.add(st[0]);
            row2.add(st[1]);
            str = scan.nextLine();
        }
        arr.add(row1);
        arr.add(row2);
        for(List<String> runner : arr){
            System.out.println(runner);
        }
        for(List<String> run : arr){
            Iterator<String> itr = run.iterator();
            while(itr.hasNext()){
                System.out.print(itr.next()+" ");
       
            }
            System.out.println();
        }
        System.out.println("----end----");
        arr.get(1).set(0,"om");
        
        for(int i = 0;i<arr.size();i++){
            for(int j=0;j<arr.get(i).size();j++){
                System.out.print(arr.get(i).get(j)+" ");
            }
        }
        System.out.println();
        arr.remove(row1);
        for(List<String> runner : arr){
            System.out.println(runner);
        }

        arr.clear();
         for(List<String> runner : arr){
            System.out.println(runner);
        }
    }
}
