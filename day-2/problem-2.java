// Queue ticket system
//input:ADD Sri
//     ADD Guru
//     REMOVE
//     DISPLAY
// Output:[Guru]
import java.util.*;
import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int len=scan.nextInt();//no.of lines
        scan.nextLine();
        Queue <String> q=new LinkedList<String>();
        for(int i=1;i<=len;i++){
        String s1=scan.nextLine();
        String arr[]=s1.split(" ");
        if(arr.length==2){
            if(arr[0].equals("ADD")){
                q.add(arr[1]);
            }
        }
       else if(arr.length==1){
            if(arr[0].equals("REMOVE")){
                q.poll();
            }
            else if(arr[0].equals("DISPLAY")){
                System.out.println(q);
            }
        }
        }
}
}
