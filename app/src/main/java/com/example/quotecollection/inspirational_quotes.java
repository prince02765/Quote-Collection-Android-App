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

public class inspirational_quotes extends AppCompatActivity {
    ListView listView;
    String [] inspirational_quotes = {"Try not to become a man of success but a man of value …\n" +
            "-Albert Einstein",
    "Forever – is composed of nows …\n" +
            "-Emily Dickinson",
    "Never tell me the sky is the limit when there are footprints on the moon…\n" +
            "-Author Unknown",
    "To be fully alive, fully human, and completely awake is to be continually thrown out of the nest…\n" +
            "-Pema Chodron",
    "Your success and happiness lie in you…\n" +
            "-Helen Keller",
    "Even if I knew that tomorrow the world would go to pieces, I would still plant my apple tree…\n" +
            "-Martin Luther King, Jr.",
    "The best way to predict the future is to create it …\n" +
            "-Abraham Lincoln",
    "It’s never too late to get back on your feet though we won’t live forever. Make sure you accomplish what you were put here for…\n" +
            "-Abigail Adams",
    "Inspiration and genius, one and the same…\n" +
            "-Victor Hugo",
    "After a storm, comes a calm…\n" +
            "-Matthew Henry",
    "If you have built castles in the air, your work need not be lost. That is where they should be. Now put foundations under them…\n" +
            "-Henry David Thoreau",
    "Always be a first rate version of yourself, instead of a second rate version of somebody else…\n" +
            "-Judy Garland",
    "If the facts don’t fit the theory, change the fact …\n" +
            "-Albert Einstein",
    "In a gentle way, you can shake the world…\n" +
            "-Mahatma Gandhi",
    "It was only sunny smile, and little it cost in the giving, but like morning light it scattered the night and made the day worth living…\n" +
            "-F. Scott Fitzgerald",
    "No winter lasts forever, and no spring skips its turn…\n" +
            "-Hal Borland",
    "The only journey is the journey within…\n" +
            "-Lord Chesterfield",
    "A light heart lives long …\n" +
            "-William Shakespeare",
    "I have looked into your eyes with my eyes. I have put my heart near your heart…\n" +
            "-Pope John XXIII",
    "With the new day comes new strength and new thoughts…\n" +
            "-Eleanor Roosevelt",
    "Things turn out best for people who make the best of the way things turn out …\n" +
            "-John Wooden",
    "Do we not all agree to call rapid thought and noble impulse by the name of inspiration?…\n" +
            "-George Eliot",
    "Everyday is a gift, which is why they call it the present…\n" +
            "-Alfred Hitchcock",
    "Strive to be first: First to nod, First to smile, First to compliment, and first to forgive…\n" +
            "-Author Unknown",
    "Bringing up the past only if it will help to build the future, otherwise it’s best to be left to sleep…\n" +
            "-Tahir M. Khan",
    "When one door closes, another opens..but we often look so long and so regretfully upon the closed door that We do not see the one which has opened for us…\n" +
            "-Alexander Ghaham Bell",
    "First say to yourself what you would be; and then do what you have to do…\n" +
            "-Epictetus",
    "You jump off a cliff and you assemble an airplane on the way down…\n" +
            "-Reid Hoffman",
    "We are still masters of our fate. We are still captains of our souls…\n" +
            "-Winston Churchill",
    "I’m a great believer in luck, and I find the harder I work, the more I have of it…\n" +
            "-Thomas Jefferson",
    "Each day, accept everything that comes to you as a gift. At night, mentally give it all back. In this way, you become free…\n" +
            "-Daniel Levin",
    "In any moment of decision the best thing you can do is the right thing, the next best thing is the wrong thing, and the worst thing you can do is nothing…\n" +
            "-Theodore Roosevelt",
    "The world is full of suffering. It is also full of overcoming it…\n" +
            "-Helen Keller",
    "There is something simply beautiful and simply innocent, in being human. It is just so innocent and beautiful. I love it…\n" +
            "-C. JoyBell C.",
    "It doesn’t matter where you are, you are nowhere compared to where you can go…\n" +
            "-Bob Proctor",
    "One day, in retrospect, the years of struggle will strike you as the most beautiful…\n" +
            "-Sigmund Freud",
    "Don’t ask yourself what the world needs, ask yourself what makes you come alive. and then go do that. Because what the world needs is people who have come alive…\n" +
            "-Howard Thurman",
    "Follow your honest convictions, and stay strong…\n" +
            "-William Thackeray",
    "It is better to take many small steps in the right direction than to make a great leap forward only to stumble backward…\n" +
            "-Louis Sachar"
};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inspirational_quotes);

        ListView listView = findViewById(R.id.listView);

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.preference_category,inspirational_quotes);
        listView.setAdapter(adapter);

        listView.setOnItemLongClickListener(new AdapterView.OnItemLongClickListener() {
            @Override
            public boolean onItemLongClick(AdapterView<?> arg0, View arg1, int pos, long id) {
                String text = inspirational_quotes[pos];
                ClipData myClip;
                ClipboardManager clipboard = (ClipboardManager) getSystemService(Context.CLIPBOARD_SERVICE);
                myClip = ClipData.newPlainText("text", text);
                clipboard.setPrimaryClip(myClip);

                Toast.makeText(inspirational_quotes.this, "Item Copied ", Toast.LENGTH_SHORT).show();
                return true;
            }
        });
    }
}