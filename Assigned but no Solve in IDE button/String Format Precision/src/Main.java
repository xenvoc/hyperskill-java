public class Main {
    public static void main(String[] args) {
        float floatNum = 0.52259035f;
        System.out.println(String.format("%4f", floatNum));
        System.out.println(String.format("%.4f", floatNum));
        System.out.println(String.format("%.4s", floatNum));
    }
}