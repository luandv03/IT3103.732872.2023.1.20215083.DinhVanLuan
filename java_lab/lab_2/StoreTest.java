/**
* @author Đinh Văn Luận - 20215083
*/

public class StoreTest {

    public static void main(String[] args) {
        Store store = new Store();

        DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King", "Animation", "Roger Allers", 87, 19.95f);
        store.addDigitalVideoDisc(dvd1);

        DigitalVideoDisc dvd2 = new DigitalVideoDisc("Star Wars", "Science Fiction", "George Lucas", 87, 24.95f);
        store.addDigitalVideoDisc(dvd2);

        DigitalVideoDisc dvd3 = new DigitalVideoDisc("Aladin", "Animation", "Dinh Van Luan", 23, 18.99f);
        store.addDigitalVideoDisc(dvd3);

        DigitalVideoDisc deletedDVD =  store.removeDigitalVideoDisc(dvd1);
        System.out.println(deletedDVD.toString());
    }

}