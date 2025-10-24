class Problem {
    public static void main(String[] args) {
        int arg1 = Integer.parseInt(args[1]);
        int arg2 = Integer.parseInt(args[2]);
        switch (args[0]) {
            case "+":
                System.out.println(arg1 + arg2);
                break;
            case "-":
                System.out.println(arg1 - arg2);
                break;
            case "*":
                System.out.println(arg1 * arg2);
                break;
            default:
                System.out.println("Unknown operator");
        }

    }
}