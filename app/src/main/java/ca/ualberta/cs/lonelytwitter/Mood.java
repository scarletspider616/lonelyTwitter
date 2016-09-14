package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/**
 * Created by jm on 2016-09-13.
 */
public abstract class Mood {
    private Date date;
    public Mood (Date date) {
        this.date = date;
    }
    public void setDate (Date date) {
        this.date = date;
    }
    public Date getDate () {
        return this.date;
    }
    public abstract String describeMood();
}
