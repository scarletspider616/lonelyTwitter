package ca.ualberta.cs.lonelytwitter;

/**
 * Created by watts1 on 9/13/16.
 * This class extends the abstract class
 * @see Tweet
 * and creates a version of it for important tweets.
 */
public class ImportantTweet extends Tweet {

    /**
     * Instantiates a new Important tweet.
     *
     * @param message the text the tweet should contain
     */
    public ImportantTweet(String message){
        super(message);
    }

    @Override
    public Boolean isImportant(){
        return Boolean.TRUE;
    }

}
