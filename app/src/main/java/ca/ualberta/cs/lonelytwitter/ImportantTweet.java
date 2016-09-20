package ca.ualberta.cs.lonelytwitter;

/**
<<<<<<< HEAD
 * Created by jm on 2016-09-13.
 */
public class ImportantTweet extends Tweet implements Tweetable {

    public ImportantTweet(String message) {
=======
 * Created by watts1 on 9/13/16.
 */
public class ImportantTweet extends Tweet {

    public ImportantTweet(String message){
>>>>>>> 3ca5beaa9c5f5299f28bffe00b82736fc9a9647d
        super(message);
    }

    @Override
<<<<<<< HEAD
    public Boolean isImportant() {
        return Boolean.TRUE;
    }
=======
    public Boolean isImportant(){
        return Boolean.TRUE;
    }

>>>>>>> 3ca5beaa9c5f5299f28bffe00b82736fc9a9647d
}
