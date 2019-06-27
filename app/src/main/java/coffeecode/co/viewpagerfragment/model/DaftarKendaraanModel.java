package coffeecode.co.viewpagerfragment.model;

import android.os.Parcel;
import android.os.Parcelable;

import com.google.gson.annotations.SerializedName;

public class DaftarKendaraanModel implements Parcelable {

    @SerializedName("id")
    private int id;

    @SerializedName("image")
    private String image;

    @SerializedName("title")
    private String title;

    @SerializedName("description")
    private String description;

    @SerializedName("price")
    private int price;

    public DaftarKendaraanModel() {
    }

    public DaftarKendaraanModel(int id, String image, String title, String description, int price) {
        this.id = id;
        this.image = image;
        this.title = title;
        this.description = description;
        this.price = price;
    }

    protected DaftarKendaraanModel(Parcel in) {
        id = in.readInt();
        image = in.readString();
        title = in.readString();
        description = in.readString();
        price = in.readInt();
    }

    public static final Creator<DaftarKendaraanModel> CREATOR = new Creator<DaftarKendaraanModel>() {
        @Override
        public DaftarKendaraanModel createFromParcel(Parcel in) {
            return new DaftarKendaraanModel(in);
        }

        @Override
        public DaftarKendaraanModel[] newArray(int size) {
            return new DaftarKendaraanModel[size];
        }
    };

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
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

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeInt(id);
        dest.writeString(image);
        dest.writeString(title);
        dest.writeString(description);
        dest.writeInt(price);
    }
}
