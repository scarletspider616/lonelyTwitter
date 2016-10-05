package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/**
 * Created by watts1 on 9/13/16.
 * Interface that allows objects to be "tweetable"
 * @see Tweet
 * for the abstract class that replaced it.
 * @deprecated
 */
public interface Tweetable {
    /**
     * Gets the tweet message contents.
     *
     * @return the message, a 140 char tweet
     */
    public String getMessage();

    /**
     * Gets date.
     *
     * @return the date
     */
    public Date getDate();
}
