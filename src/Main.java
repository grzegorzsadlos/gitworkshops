import java.util.ArrayList;
import java.util.List;

public class Main{

    public static void main(String[] args) {
        List<String> tab = new ArrayList<>();
        tab.add("a");
        tab.add("b");
        tab.add("c");
        tab.add("d");
        tab.add("e");

        System.out.println(tab.toString());

        Name("Roger");

    }
    public static void Name(String name){
        System.out.println("My name is: "+ name);
    }
}

