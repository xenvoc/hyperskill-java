public class ExceptionDemo {
    public static void main(String[] args) {
        int[] demoArray  = {0, 1, 2, 3, 4, 5};

        demo(demoArray);
    }

    public static void demo(int[] input) {
        System.out.println(input[10]);
    }
}
