// To print odd n even numbers from 1 to 15
// To print numbers from 1 to 15
import java.io.*;
import java.util.*;

class Even implements Runnable {
    public void run() {
        int i = 1;
        for (i = 0; i <= 15; i++) {
            if (i % 2 != 0) {
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {}
                System.out.println(i);
            }
        }
    }
}

class Odd implements Runnable {
    public void run() {
        int i = 1;
        for (i = 0; i <= 15; i++) {
            if (i % 2 == 0) {
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {}
                System.out.println(i);
            }
        }
    }
}

class Evenodd {
    public static void main(String a[]) {
        Runnable s1 = new Even();
        Thread t1 = new Thread(s1);
        Runnable s2 = new Odd();
        Thread t2 = new Thread(s2);
        t1.start();
        t2.start();
    }
}
