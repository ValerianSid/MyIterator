import java.util.NoSuchElementException;

public class MyIteratorInt {
    Integer[] integerMas;
    int currentIndex;
    int lastIndex;

    public MyIteratorInt (Integer ... objs) {
        this.integerMas = objs;
        this.currentIndex = -1;
        lastIndex = -1;
    }

    public boolean hasNext(){
        return currentIndex + 1 < integerMas.length;
    }

    public Integer next(){
        if (hasNext()){
            currentIndex++;
            lastIndex = currentIndex;
            return integerMas[currentIndex];
        }
        throw new NoSuchElementException();
    }

    public void remove(){
        if (lastIndex == -1){
            throw new IllegalStateException();
        }
        integerMas[currentIndex] = null;
        lastIndex = -1;
    }
}
