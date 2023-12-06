import hust.soict.dsai.aims.disc.DigitalVideoDisc;

/**
* @author Đinh Văn Luận - 20215083
*/

public class Cart {
    public static final int MAX_NUMBERS_OF = 20;
    private DigitalVideoDisc itemsOrdered[] = new DigitalVideoDisc[MAX_NUMBERS_OF];
    private int qtyOrdered;

    public Cart() {
        this.qtyOrdered = 0;
    }

    public void addDigitalVideoDisc(DigitalVideoDisc disc) {
        if (qtyOrdered <= Cart.MAX_NUMBERS_OF) {
            itemsOrdered[qtyOrdered] = disc;
            qtyOrdered++;
            System.out.println("The disc has been added");
        } else System.out.println("The cart is almost full");
    }

    public void addDigitalVideoDisc(DigitalVideoDisc[] discList) {
           if (qtyOrdered <= Cart.MAX_NUMBERS_OF - discList.length) {
                for (int i = 0; i < discList.length; i++) {
                    itemsOrdered[qtyOrdered] = discList[i];
                    qtyOrdered++;
                }
                System.out.println("The disc list has been added");
            } else System.out.println("The cart is almost full");
    }

    public void addDigitalVideoDisc(DigitalVideoDisc disc1, DigitalVideoDisc disc2) {
         if (qtyOrdered <= Cart.MAX_NUMBERS_OF - 1) {
                itemsOrdered[qtyOrdered] = disc1;
                qtyOrdered++;
                itemsOrdered[qtyOrdered] = disc2;
                qtyOrdered++;
                System.out.println("The disc list has been added");
        } else System.out.println("The cart is almost full");
    }


    // remove any dvd from itemsOrdered.
    public DigitalVideoDisc removeDigitalVideoDisc(DigitalVideoDisc disc) {
        for (int i = 0; i < qtyOrdered; i++) {
            if (itemsOrdered[i].equals(disc)) {
                DigitalVideoDisc tmp = itemsOrdered[i];
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

    // Đinh Văn Luận - 20215083
    public void print() {
        System.out.println("***********************CART***********************");
        System.out.println("Ordered Items:");

        double totalCost = 0; 
        for (int i = 0; i < qtyOrdered; i++) {
            totalCost += itemsOrdered[i].getCost();
            System.out.println(itemsOrdered[i].toString());
        }

        System.out.println("Total cost: " + totalCost);
    }

    // Đinh Văn Luận - 20215083
    public void searchDVDsById(int id) {
        boolean check = false; // biến check này để kiểm tra sau khi duyệt hết danh sách thì có tìm được DVD cần tìm không

        for (int i = 0; i < qtyOrdered; i++) {
            if (itemsOrdered[i].getId() == id) {
                check = true;

                System.out.println(itemsOrdered[i].toString());
                break;
            }
        }

        if (!check) {
            System.out.println("Not DVDs match for id = " + id);
        }
    }

    public void searchDVDsByTitle(String title) {
        boolean check = false; // biến check này để kiểm tra sau khi duyệt hết danh sách thì có tìm được DVD cần tìm không

        for (int i = 0; i < qtyOrdered; i++) {
            if (itemsOrdered[i].isMatch(title)) {
                check = true;

                System.out.println(itemsOrdered[i].toString());
                break;
            }
        }

        if (!check) {
            System.out.println("Not DVDs match! for title = " + title);
        }
    }
}
