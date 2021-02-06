import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();
        String c = A.substring(0, 1).toUpperCase() + A.substring(1);
        String d = B.substring(0, 1).toUpperCase() + B.substring(1);

        int a = A.length()+B.length();
        System.out.println(a);
        if(A.charAt(0)>B.charAt(0)){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
        System.out.println(c+" "+d);
        
    }
}
