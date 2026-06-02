// create a list and perform opertions based on commands
// input:5
// 12 0 1 78 12
// 2
// Insert
// 5 23
// Delete
// 0
// output:0 1 78 12 23
import java.io.*;
import java.util.*;

public class Main{

    public static void main(String[] args) {
        List <Integer> list= new ArrayList <Integer>(); 
     Scanner scan=new Scanner(System.in);
     int n=scan.nextInt();
     for(int i=0;i<n;i++){
        int num=scan.nextInt();
        list.add(num);
     }
             System.out.println(list);

     int m=scan.nextInt();
     for(int i=0;i<=m;i++){
       String option=scan.next();
       if(option.equalsIgnoreCase("Insert")){
        int position=scan.nextInt();
        int num=scan.nextInt();
        list.add(position,num);
        System.out.println(list);
       }
      else if(option.equalsIgnoreCase("Delete")){
        int position=scan.nextInt();
        list.remove(position);
    System.out.println(list);

       }
     }    
       for (int num : list) {
            System.out.print(num + " ");
        }   
    }
}
