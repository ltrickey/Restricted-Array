import java.util.ArrayList;
import java.util.Random;

public class RestrictedArray {
    private ArrayList internalArray = new ArrayList();
    private Random rand = new Random();
    private int size = rand.nextInt(20) + 1;

    //constructor for now only doing with random size and numbers
    public RestrictedArray() {
        internalArray = new ArrayList();
        for (int i = 0; i < size; i++)
        {
            Integer r = rand.nextInt() % 256;
            this.internalArray.add(r);
        }
    }
        
    public java.lang.Object get(int key) {
        if (key >= 0 && key < size) {
            return this.internalArray.get(key);
        } else return null;
    }

    public void set(int key, int value) {
        if (key >= 0 && key < size) {
            this.internalArray.set(key, value);
        }
    }

    // measure length
    public int length() {
        int i = 0;
        int count = 0;
        while (this.get(i) != null) {
            count ++;
            i ++;
        }
        return count;
    }

    // print array
    public void print() {
        int i = 0;
        while (this.get(i) != null) {
            System.out.print(this.get(i) + " ");
            i ++;
        }
        System.out.print("\n");
    }

    //reverse array
    public void reverse() {
        int i = 0;
        int j = this.length() - 1;
        while (i <= j) {
            int numAtI = (int) this.get(i);
            int numAtJ = (int) this.get(j);
            this.set(i, numAtJ);
            this.set(j, numAtI);
            i ++;
            j --;
        }
    }

}
