/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reference;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Set;
import reference.comparator.FilmComparator;
import reference.domain.Film;
import reference.domain.Person;
import reference.domain.Rating;

/**
 *
 * @author Devon
 */
public class Reference {
    private RatingRegister reg;

    public Reference(RatingRegister reg) {
        this.reg = reg;
    }
    
    public Film recommendFilm(Person person){
        Map<Film, List<Rating>> listAll = this.reg.filmRatings();
        List<Film> filmList = new ArrayList<Film>();
        for (Film film : listAll.keySet()) {
            filmList.add(film);
        }
        //sort so best to worst
        System.out.println(filmList);
        Collections.sort(filmList, new FilmComparator(listAll));
        System.out.println(filmList);
        //if no movies reviewed send back best rated

        //if 1+ reviewed check if the best movie has been reviewed
        for (Film film : filmList) {
            if(setContains(film,person)){
                return film;
            }
            System.out.println(film);
        }
        //has seen all movies
        return null;

    }
    private boolean setContains(Film f, Person p){
        if(this.reg.getPersonalRatings(p).keySet().size() >= 1 && this.reg.getPersonalRatings(p).keySet().contains(f)){
           return false;
        }
        return true;
    }
}
