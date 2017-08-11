package cource.task7;


public class BuilderApp {
    public static void main(String[] args) {
        TourBuilder tourBuilder = new TourBuilder();
        tourBuilder.createTour();
        tourBuilder.setBothDirectionsFly(true);
        tourBuilder.setTransfetToAndFromAirport(true,false);
        tourBuilder.setBookingHotel(false);
        tourBuilder.setInssurance(true);
        System.out.println(tourBuilder.tour.toString());
    }

}

class Tour {
    boolean transferToTheAirport;
    boolean transferFromTheAirport;
    boolean bothDirectionsFly;
    boolean bookingHotel;
    boolean inssurance;

    public boolean isTransferToTheAirport() {
        return transferToTheAirport;
    }

    public void setTransferToTheAirport(boolean transferToTheAirport) {
        this.transferToTheAirport = transferToTheAirport;
    }

    public boolean isTransferFromTheAirport() {
        return transferFromTheAirport;
    }

    public void setTransferFromTheAirport(boolean transferFromTheAirport) {
        this.transferFromTheAirport = transferFromTheAirport;
    }

    public boolean isBothDirectionsFly() {
        return bothDirectionsFly;
    }

    public void setBothDirectionsFly(boolean bothDirectionsFly) {
        this.bothDirectionsFly = bothDirectionsFly;
    }

    public boolean isBookingHotel() {
        return bookingHotel;
    }

    public void setBookingHotel(boolean bookingHotel) {
        this.bookingHotel = bookingHotel;
    }

    public boolean isInssurance() {
        return inssurance;
    }

    public void setInssurance(boolean inssurance) {
        this.inssurance = inssurance;
    }

    @Override
    public String toString() {
        return "Tour{" +
                "transferToTheAirport=" + transferToTheAirport +
                ", transferFromTheAirport=" + transferFromTheAirport +
                ", bothDirectionsFly=" + bothDirectionsFly +
                ", bookingHotel=" + bookingHotel +
                ", inssurance=" + inssurance +
                '}';
    }
}
class TourBuilder{
    Tour tour;
    Tour createTour(){
       return tour = new Tour();
    }
    void setTransfetToAndFromAirport(boolean to,boolean from){
        tour.setTransferToTheAirport(to);
        tour.setTransferFromTheAirport(from);
    }
    void setBothDirectionsFly(boolean need){
        tour.setBothDirectionsFly(need);
    }
    void setBookingHotel(boolean need){
        tour.setBookingHotel(need);
    }
    void setInssurance(boolean need){
        tour.setInssurance(need);
    }
}
