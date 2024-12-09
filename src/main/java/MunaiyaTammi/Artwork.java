package MunaiyaTammi;

public class Artwork {
    private String name;
    private byte[] picture;
    private int price;
    private int quanity;

    public Artwork(String name, byte[] picture, int price, int quanity) {
        this.name = name;
        this.picture = picture;
        this.price = price;
        this.quanity = quanity;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public byte[] getPicture() {
        return picture;
    }

    public void setPicture(byte[] picture) {
        this.picture = picture;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getQuanity() {
        return quanity;
    }

    public void setQuanity(int quanity) {
        this.quanity = quanity;
    }

    @Override
    public String toString() {
        return "Artwork{" +
                "name='" + name + '\'' +
                ", picture=" + java.util.Arrays.toString(picture) +
                ", price=" + price +
                ", quanity=" + quanity +
                '}';
    }
}
