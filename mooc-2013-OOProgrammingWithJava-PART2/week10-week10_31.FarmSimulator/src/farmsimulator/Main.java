package farmsimulator;

public class Main {
    public static void main(String[] args) {
         Barn b = new Barn(new BulkTank());

        Cow c = new Cow();
        try{
            b.takeCareOf(c);
        }catch(Exception e){
            System.out.println(e);
        }
    }
}
