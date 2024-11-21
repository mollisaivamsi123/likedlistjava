// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;
class Main {
    public static void main(String[] args) {
        System.out.println("Try programiz.pro");
        String[] str = {"sai", "vamsi", "dad"};
        for(String s : str){
            System.out.print(s+" ");
        }
        System.out.println();
        Collections.sort(Arrays.asList(str),Collections.reverseOrder());
        //Arrays.sort(str);
        for(String s : str){
            System.out.print(s+" ");
        }
        Arrays.sort(str);
        System.out.println("\nfound sai at index : "+Arrays.binarySearch(str,"sai"));
        List<String> row =  new ArrayList<>(Arrays.asList(str));
        Collections.addAll(row,"row");
        for(String run : row){
            System.out.print(run+" ");
        }
    }
}
