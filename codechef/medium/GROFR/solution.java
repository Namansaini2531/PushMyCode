import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        String s = sc.next();
        
        int groups = 0;
        
        for(int i = 0; i < n; i++){
            if (s.charAt(i) == '1' && (i == 0 || s.charAt(i - 1) == '0')) {
                groups++;
            }
        }
        
        System.out.println(groups);
	}
}
