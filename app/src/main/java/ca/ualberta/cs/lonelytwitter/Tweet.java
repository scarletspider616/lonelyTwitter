package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/**
 * Created by watts1 on 9/13/16.
 */
public abstract class Tweet {
    private String message;
    private Date date;

    /**
     * Instantiates a new Tweet (abstract). It saves the tweet text description as well as
     * the creation date.
     *
     * @param message this parameter is the given string for the tweet. If it is set to empty string
     *                then it will be replaced by...
     */
    public Tweet(String message){
        this.message = message;
        this.date = new Date();
    }

    /**
     * Instantiates a new Tweet (abstract). It saves the tweet text description and allows a
     * custom creation date.
     *
     * @param message this parameter is the given string for the tweet. If it is set to empty string
     *                then it will be replaced by...
     * @param date    a custom date field
     */
    public Tweet(String message, Date date){
        this.message = message;
        this.date = date;
    }


    /**
     * Is important boolean. Checks if the current tweet object (this) is "important" or not
     *
     * @return true if important, false if not
     */
    public abstract Boolean isImportant();


    /**
     * Sets the value of the tweet description.
     *
     * @param message saves the actual tweet text
     * @throws TweetTooLongException the tweet is longer than 140 chars, an exception is raised.
     */
    public void setMessage(String message) throws TweetTooLongException {
        if (message.length() > 140) {
            //Do something
            throw new TweetTooLongException();
        }
        this.message = message;
    }

    /**
     * Sets the creation date of the tweet
     *
     * @param date the new creation date
     */
    public void setDate(Date date) {
        this.date = date;
    }

    /**
     * Gets tweet text
     *
     * @return the message, a 140 character tweet
     */
    public String getMessage() {
        return message;
    }

    /**
     * Gets date.
     *
     * @return the date
     */
    public Date getDate() {
        return date;
    }

    @Override
    public String toString(){
        return  date.toString() + " | " + message;
    }

}
