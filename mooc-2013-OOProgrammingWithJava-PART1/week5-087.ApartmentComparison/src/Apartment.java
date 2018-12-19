
public class Apartment {

    private int rooms;
    private int squareMeters;
    private int pricePerSquareMeter;

    public Apartment(int rooms, int squareMeters, int pricePerSquareMeter) {
        this.rooms = rooms;
        this.squareMeters = squareMeters;
        this.pricePerSquareMeter = pricePerSquareMeter;
    }
    public boolean larger(Apartment otherApartment){
        return this.squareMeters > otherApartment.squareMeters;
    }
    public int priceDifference(Apartment otherApartment){
        return Math.abs((this.pricePerSquareMeter * this.squareMeters) - (otherApartment.squareMeters * otherApartment.pricePerSquareMeter));
    }
    public boolean moreExpensiveThan(Apartment otherApartment){
        int thisApp = this.pricePerSquareMeter * this.squareMeters;
        int othApp = otherApartment.pricePerSquareMeter * this.squareMeters;
        
        return thisApp - othApp >= 0;
    }
}
