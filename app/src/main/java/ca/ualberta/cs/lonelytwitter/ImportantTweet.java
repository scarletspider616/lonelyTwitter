package ca.ualberta.cs.lonelytwitter;

/**
 * Created by jm on 2016-09-13.
 */
public class ImportantTweet extends Tweet implements Tweetable {

    public ImportantTweet(String message) {
        super(message);
    }

    @Override
    public Boolean isImportant() {
        return Boolean.TRUE;
    }
}
