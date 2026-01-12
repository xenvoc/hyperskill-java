class Counter {

    public static boolean checkTheSameNumberOfTimes(int elem, List<Integer> list1, List<Integer> list2) {
        // implement the method
        // there is no need to input data from the command line
        // instead, use arguments elem, list1 and list2
        int[] list1Counter = {0};
        int[] list2Counter = {0};
        list1.forEach((n) -> { if (elem == n) list1Counter[0]++; });
        list2.forEach((n) -> { if (elem == n) list2Counter[0]++; });
        if (list1Counter[0] == list2Counter[0]) return true;
        return false;
    }
}