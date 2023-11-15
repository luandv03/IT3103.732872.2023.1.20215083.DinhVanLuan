/**
* @author Đinh Văn Luận - 20215083
*/

public class CartTest {
    public static void main(String[] args) {
        Cart cart = new Cart();

        DigitialVideoDisc dvd1 = new DigitialVideoDisc("The Lion King", "Animation", "Roger Allers", 87, 19.95f);
        cart.addDigitialVideoDisc(dvd1);

        DigitialVideoDisc dvd2 = new DigitialVideoDisc("Star Wars", "Science Fiction", "George Lucas", 87, 24.95f);
        cart.addDigitialVideoDisc(dvd2);

        DigitialVideoDisc dvd3 = new DigitialVideoDisc("Aladin", "Animation", 18.99f);
        cart.addDigitialVideoDisc(dvd3);

        System.out.println("Dinh Van Luan - 20215083");
        // Test the print method
        cart.print();

        // Test searchDVDsById method
        cart.searchDVDsById(1);

        cart.searchDVDsById(100);


        // Test searchDVDsByTitle;
        cart.searchDVDsByTitle("Star Wars");

        cart.searchDVDsByTitle("HUST");

    }
}
