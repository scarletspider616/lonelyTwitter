package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/**
 * Created by jm on 2016-09-13.
 */
public class VindicativeMood extends Mood {

    private String description = "VINDICATIVE";
    public VindicativeMood (Date date) {
        super(date);
    }
    public String describeMood() {
        return this.description;
    }
}
