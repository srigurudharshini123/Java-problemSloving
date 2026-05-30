// (a+2^0.b),(a+2^0.b+2^1.b), (a+2^0.b+2^1.b+2^2.b),(a+2^0.b+2^1.b+2^2.b+...........+2^n-1.b)
// input:a=0,b=2,n=10
// output: 2 6 14 30 62 126 254 510 1022 2046
import java.util.*;
import java.io.*;

class Solution{
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        
        int t=in.nextInt();
        for(int i=0;i<t;i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            
            int sum=a;
            for(int j=0;j<n;j++){
            sum=sum+(int)Math.pow(2,j)*b;
            System.out.print(sum+" ");
              }
        System.out.println();
        }
       in.close();
       } 
          
    }
