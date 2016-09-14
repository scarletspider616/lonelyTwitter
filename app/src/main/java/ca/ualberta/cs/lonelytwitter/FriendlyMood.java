package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/**
 * Created by jm on 2016-09-13.
 */
public class FriendlyMood extends Mood {
    private String description = "FRIENDLY";
    public FriendlyMood(Date date) {
        super(date);
    }
    public String describeMood() {
        return this.description;
    }
}
