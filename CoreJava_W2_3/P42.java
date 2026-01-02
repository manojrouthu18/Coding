import java.util.TreeSet;
public class P42 {
    public static void main(String[] args) {
        TreeSet<String> set = new TreeSet<>((a, b) -> a.length() - b.length());
        set.add("Virat kohli");
        set.add("Rohit");
        set.add("Dhoni");
        set.add("Manoj");
        set.add("Kl");


        //print
        for (String name : set) {
            System.out.println(name);
        }
    }
}
