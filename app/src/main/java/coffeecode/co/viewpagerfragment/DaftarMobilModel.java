package coffeecode.co.viewpagerfragment;

public class DaftarMobilModel {
    private int image;
    private String title;
    private String description;
    private int price;

    public DaftarMobilModel() {
    }

    public DaftarMobilModel(int image, String title, String description, int price) {
        this.image = image;
        this.title = title;
        this.description = description;
        this.price = price;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
