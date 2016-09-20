package ca.ualberta.cs.lonelytwitter;

import java.util.ArrayList;
import java.util.Date;

/**
 * Created by scarletspider616 on 2016-09-13.
 */
public abstract class Tweet {
    private String message;
    private Date date;
    private ArrayList<Mood> listOfMoods= new ArrayList<Mood>();

    public Tweet(String message) {
        /* constructor */
        this.message = message;
        this.date = new Date();
    }
    public Tweet (String message, Date date) {
        this.message = message;
        this.date = date;
    }
    public void setMessage(String message) throws TweetTooLongException {
        if (message.length() > 140) {
            // Do something
            throw new TweetTooLongException();
        }
        this.message = message;
    }
    @Override
    public String toString() {
        return date.toString() + " | " + this.message;
    }
    public void setDate(Date date) {
        this.date = date;
    }
    public String getMessage() {
        return this.message;
    }
    public Date getDate() {
        return this.date;
    }
    public void addMood(Mood mood) {
        this.listOfMoods.add(mood);
    }
    public ArrayList<Mood> getListOfMoods () {
        return this.listOfMoods;
    }
    public abstract Boolean isImportant();
}
