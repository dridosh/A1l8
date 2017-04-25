package ru.rsfera.a1l8;

public class DataModul {

    private String title;
    private String description;
    private int imageId;


    public DataModul(String title, String description, int imageId) {
        this.title = title;
        this.description = description;
        this.imageId = imageId;
    }

    public final static DataModul[] Exercises = {
            new DataModul("test", "description", R.drawable.boat),
            new DataModul("test2", "description2", R.drawable.jumping)
    };

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public int getImageId() {
        return imageId;
    }

    @Override
    public String toString() {
        return this.title;
    }
}
