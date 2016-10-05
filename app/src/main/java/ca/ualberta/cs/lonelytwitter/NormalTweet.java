package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/**
 * Created by watts1 on 9/13/16.
 */
public class NormalTweet extends Tweet implements Tweetable {


    /**
     * This constructor makes a NormalTweet with given string parameter. Automatically uses
     * current date.
     *
     * @param message this parameter is the given string for the tweet. If it is set to empty string
     *                then it will be replaced by...
     */
    public NormalTweet(String message){
        super(message);
    }

    /**
     * This constructor makes a NormalTweet with given string and date parameters.
     *
     * @param message this parameter is the given string for the tweet. If it is set to empty string
     *                then it will be replaced by...
     * @param date    specifies the value of the creation date for the NormalTweet
     */
    public NormalTweet(String message, Date date) {
        super(message, date);
    }

    @Override
    public Boolean isImportant() {
        return Boolean.FALSE;
    }
}
