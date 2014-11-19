package com.akhilamobin.gitaquotes;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;



public class GitaQuotesActivity extends Activity {

    public static final String TAG = GitaQuotesActivity.class.getSimpleName();

    public GitaQuotesBook mQuoteBook = new GitaQuotesBook();
    public ColorWheel mColor = new ColorWheel();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gita_quotes);

        final TextView quoteTextView = (TextView)findViewById(R.id.quoteTextView);
        final Button quoteButton = (Button)findViewById(R.id.quoteButton);
        final RelativeLayout quoteLayout = (RelativeLayout)findViewById(R.id.quoteLayout);





        View.OnClickListener listener = new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                int color = mColor.getColor();

                quoteLayout.setBackgroundColor(color);
                quoteButton.setTextColor(color);

                String quote = mQuoteBook.getQuote();

                quoteTextView.setText(quote);
            }
        };

        quoteButton.setOnClickListener(listener);

        Log.d(TAG, "Log created inside OnCreate method()");

        }

    }

