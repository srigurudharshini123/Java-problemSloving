// student seperate class -> with name and marks;
// return grade based on each student marks
// input:95
// output:A

import java.util.*;
class Student{
    String name;
    double marks;
}
class Main {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        for(int i=1;i<=n;i++){
            Student s=new Student();
            s.marks=scan.nextDouble();
            scan.nextLine();
            s.name=scan.nextLine();
            if(s.marks>=90){
                System.out.println("A");
        }
        else if(s.marks<=89 && s.marks>=75){
            System.out.println("B");
        }
         else if(s.marks<=74 && s.marks>=50){
            System.out.println("D");
        }
         else if(s.marks<=50){
            System.out.println("E");
        }
        else{
            System.out.println("Invalid grade");
        }
    }
    }
}
