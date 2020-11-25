
import java.lang.*;
/**
 * Emploey
 */
public class Emploey {
    private static int nextId = 0;
    private int id;
    
    public Emploey() {
        id= nextId;
        nextId++;
    }

    @Override
    public String toString() {
        return new StringBuilder(String.format("%d",id)).toString();
    }

    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            System.out.println(new Emploey());
        }
    }
}