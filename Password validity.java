//To check if password matches or not
import java.util.*;

class Password {
    public static void main(String a[]) {
        int i, flag = 0;
        String s2 = "Jia2005";
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Password");
        String s1 = sc.next();
        int n = s2.length();
        char[] a1 = new char[n];
        char[] a2 = new char[n];
        a1 = s1.toCharArray();
        a2 = s2.toCharArray();
        System.out.println("*******");
        
        for(i = 0; i < n - i; i++) {
            if(a1[i] == a2[i]) {
                continue;
            } else {
                flag = 1;
                break;
            }
        }
        
        if (flag == 0)
            System.out.println("Password entered is correct");
        else
            System.out.println("Password entered is incorrect");
    }
}
