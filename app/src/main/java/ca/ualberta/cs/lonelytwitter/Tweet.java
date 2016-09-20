package ca.ualberta.cs.lonelytwitter;

<<<<<<< HEAD
import java.util.ArrayList;
import java.util.Date;

/**
 * Created by scarletspider616 on 2016-09-13.
=======
import java.util.Date;

/**
 * Created by watts1 on 9/13/16.
>>>>>>> 3ca5beaa9c5f5299f28bffe00b82736fc9a9647d
 */
public abstract class Tweet {
    private String message;
    private Date date;
<<<<<<< HEAD
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
=======

    public Tweet(String message){
        this.message = message;
        this.date = new Date();
    }

    public Tweet(String message, Date date){
        this.message = message;
        this.date = date;
    }


    public abstract Boolean isImportant();




    public void setMessage(String message) throws TweetTooLongException {
        if (message.length() > 140) {
            //Do something
>>>>>>> 3ca5beaa9c5f5299f28bffe00b82736fc9a9647d
            throw new TweetTooLongException();
        }
        this.message = message;
    }
<<<<<<< HEAD
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
=======

    public void setDate(Date date) {
        this.date = date;
    }

    public String getMessage() {
        return message;
    }

    public Date getDate() {
        return date;
    }

    @Override
    public String toString(){
        return  date.toString() + " | " + message;
    }
>>>>>>> 3ca5beaa9c5f5299f28bffe00b82736fc9a9647d
}
