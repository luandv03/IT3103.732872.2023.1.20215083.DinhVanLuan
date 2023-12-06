package hust.soict.dsai.aims.media;

import java.util.Comparator;

import hust.soict.dsai.aims.MediaComparatorByCostTitle;
import hust.soict.dsai.aims.MediaComparatorByTitleCost;

// Đinh Văn Luận - 20215083
public abstract class Media {
    protected int id;
    protected String title;
    protected String category;
    protected float cost;
    public static final Comparator<Media> COMPARE_BY_TITLE_COST = 
			new MediaComparatorByTitleCost() ;
	public static final Comparator<Media> COMPARE_BY_COST_TITLE = 
			new MediaComparatorByCostTitle() ;
	

    public void setTitle(String title) {
        this.title = title;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public void setCost(float cost) {
        this.cost = cost;
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getCategory() {
        return category;
    }

    public float getCost() {
        return cost;
    }

    // Đinh Văn Luận - 20215083
    @Override
    public boolean equals(Object o) {
        if (o == this) return true;

        if (!(o instanceof Media)) return false;
        
        Media tmp = (Media) o;

        return this.getTitle().equals(tmp.getTitle());

    }
}
