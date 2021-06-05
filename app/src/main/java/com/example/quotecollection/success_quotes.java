package com.example.quotecollection;

import androidx.appcompat.app.AppCompatActivity;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class success_quotes extends AppCompatActivity {
    ListView listView;

    String[] success_quotes = {"Success is the sum of small efforts, repeated day in and day out…\n" +
            "-Robert Collier",
    "You already have every characteristics necessary for success if you recognize, claim, develop and use them…\n" +
            "-Zig Ziglar",
    "Success is not something that just happens.. Success is learned, success is practiced, and then it is shared…\n-" +
            "Sparky Anderson",
    "The surest way not to fail is to determine to succeed…\n" +
            "-Richard Brinsley Sheridan",
    "Unless you’re willing to have a go, fail miserably, and have another go, success won’t happen…\n" +
            "-Phillip Adams",
    "There is no failure except in no longer trying…\n" +
            "-Elbert Hubbard",
    "All the so-called “secrets of success” will not work unless you do…\n" +
            "-Author Unknown",
    "The more I want to get something done, the less I call it work…\n" +
            "-Richard Bach",
    "Success seems to be largely a matter of hanging on after others have let go…\n" +
            "-William Feather",
    "Sooner or later, those who win are those who think they can…\n" +
            "-Richard Bach",
    "Along with success comes a reputation for wisdom…\n" +
            "-Euripides",
    "Don’t let what you cannot do, interfere with what you can do…\n" +
            "-John Wooden",
    "Forget about all the reasons why something may not work. You only need to find one good reason why it will…\n" +
            "-Robert Anthony",
    "Keep away from people who try to belittle your ambitions. Small people always do that, but the really great make you feel that you, too, can become great…\n" +
            "-Mark Twain",
    "Never leave that till tomorrow which you can do today…\n" +
            "-Benjamin Franklin",
    "Success consists of getting up just one more time than you fall…\n" +
            "-Oliver Goldsmith",
    "It is hard to fail, but it is worse never to have tried to succeed…\n" +
            "-Theodore Roosevelt",
    "Greatest success comes just one step beyond the point at which defeat overtakes you…\n" +
            "-Author Unknown",
    "Winners make a habit of doing the things losers don’t want to do…\n" +
            "-Lucas Remmerswaal",
    "The secret of success is to be ready when your opportunity comes…\n" +
            "-Benjamin Disraeli",
    "Every failure brings with it the seed of an equivalent success…\n" +
            "-Napoleon Hill",
    "Keep steadily before you the fact that all true success depends at last upon yourself…\n" +
            "-Theodore T. Hunger",
    "Confidence is not a guarantee of success, but a pattern of thinking that will improve your likelihood of success, a tenacious search for ways to make things work…\n" +
            "-John Eliot",
    "Start with what is right rather than what is acceptable…\n" +
            "-Peter F. Drucker",
    "Falling and getting back up is what brings you success…\n" +
            "-Tony Horton",
    "Cultivate your desire for success to be greater than the fear of failure. Failure is merely a pits-top between where you stand and success. Failure allows you to learn the fastest. Failure inspires winners and defeats losers…\n" +
            "-Author Unknown",
    "I have failed over and over and over again in my life and that is why I succeed…\n" +
            "-Michael Jordan",
    "There is only one success.. It is to be able to spend your life in your own way…\n" +
            "-Christopher Morley",
    "The real opportunity for success lies within the person and not in the job…\n" +
            "-Zig Ziglar",
    "It’s not the load that breaks you down, it’s the way you carry it…\n" +
            "-Lena Horne",
    "The secret of success is to know something nobody else knows…\n" +
            "-Aristotle Onassis",
    "Always bear in mind that your own resolution to succeed is more important than any other…\n" +
            "-Abraham Lincoln",
    "Self-trust is the first secret of success…\n" +
            "-Ralph Waldo Emerson",
    "Success in life is the result of good judgment. Good judgment is usually the result of experience. Experience is usually the result of bad judgment…\n" +
            "-Anthony Robbins",
    "Our greatest glory consists not in never falling, but in rising every time we fall…\n" +
            "-Oliver Goldsmith",
    "Energy and persistence conquer all things…\n" +
            "-Benjamin Franklin",
    "You’ll never get ahead of anyone as long as you try to get even with him…\n" +
            "-Lou Holtz",
    "Happiness will come to you when it comes from you. Success will be yours when you choose to take responsibility for making it so…\n" +
            "-Author Unknown"
    };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_success_quotes);

        ListView listView = findViewById(R.id.listView);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.preference_category, success_quotes);
        listView.setAdapter(adapter);

        listView.setOnItemLongClickListener(new AdapterView.OnItemLongClickListener() {
            @Override
            public boolean onItemLongClick(AdapterView<?> arg0, View arg1, int pos, long id) {
                String text = success_quotes[pos];
                ClipData myClip;
                ClipboardManager clipboard = (ClipboardManager) getSystemService(Context.CLIPBOARD_SERVICE);
                myClip = ClipData.newPlainText("text", text);
                clipboard.setPrimaryClip(myClip);

                Toast.makeText(success_quotes.this, "Item Copied ", Toast.LENGTH_SHORT).show();
                return true;
            }
        });

    }
}