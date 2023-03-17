package bike.car.rent.Models;

public class Booking {
    private int id;
    private String name,rent;
    private int image;

    public Booking(int id, String name,  String rent, int image){
        this.id = id;
        this.name = name;

        this.rent = rent;
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

    public String getRent() {
        return rent;
    }

    public void setRent(String rent) {
        this.rent = rent;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }
}

