package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/**
 * Created by jm on 2016-09-13.
 */
public interface Tweetable {
    // often interfaces will end with "able"
    // use it to guarantee implementation of some functionality.
    public String getMessage();
    public Date getDate();

}
