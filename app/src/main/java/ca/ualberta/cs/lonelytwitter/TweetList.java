package ca.ualberta.cs.lonelytwitter;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by jm on 2016-09-27.
 */
public class TweetList {
    /**
     * The Tweets.
     */
    ArrayList<Tweet> tweets = new ArrayList<Tweet>();

    /**
     * Add.
     *
     * @param tweet the tweet
     */
    public void add(Tweet tweet) {
        for (Tweet t:tweets) {
            if (t.equals(tweet)) {
                throw new IllegalArgumentException();
            }
        }
        tweets.add(tweet);
    }

    /**
     * Has tweet boolean.
     *
     * @param tweet the tweet
     * @return the boolean
     */
    public boolean hasTweet(Tweet tweet) {
        return tweets.contains(tweet);
    }

    /**
     * Gets tweet.
     *
     * @param i the
     * @return the tweet
     */
    public Tweet getTweet(int i) {
        return tweets.get(i);
    }

    /**
     * Delete tweet.
     *
     * @param a the a
     */
    public void deleteTweet(Tweet a) {
        tweets.remove(a);
    }

    /**
     * Gets tweets.
     *
     * @return the tweets
     */
    public ArrayList<Tweet> getTweets() {
        return tweets;
    }

    /**
     * Gets count.
     *
     * @return the count
     */
    public int getCount() {
        return tweets.size();
    }
}
