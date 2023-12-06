package hust.soict.dsai.aims;

import java.util.Comparator;

import hust.soict.dsai.aims.media.Media;

// Đinh Văn Luận - 20215083
public class MediaComparatorByCostTitle implements Comparator<Media>{
    
    @Override
    public int compare(Media m1, Media m2) {
		if(m1.getCost() < m2.getCost()) return 1 ;
		else if (m1.getCost() > m2.getCost()) return -1;
		else {
			return m1.getTitle().compareTo(m2.getTitle()) ;
		}
		
	}
}
