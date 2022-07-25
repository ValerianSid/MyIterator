import java.util.NoSuchElementException;

public class MyIterator {

    private String[] stringMas;
    private int currentIndex;
    private boolean flag;

    public MyIterator(String ... objs) {
        this.stringMas = objs;
        this.currentIndex = -1;
        this.flag = false;
    }

    public boolean hasNext(){
        return currentIndex + 1 < stringMas.length;
    }

    public String next(){
        if (hasNext()){
            currentIndex++;
            flag = true;
            return stringMas[currentIndex];
        }
        throw new NoSuchElementException();
    }

    public void remove(){
        if (!flag){
            throw new IllegalStateException();
        }
        stringMas[currentIndex] = null;
        flag = false;
    }
}
