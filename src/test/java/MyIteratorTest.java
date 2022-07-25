import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MyIteratorTest {

    @Test
    void should_remove_once(){
        MyIterator myIterator = new MyIterator("one", "two");
        myIterator.next();
        myIterator.remove();
        Assertions.assertThrows(IllegalStateException.class,() -> myIterator.remove());
    }

}
