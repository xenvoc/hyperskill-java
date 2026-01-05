import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {
        ArrayList<String> list1 = new ArrayList<>();
        ArrayList<String> list2 = new ArrayList<>(50);
        ArrayList<String> list3 = new ArrayList<String>() {
            {
                add("Java");
                add("Bunnies");
                add("Fun");
                add("Clouds");
            }
        };

        ArrayList<String> list4 = new ArrayList<>(list3);

        ArrayList<String> names = new ArrayList<>();
        System.out.println(names.size());

        names.add("Jake");
        names.add("Jay");
        names.add(1, "Jill");
        names.add(0, "Jane");
        names.set(3, "Marie");
        System.out.println(names);
        System.out.println(names.size());
        System.out.println(names.get(0));
        System.out.println(names.get(3));

        names.remove("Jane");
        names.remove(1);
        names.clear();

        list2.addAll(names);
    }
}
