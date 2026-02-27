// Student Class
class Student {
    int rollNo;

    void setRollNo(int r) {
        rollNo = r;
    }

    int getRollNo() {
        return rollNo;
    }
}

// Test Class (Inheritance)
class Test extends Student {
    int sub1, sub2;

    void setMarks(int m1, int m2) {
        sub1 = m1;
        sub2 = m2;
    }

    void getMarks() {
        System.out.println("Subject 1: " + sub1);
        System.out.println("Subject 2: " + sub2);
    }
}

// Sports Interface
interface Sports {
    int sMarks = 20;   // sports marks
    void setSports();
}

// Result Class (Multiple Inheritance using Interface)
class Result extends Test implements Sports {

    public void setSports() {
        System.out.println("Sports Marks: " + sMarks);
    }

    void displayResult() {
        int total = sub1 + sub2 + sMarks;

        System.out.println("Roll No: " + getRollNo());
        getMarks();
        setSports();
        System.out.println("Total Marks: " + total);
    }
}

// Main Class
public class ResultTest {
    public static void main(String[] args) {
        Result r = new Result();

        r.setRollNo(101);
        r.setMarks(70, 80);
        r.displayResult();
    }
}