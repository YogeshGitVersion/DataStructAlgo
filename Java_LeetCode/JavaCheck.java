import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @author - yogesh
 */
public class JavaCheck {
    public static void main(String[] args) {
        List<Integer> list  = new ArrayList<>();
        int i = 0;
        while (i++ < 10) {list.add(i);}

        Iterator it = list.iterator();
        while (it.hasNext()){

            System.out.println(it.next());
        }
    }
}



