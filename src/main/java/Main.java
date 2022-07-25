import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        MyIteratorInt myIteratorInt = new MyIteratorInt(1, 2, 3);
        System.out.println(myIteratorInt.hasNext());
        System.out.println(myIteratorInt.next());
        myIteratorInt.remove();
        myIteratorInt.remove();
    }
}
