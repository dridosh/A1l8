package ru.rsfera.a1l8;

public class DataModule {

    private String title;
    private String description;
    private int imageId;


    public DataModule(String title, String description, int imageId) {
        this.title = title;
        this.description = description;
        this.imageId = imageId;
    }

    public final static DataModule[] Exercises = {
            new DataModule("test", "description", R.drawable.boat),
            new DataModule("test2", "description2", R.drawable.jumping)
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
