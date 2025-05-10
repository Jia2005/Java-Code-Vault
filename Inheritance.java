//Inheritance Code
import java.util.*;
import java.io.*;

class Staff {
    InputStreamReader isr = new InputStreamReader(System.in);
    BufferedReader br = new BufferedReader(isr);
    String name, add;
    int code;
    
    public void getData() throws IOException {
        System.out.println("Enter the Staff's Code");
        code = Integer.parseInt(br.readLine());
        System.out.println("Enter the Staff's Name");
        name = br.readLine();
        System.out.println("Enter the Staff's Address");
        add = br.readLine();
    }
    
    public void display() {
        System.out.println("Code = " + code);
        System.out.println("Name = " + name);
        System.out.println("Address = " + add);
    }
}

class Teacher extends Staff {
    String sub, c;
    
    public void getData() throws IOException {
        super.getData();
        System.out.println("Enter the Teacher's Subject");
        sub = br.readLine();
        System.out.println("Enter the Teacher's Class");
        c = br.readLine();
    }
    
    public void display() {
        super.display();
        System.out.println("Teacher's Subject = " + sub);
        System.out.println("Teacher's Class = " + c);
    }
}

class Officer extends Staff {
    String grade;
    
    public void getData() throws IOException {
        super.getData();
        System.out.println("Enter the Officer's Grade");
        grade = br.readLine();
    }
    
    public void display() {
        super.display();
        System.out.println("Officer's Grade is " + grade);
    }
}

class Typist extends Staff {
    String speed;
    
    public void getData() throws IOException {
        super.getData();
        System.out.println("Enter the Typist's Speed");
        speed = br.readLine();
    }
    
    public void display() {
        super.display();
        System.out.println("Typist's Speed is " + speed);
    }
}

class Regular extends Typist {
    String Bp;
    
    public void getData() throws IOException {
        super.getData();
        System.out.println("Enter the Regular's Basic Pay");
        Bp = br.readLine();
    }
    
    public void display() {
        super.display();
        System.out.println("Basic Pay of Regular is " + Bp);
    }
}

class AdHoc extends Typist {
    String Bp;
    
    public void getData() throws IOException {
        super.getData();
        System.out.println("Enter the Ad-Hoc's Basic Pay");
        Bp = br.readLine();
    }
    
    public void display() {
        super.display();
        System.out.println("Basic pay of Ad-Hoc is " + Bp);
    }
}

class Inheritance {
    public static void main(String a[]) throws IOException {
        System.out.println("\nTeacher's Data");
        Teacher s = new Teacher();
        s.getData();
        System.out.println("\nThe Teacher's Data is:-");
        s.display();
        
        System.out.println("\nOfficer's Data");
        Officer o = new Officer();
        o.getData();
        System.out.println("\nThe Officer's Data is:-");
        o.display();
        
        System.out.println("\nTypist's Data");
        Typist t = new Typist();
        t.getData();
        System.out.println("\nThe Typist's Data is:-");
        t.display();
        
        System.out.println("\nRegular's Data");
        Regular r = new Regular();
        r.getData();
        System.out.println("\nThe Regular's Data is:-");
        r.display();
        
        System.out.println("\nAd-Hoc's Data");
        AdHoc a1 = new AdHoc();
        a1.getData();
        System.out.println("\nThe Ad-Hoc's Data is:-");
        a1.display();
    }
}
