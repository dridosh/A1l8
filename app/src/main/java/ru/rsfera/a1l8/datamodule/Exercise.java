package ru.rsfera.a1l8.datamodule;

import ru.rsfera.a1l8.R;

public class Exercise {

    private int titleID;
    private int descriptionID;
    private int imageOKID;
    private int imageNOKID;


    public Exercise(int titleID, int descriptionID, int imageOKI, int imageNOKID) {
        this.titleID = titleID;
        this.descriptionID = descriptionID;
        this.imageOKID = imageOKI;
        this.imageNOKID = imageNOKID;
    }

    public final static Exercise[] exercises = {
            new Exercise(R.string.classic_plank_title, R.string.classic_plank_des,
                    R.drawable.i_classic_plank_ok, R.drawable.i_classic_plank_nok),
            new Exercise(R.string.simple_plank_title, R.string.simple_plank_des,
                    R.drawable.i_simple_plank_ok, R.drawable.i_simple_plan_nok),
            new Exercise(R.string.side_plank_title, R.string.side_plank_des,
                    R.drawable.i_side_plank_ok, R.drawable.i_side_plank_nok),
            new Exercise(R.string.leg_plank_title, R.string.leg_plank_des,
                    R.drawable.i_leg_plank_ok, 0),
            new Exercise(R.string.hand_plank_title, R.string.hand_plank_des,
                    0, 0)
    };


    public int getTitleID() {
        return titleID;
    }

    public int getDescriptionID() {
        return descriptionID;
    }

    public int getImageOKID() {
        return imageOKID;
    }

    public int getImageNOKID() {
        return imageNOKID;
    }

}

