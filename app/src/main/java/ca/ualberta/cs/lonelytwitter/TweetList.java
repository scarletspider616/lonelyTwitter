package ca.ualberta.cs.lonelytwitter;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by jm on 2016-09-27.
 */

public class TweetList {
    ArrayList<Tweet> tweets = new ArrayList<Tweet>();
    public void add(Tweet tweet) {
        for (Tweet t:tweets) {
            if (t.equals(tweet)) {
                throw new IllegalArgumentException();
            }
        }
        tweets.add(tweet);
    }
    public boolean hasTweet(Tweet tweet) {
        return tweets.contains(tweet);
    }
    public Tweet getTweet(int i) {
        return tweets.get(i);
    }
    public void deleteTweet(Tweet a) {
        tweets.remove(a);
    }
    public ArrayList<Tweet> getTweets() {
        return tweets;
    }
    public int getCount() {
        return tweets.size();
    }
}
