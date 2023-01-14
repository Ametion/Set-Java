
import java.util.Iterator;


public class Main {
    public static void main(String[] args) {

        var set1 = new Set<Integer>();
        var set2 = new Set<Integer>();

        set1.AddItem(1);
        set1.AddItem(2);
        set1.AddItem(3);
        set1.AddItem(4);
        set1.AddItem(5);

        set2.AddItem(4);
        set2.AddItem(5);
        set2.AddItem(6);

        var set3 = set1.Intersection(set2);

        for(var el: set3){
            System.out.println(el);
        }
    }
}