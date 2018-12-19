/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reference;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import reference.domain.Film;
import reference.domain.Person;
import reference.domain.Rating;

/**
 *
 * @author Devon
 */
public class RatingRegister {
    //could remove ratingList
    private Map<Film,List<Rating>> ratingList;
    private Map<Person,Map<Film,Rating>> personList;
    public RatingRegister() {
        this.ratingList = new HashMap<Film,List<Rating>>();
        this.personList = new HashMap<Person,Map<Film,Rating>>();
    }
    
    public void addRating(Film film, Rating rating){
        if(this.ratingList.containsKey(film)){
           List<Rating> rate = this.ratingList.get(film);
           if(rate.size() >= 1){
               rate.add(rating);
           }
        }else{
            ArrayList<Rating> list = new ArrayList<Rating>();
            list.add(rating);
            this.ratingList.put(film,list);
        }
        
    }
    public List<Rating> getRatings(Film film){
        return this.ratingList.get(film);
    }
    public Map<Film, List<Rating>> filmRatings(){
        return this.ratingList;
    }
    public void addRating(Person person, Film film, Rating rating){
        if(this.personList.containsKey(person)){
           Map<Film,Rating> indvList = this.personList.get(person);
           if(!indvList.containsKey(film)){
               //person has not reviewed it before
               if(this.ratingList.containsKey(film)){
                   //someone else has reviewed it before
                   this.ratingList.get(film).add(rating);
               }else{ //not in general reviews so add
                   ArrayList<Rating> list = new ArrayList<Rating>();
                   list.add(rating);
                   this.ratingList.put(film, list);
               }
               indvList.put(film,rating);
           }else{
           //do nothing as rating is there ??? maybe overright?
           }
        }else{
            //create rating then add if person does not exist already
            Map<Film,Rating> m = new HashMap<Film,Rating>();
            m.put(film, rating);
            this.personList.put(person,m);
            if(this.ratingList.containsKey(film)){
               this.ratingList.get(film).add(rating);
            }else{
                ArrayList<Rating> revs = new ArrayList<Rating>();
                revs.add(rating);
                this.ratingList.put(film, revs);
            }
        }
    }
    public Rating getRating(Person person, Film film){
        if(this.personList.containsKey(person) && this.personList.get(person).containsKey(film)){
            return this.personList.get(person).get(film);
        }
        return Rating.NOT_WATCHED;
    }
    public Map<Film, Rating> getPersonalRatings(Person person){
        if(this.personList.containsKey(person)){
            return this.personList.get(person);
        }
        return new HashMap<Film,Rating>();
    }
    public List<Person> reviewers(){
        return new ArrayList<Person>(this.personList.keySet());
    }
}
