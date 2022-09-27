package Entity;

public class Adress {
    private Integer ID;
    private String postaleCode;
    private City city;

    public Integer getID() {
        return ID;
    }

    public void setID(Integer ID) {
        this.ID = ID;
    }

    public String getPostaleCode() {
        return postaleCode;
    }

    public void setPostaleCode(String postaleCode) {
        this.postaleCode = postaleCode;
    }

    public City getCity() {
        return city;
    }

    public void setCity(City city) {
        this.city = city;
    }
}
