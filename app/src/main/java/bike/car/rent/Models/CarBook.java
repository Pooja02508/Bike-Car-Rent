package bike.car.rent.Models;

public class CarBook {
    private int id;
    private String name,automatic,disel,seats,rent1,rent2,rent3,extraCharges;
    private int image;

    public CarBook(int id, String name, String automatic, String disel, String seats, String rent1,String rent2,String rent3,String extraCharges, int image){
        this.id = id;
        this.name = name;
        this.automatic = automatic;
        this.disel = disel;
        this.seats = seats;
        this.rent1 = rent1;
        this.rent2 = rent2;
        this.rent3 = rent3;
        this.extraCharges = extraCharges;
        this.image = image;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAutomatic() {
        return automatic;
    }

    public void setAutomatic(String automatic) {
        this.automatic = automatic;
    }

    public String getDisel() {
        return disel;
    }

    public void setDisel(String disel) {
        this.disel = disel;
    }

    public String getSeats() {
        return seats;
    }

    public void setSeats(String seats) {
        this.seats = seats;
    }

    public String getRent1() {
        return rent1;
    }

    public void setRent1(String rent1) {
        this.rent1 = rent1;
    }

    public String getRent2() {
        return rent2;
    }

    public void setRent2(String rent2) {
        this.rent2 = rent2;
    }

    public String getRent3() {
        return rent3;
    }

    public void setRent3(String rent3) {
        this.rent3 = rent3;
    }
    public String getExtraCharges() {
        return extraCharges;
    }

    public void setExtraCharges(String extraCharges) {
        this.extraCharges = extraCharges;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }
}

