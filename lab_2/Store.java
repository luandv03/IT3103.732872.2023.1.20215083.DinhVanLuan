/**
* @author Đinh Văn Luận - 20215083
*/

public class Store {
    public static final int MAX_NUMBERS_OF = 10000;
    private DigitialVideoDisc itemsInStore[] = new DigitialVideoDisc[MAX_NUMBERS_OF];
    private int qtyOrdered;

    public Store() {
        this.qtyOrdered = 0;
    }

    public void addDigitialVideoDisc(DigitialVideoDisc disc) {
        if (qtyOrdered <= Cart.MAX_NUMBERS_OF) {
            itemsInStore[qtyOrdered] = disc;
            qtyOrdered++;
            System.out.println("The disc has been added");
        } else System.out.println("The cart is almost full");
    }

    // remove any dvd from itemsOrdered.
    public DigitialVideoDisc removeDigitialVideoDisc(DigitialVideoDisc disc) {
    for (int i = 0; i < qtyOrdered; i++) {
        if (itemsInStore[i].equals(disc)) {
            DigitialVideoDisc tmp = itemsInStore[i];
            for (int j = i; j < qtyOrdered; j++) {
                itemsInStore[j] = itemsInStore[j+1];
            }
            qtyOrdered--;
            return tmp;
        }
    }

        return null;
    }
} 