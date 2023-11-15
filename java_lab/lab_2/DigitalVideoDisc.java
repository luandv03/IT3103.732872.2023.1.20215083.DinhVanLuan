/**
* @author Đinh Văn Luận - 20215083
*/

public class DigitalVideoDisc {
    private String title;
    private String category;
    private String director;
    private int length;
    private float cost;
    private int id;
    private static int nbDigitalVideoDiscs = 0;

    public DigitalVideoDisc(String title) {
        this.title = title;
    }

    public DigitalVideoDisc (String title, String category,float cost) {
        DigitalVideoDisc.nbDigitalVideoDiscs++;
        this.id = DigitalVideoDisc.nbDigitalVideoDiscs;
        this.category = category;
        this.title = title;
        this.cost = cost;
    }

    public DigitalVideoDisc(String director, String category, String title, float cost){
        DigitalVideoDisc.nbDigitalVideoDiscs++;
        this.id = DigitalVideoDisc.nbDigitalVideoDiscs;
        this.director = director;
        this.category = category;
        this.title = title;
        this.cost = cost;
    }

    public DigitalVideoDisc(String title, String category, String director, int length, float cost) {
        DigitalVideoDisc.nbDigitalVideoDiscs++;
        this.id = DigitalVideoDisc.nbDigitalVideoDiscs;
        this.title = title;
        this.director = director;
        this.category = category;
        this.length = length;
        this.cost = cost;
    }

    public int getId() {
        return this.id;
    }

    public String getTitle() {
        return this.title;
    }

    public String getCategory() {
        return this.category;
    }

    public String getDirector() {
        return this.director;
    }

    public int getLength() {
        return this.length;
    }    

    public float getCost() {
        return this.cost;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    // overide equals method to compare dvd objects.
    @Override
    public boolean equals(Object disc) {
        if (disc == this) return true;

        if (!(disc instanceof DigitalVideoDisc)) return false;
        
        DigitalVideoDisc tmp = (DigitalVideoDisc)disc;

        return this.title == tmp.getTitle() && 
        this.category == tmp.getCategory() && this.director == tmp.getDirector() && 
        this.length == tmp.getLength() && this.cost == tmp.getCost();
    }

    public String toString() {
        return this.id + ".DVD - " + this.title + " - " + this.category + " - " + this.director  + " - " + this.length + " : " + this.cost + "$";
    }

    // Đinh Văn Luận - 20215083
    public boolean isMatch(String title) {
        return this.title.equals(title);
    }
}