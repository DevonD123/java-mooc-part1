
public class Bird{

    private String name;
    private String latinName;
    private int ringingYear;

    public Bird(String name, String latinName, int ringingYear) {
        this.name = name;
        this.latinName = latinName;
        this.ringingYear = ringingYear;
    }
    public String getLatin(){
        return this.latinName;
    }
    public int getYear(){
        return this.ringingYear;
    }
    @Override
    public int hashCode() {
        int hash = 7;
        hash = 59 * hash + (this.latinName != null ? this.latinName.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object o) {
        try{
            if(!(o instanceof Bird)){
                return false;
            }
            Bird b = (Bird)o;
            if(b.getLatin().toUpperCase().equals(this.latinName.toUpperCase()) && b.getYear() == this.ringingYear){
                return true;
            }
        }catch(Exception e){
         return false;
        }
        return false;
    }

    
    @Override
    public String toString() {
        return this.latinName + " (" + this.ringingYear + ")";
    }
}


