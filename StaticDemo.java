class StaticDemo {

    static int num;

    // static block
    static {
        num = 10;
        System.out.println("Static block executed");
    }

    // static method
    static void display() {
        System.out.println("Value of static variable: " + num);
    }

    public static void main(String args[]) {

        System.out.println("Main method started");
        display();
    }
}