package core;

/**
 * Created by Asterium on 05.09.2016.
 */
public class IdGenerator {
    private long currentIndex = 0;
    public long getId(){
        long id = currentIndex + 1;
        currentIndex = id;
        return id;
    }
}
