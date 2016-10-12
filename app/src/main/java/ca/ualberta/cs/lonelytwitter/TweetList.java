package ca.ualberta.cs.lonelytwitter;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by jm on 2016-09-27.
 * This class uses a ArrayList object to store lists of Tweet objects.
 * @see Tweet
 * @see ImportantTweet
 * @see NormalTweet
 *
 */
public class TweetList {
    /**
     */
    ArrayList<Tweet> tweets = new ArrayList<Tweet>();

    /**
     * Add a Tweet object to the TweetList.
     * @throws IllegalArgumentException
     *
     * @param tweet the Tweet object that you wish to add to the list
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
     * Checks if the TweetList object contains a specific tweet.
     *
     * @param tweet the Tweet object you are checking if is in the list
     * @return true if it's in there, false if not
     */
    public boolean hasTweet(Tweet tweet) {
        return tweets.contains(tweet);
    }

    /**
     * Gets a specific tweet
     *
     * @param i the index of the tweet in the list
     * @return the Tweet found at index i
     */
    public Tweet getTweet(int i) {
        return tweets.get(i);
    }

    /**
     * Deletes a specific Tweet object from the TweetList
     *
     * @param a the Tweet object you wish to remove from the list
     */
    public void deleteTweet(Tweet a) {
        tweets.remove(a);
    }

    /**
     * Gets the entire ArrayList object containing the tweets
     *
     * @return the ArrayList containing all the tweets
     */
    public ArrayList<Tweet> getTweets() {
        return tweets;
    }

    /**
     * Gets the number of tweets in the TweetList
     *
     * @return tweets.size()
     */
    public int getCount() {
        return tweets.size();
    }
}
