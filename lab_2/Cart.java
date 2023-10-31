/**
* @author Đinh Văn Luận - 20215083
*/

public class Cart {
    public static final int MAX_NUMBERS_OF = 20;
    private DigitialVideoDisc itemsOrdered[] = new DigitialVideoDisc[MAX_NUMBERS_OF];
    private int qtyOrdered;

    public Cart() {
        this.qtyOrdered = 0;
    }

    public void addDigitialVideoDisc(DigitialVideoDisc disc) {
        if (qtyOrdered <= Cart.MAX_NUMBERS_OF) {
            itemsOrdered[qtyOrdered] = disc;
            qtyOrdered++;
            System.out.println("The disc has been added");
        } else System.out.println("The cart is almost full");
    }

    // remove any dvd from itemsOrdered.
    public DigitialVideoDisc removeDigitialVideoDisc(DigitialVideoDisc disc) {
        for (int i = 0; i < qtyOrdered; i++) {
            if (itemsOrdered[i].equals(disc)) {
                DigitialVideoDisc tmp = itemsOrdered[i];
                for (int j = i; j < qtyOrdered; j++) {
                    itemsOrdered[j] = itemsOrdered[j+1];
                }
                qtyOrdered--;
                return tmp;
            }
        }

        return null;
    }

    public float totalCost() {
        float sum = 0;
        for (int i = 0; i < qtyOrdered; i++) {
            sum += itemsOrdered[i].getCost();
        }

        return sum;
    }

}
