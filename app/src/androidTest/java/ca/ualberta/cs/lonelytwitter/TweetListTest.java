package ca.ualberta.cs.lonelytwitter;

import android.test.ActivityInstrumentationTestCase2;

/**
 * Created by jm on 2016-09-27.
 */

public class TweetListTest extends ActivityInstrumentationTestCase2<LonelyTwitterActivity> {
    public TweetListTest() {
        super(LonelyTwitterActivity.class);
    }

    public void testAddTweet() {
        TweetList list = new TweetList();
        Tweet tweet = new NormalTweet("Hello");
        list.add(tweet);
        assertTrue(list.hasTweet(tweet));
    }

    public void testGetTweet() {
        TweetList list = new TweetList();

        Tweet a = new NormalTweet("Hello");
        Tweet b = new NormalTweet("Goodbye!");

        list.add(a);
        list.add(b);

        assertEquals(list.getTweet(0), a);
        assertEquals(list.getTweet(1), b);
    }

    public void testIllegalArgumentException() {
        Tweet a = new NormalTweet("Hello");
        TweetList list = new TweetList();
        list.add(a);
        try {
            list.add(a);
            assertEquals(false, true);
        } catch (IllegalArgumentException e) {
            assertEquals(true, true);
        }
    }

    public void testGetTweets() {
        Tweet a = new NormalTweet("hello");
        Tweet b = new NormalTweet("good day");

        TweetList list = new TweetList();
        list.add(a);
        list.add(b);

        assertEquals(a, list.getTweet(0));
        assertEquals(b, list.getTweet(1));
    }

    public void testHasTweet() {
        TweetList list = new TweetList();
        Tweet tweet = new NormalTweet("hello!");
        assertFalse(list.hasTweet(tweet));
        list.add(tweet);
        assertTrue(list.hasTweet(tweet));
    }

    public void testDeleteTweet() {
        TweetList list = new TweetList();
        Tweet a = new NormalTweet("Hello");
        list.add(a);
        assertTrue(list.hasTweet(a));

        list.deleteTweet(a);
        assertFalse(list.hasTweet(a));
    }

    public void testGetCount() {
        TweetList list = new TweetList();
        Tweet a = new NormalTweet("Hello");
        assertEquals(0, list.getCount());
        list.add(a);
        assertEquals(1, list.getCount());
        list.add(new NormalTweet("Goodbye"));
        assertEquals(2, list.getCount());
    }



}
