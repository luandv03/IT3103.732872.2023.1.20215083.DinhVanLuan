/**
* @author Đinh Văn Luận - 20215083
*/

public class Aims {
    public static void main(String[] args) {
        Cart anOrder = new Cart();

        DigitialVideoDisc dvd1 = new DigitialVideoDisc("The Lion King", "Animation", "Roger Allers", 87, 19.95f);
        anOrder.addDigitialVideoDisc(dvd1);
        
        DigitialVideoDisc dvd2 = new DigitialVideoDisc("Star Wars", "Science Fiction", "George Lucas", 87, 24.95f);
        anOrder.addDigitialVideoDisc(dvd2);

        DigitialVideoDisc dvd3 = new DigitialVideoDisc("Aladin", "Animation",  18.99f);

        anOrder.addDigitialVideoDisc(dvd3);

        System.out.println("Total Cost is: ");
        System.out.println(anOrder.totalCost());

        DigitialVideoDisc dvdDeleted = anOrder.removeDigitialVideoDisc(dvd3);

        System.out.println("Deleted DVD: " + dvdDeleted.getTitle());
    }
}
