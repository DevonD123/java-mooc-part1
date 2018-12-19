
public class MyDate {

    private int day;
    private int month;
    private int year;

    public MyDate(int pv, int kk, int vv) {
        this.day = pv;
        this.month = kk;
        this.year = vv;
    }

    public String toString() {
        return this.day + "." + this.month + "." + this.year;
    }

    public boolean earlier(MyDate compared) {
        if (this.year < compared.year) {
            return true;
        }

        if (this.year == compared.year && this.month < compared.month) {
            return true;
        }

        if (this.year == compared.year && this.month == compared.month
                && this.day < compared.day) {
            return true;
        }

        return false;
    }

    /*
     * In assignment 92 method differneceInYears was added to MyDate 
     * Copy the method here since it eases this assignment considerably.
     */
    public int differneceInYears(MyDate compared) {
        int difY = this.year - compared.year;
        int difM = this.month - compared.month;
        int difD = this.day - compared.day;
        
        /*
        only - no adding to the return val
        */
        if(difY > 0 && difM > 0 || difY < 0 && difM < 0){
            //if month is + when year is + or other way +1
            System.out.println(Math.abs(difY));
            return Math.abs(difY);
        }else if(difY > 0 && difM < 0 || difY < 0 && difM > 0){
            //if month - when year is + or other way -1
            System.out.println(Math.abs(difY)-1);
            return Math.abs(difY) -1;
        }else if(difY > 0 && difM == 0 && difD > 0 || difY < 0 && difM == 0 && difD < 0){
        //if month 0 then check day if day sign matches year sign +1
        System.out.println(Math.abs(difY));
            return Math.abs(difY);
        }else if(difY > 0 && difM == 0 && difD < 0 || difY < 0 && difM == 0 && difD > 0){
        //if month 0 then check day if day sign does not match year sign -1
        System.out.println(Math.abs(difY)-1);
            return Math.abs(difY) -1;
        } else{
            //if month and year are the same 
            System.out.println(Math.abs(difY));
            return Math.abs(difY);
        }
    }

  
}
