package ca.ualberta.cs.lonelytwitter;

import android.app.Activity;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.google.gson.Gson;

public class EditTweetActivity extends Activity {

    private Gson gson = new Gson();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit_tweet);
    }

    @Override
    public void onResume() {
        super.onResume();
        Tweet tweet = gson.fromJson(getIntent().getStringExtra("Tweet"), NormalTweet.class);
        TextView textView = (TextView) findViewById(R.id.textView);
        textView.setText(tweet.toString());

    }
}
