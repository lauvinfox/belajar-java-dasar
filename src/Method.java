public class Method {

    public static void main(String[] args) {
        sayHelloWorld();

        sayHello("Miftah", "Ilman");

        System.out.println(sum(10, 20));

        sayCongrats("Miftah", 80, 70, 60, 90, 95, 80);
    }

    // Without parameter
    static void sayHelloWorld() {
        System.out.println("Hello World!");
    }

    // With parameter
    static void sayHello(String firstName, String lastName) {
        System.out.println("Hello " + firstName + " " + lastName);
    }

    // Return value
    static int sum(int value1, int value2) {
        return value1+value2;
    }

    // Variable arguments
    static void sayCongrats(String nama, int... values) {
        int total = 0;
        for (var nilai: values) {
            total += nilai;
        }

        int finalValue = total/(values.length);
        if (finalValue >= 75) {
            System.out.println("Selamat " + nama + ", Anda dinyatakan lulus.");
            System.out.println("Dengan nilai " + finalValue);
        } else {
            System.out.println("Mohon maaf " + nama + ", Anda dinyatakan tidak lulus.");
            System.out.println("Dengan nilai " + finalValue);
        }
    }

    // Method overloading
    static void sayHi() {
        System.out.println("Hello");
    }

    static void sayHi(String firstName) {
        System.out.println("Hello " + firstName);
    }

    static void sayHi(String firstName, String lastName) {
        System.out.println("Hello " + firstName + " " + lastName);
    }

    // Recursive method
    static int factorialRecursive(int number) {
        if (number == 1) {
            return 1;
        } else {
            return number * factorialRecursive(number-1);
        }
    }




}
