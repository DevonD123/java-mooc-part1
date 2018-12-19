/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reference.comparator;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import reference.domain.Film;
import reference.domain.Rating;

/**
 *
 * @author Devon
 */
public class FilmComparator implements Comparator<Film>{
    private Map<Film, List<Rating>> ratings;

    public FilmComparator(Map<Film, List<Rating>> ratings) {
        this.ratings = ratings;
    }
    
    
    
    @Override
    public int compare(Film o1, Film o2) {
        int o2Avg = 0;
        int o1Avg = 0;
        List<Rating> o2List = this.ratings.get(o2);
        List<Rating> o1List = this.ratings.get(o1);      
        for (Rating rating : o2List) {
            o2Avg += rating.getValue();
        }
        for (Rating rating : o1List) {
            o1Avg += rating.getValue();
        }
        return (o2Avg/o2List.size()) - (o1Avg/o1List.size()); 

    }
    
}
