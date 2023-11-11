public class TestPassingParameter {
    
    public static void main(String[] args) {
        DigitialVideoDisc jungleDVD = new DigitialVideoDisc("Jungle");
        DigitialVideoDisc cinderellaDVD = new DigitialVideoDisc("Cinderella");

        swap(jungleDVD, cinderellaDVD);
        System.out.println("jungle dvd title: " + jungleDVD.getTitle());
        System.out.println("cinderella dvd title: " + cinderellaDVD.getTitle());

        changleTitle(jungleDVD, cinderellaDVD.getTitle());
        System.out.println("jungle dvd title: " + jungleDVD.getTitle());
        
    }

    public static void swap(Object o1, Object o2) {
        Object tmp = o1;
        o1 = o2;
        o2 = tmp;
    }

    public static void changleTitle(DigitialVideoDisc dvd, String title) {
        String oldTitle = dvd.getTitle();
        dvd.setTitle(title);
        dvd = new DigitialVideoDisc(oldTitle);
        
    }
}
