/**
* @author Đinh Văn Luận - 20215083
*/

public class DigitialVideoDisc {
    private String title;
    private String category;
    private String director;
    private int length;
    private float cost;

    public DigitialVideoDisc(String title) {
        this.title = title;
    }

    public DigitialVideoDisc (String title, String category,float cost) {
    this.category = category;
    this.title = title;
    this.cost = cost;
    }

    public DigitialVideoDisc(String director, String category, String title, float cost){
        this.director = director;
        this.category = category;
        this.title = title;
        this.cost = cost;
    }

    public DigitialVideoDisc(String title, String category, String director, int length, float cost) {
        this.title = title;
        this.director = director;
        this.category = category;
        this.length = length;
        this.cost = cost;
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

    // overide equals method to compare dvd objects.
    @Override
    public boolean equals(Object disc) {
        if (disc == this) return true;

        if (!(disc instanceof DigitialVideoDisc)) return false;
        
        DigitialVideoDisc tmp = (DigitialVideoDisc)disc;

        return this.title == tmp.getTitle() && 
        this.category == tmp.getCategory() && this.director == tmp.getDirector() && 
        this.length == tmp.getLength() && this.cost == tmp.getCost();
    }
}