/**
* @author Đinh Văn Luận - 20215083
*/

public class StoreTest {

    public static void main(String[] args) {
        Store store = new Store();

        DigitialVideoDisc dvd1 = new DigitialVideoDisc("The Lion King", "Animation", "Roger Allers", 87, 19.95f);
        store.addDigitialVideoDisc(dvd1);

        DigitialVideoDisc dvd2 = new DigitialVideoDisc("Star Wars", "Science Fiction", "George Lucas", 87, 24.95f);
        store.addDigitialVideoDisc(dvd2);

        DigitialVideoDisc dvd3 = new DigitialVideoDisc("Aladin", "Animation", "Dinh Van Luan", 23, 18.99f);
        store.addDigitialVideoDisc(dvd3);

        DigitialVideoDisc deletedDVD =  store.removeDigitialVideoDisc(dvd1);
        System.out.println(deletedDVD.toString());
    }

}