import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.NoSuchElementException;

public class MyIteratorIntTest {

    @Test
    void remove_once(){
        MyIteratorInt myIteratorInt = new MyIteratorInt(1, 2, 3);
        Assertions.assertThrows(IllegalStateException.class,() -> myIteratorInt.remove());
    }
    @Test
    void remove_twice(){
        MyIteratorInt myIteratorInt = new MyIteratorInt(1, 2, 3);
        myIteratorInt.next();
        myIteratorInt.remove();
        Assertions.assertThrows(IllegalStateException.class,() -> myIteratorInt.remove());
    }
    @Test
    void remove_work_norm(){
        MyIteratorInt myIteratorInt = new MyIteratorInt(1, 2, 3);
        myIteratorInt.next();
        myIteratorInt.remove();
        Integer[] expected = {null, 2, 3};
        Assertions.assertArrayEquals(expected, myIteratorInt.integerMas);
        Assertions.assertThrows(IllegalStateException.class,() -> myIteratorInt.remove());
    }
    @Test
    void hasNext_true(){
        MyIteratorInt myIteratorInt = new MyIteratorInt(1, 2, 3);
        Assertions.assertTrue(myIteratorInt.hasNext());
    }
    @Test
    void hasNext_false(){
        MyIteratorInt myIteratorInt = new MyIteratorInt();
        Assertions.assertFalse(myIteratorInt.hasNext());
    }
    @Test
    void next_throw_exception(){
        MyIteratorInt myIteratorInt = new MyIteratorInt();
        Assertions.assertThrows(NoSuchElementException.class,() -> myIteratorInt.next());
    }
    @Test
    void next_return_number(){
        MyIteratorInt myIteratorInt = new MyIteratorInt(1, 2, 3);
        Assertions.assertEquals(1, myIteratorInt.next());
    }
}
