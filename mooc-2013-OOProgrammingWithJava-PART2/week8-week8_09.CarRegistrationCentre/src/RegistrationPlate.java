
public class RegistrationPlate {
    // don't change the code which is already given to you

    // ATTENTION: the object variable types are final, meaning that their value cannot be changed!
    private final String regCode;
    private final String country;

    public RegistrationPlate(String country, String regCode) {
        this.regCode = regCode;
        this.country = country;
    }
    //could clean up but have seperate if statments for readability
    @Override
    public boolean equals(Object obj){
        if(getClass() != obj.getClass()){
            return false;
        }
        RegistrationPlate comp = (RegistrationPlate) obj;
        if(this.country == null || this.regCode == null){
            return false;
        }
        if(!this.country.equals(comp.country) || !this.regCode.equals(comp.regCode)){
            return false;
        }
        return true;
    }
    @Override
    public int hashCode(){
        if(this.country == null || this.regCode == null){
            return -1;
        }else{
            String hashed = this.country + this.regCode;
            return hashed.hashCode();
        }
    }
    @Override
    public String toString() {
        return country + " " + regCode;
    }

}
