package hust.soict.dsai.test.cart;

import hust.soict.dsai.aims.cart.Cart;
import hust.soict.dsai.aims.disc.DigitalVideoDisc;

/**
* @author Đinh Văn Luận - 20215083
*/

public class CartTest {
    public static void main(String[] args) {
        Cart cart = new Cart();

        DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King", "Animation", "Roger Allers", 87, 19.95f);
        cart.addDigitalVideoDisc(dvd1);

        DigitalVideoDisc dvd2 = new DigitalVideoDisc("Star Wars", "Science Fiction", "George Lucas", 87, 24.95f);
        cart.addDigitalVideoDisc(dvd2);

        DigitalVideoDisc dvd3 = new DigitalVideoDisc("Aladin", "Animation", 18.99f);
        cart.addDigitalVideoDisc(dvd3);

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