package com.example.quotecollection;

import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.view.menu.ActionMenuItemView;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class happiness_quotes extends AppCompatActivity {
    ListView listView;
    String [] happiness_quotes = {"Happiness is not a state to arrive at, but a manner of traveling…\n" +
            "-Margaret Lee Runbeck",
    "The only way on earth to multiply happiness is to divide it…\n" +
            "-Paul Scherer",
    "Find the place inside where there is joy and the joy will burn out the pain…\n" +
            "-Joseph Campbell",
    "There is only one person would could ever make you happy, and that person is you…\n" +
            "-David Burns",
    "Seek to do good, and you will find that happiness will run after you…\n" +
            "-James Freeman Clarke",
    "Happiness is not a matter of events, it depends upon the tides of the mind…\n" +
            "-Alice Meynell",
    "The happy people are failures because they are on such good terms with themselves they don’t give a damn…\n" +
            "-Agatha Christie",
    "Happiness is not something you postpone for the future; it is something you design for the present…\n" +
            "-Jim Rohn",
    "Whoever is happy will make others happy too…\n" +
            "-Anne Frank",
    "My life has no purpose, no direction, no aim, no meaning, and yet I’m happy. I can’t figure it out. What am I doing right?…\n" +
            "-Charles Schulz",
    "Happiness depends more on the inward disposition of mind than on outward circumstances…\n" +
            "-Benjamin Franklin",
    "You are happiest while you are making the greatest contribution…\n" +
            "-Robert F. Kennedy",
    "Action may not always bring happiness; but there is no happiness without action…\n" +
            "-Benjamin Disraeli",
    "Great effort from great motives is the best definition of a happy life…\n" +
            "-William Ellery Channing",
    "Happiness grows at our own firesides, and is not to be picked in stranger’s gardens…\n" +
            "-Douglas Jerrold",
    "Happiness is where we find it, but rarely where we seek it…\n" +
            "-J. Petit Senn",
    "Those who are not looking for happiness are the most likely to find it, because those who are searching forget that the surest way to be happy is to seek happiness for others…\n" +
            "-Martin Luther King, Jr.",
    "For every minute you are angry you lose sixty seconds of happiness…\n" +
            "-Ralph Waldo Emerson",
    "Now and then it’s good to pause in our pursuit of happiness and just be happy…\n" +
            "-Guillaume Apollinaire",
    "For happiness is anyone and anything at all that’s loved by you…\n" +
            "-Charlie Brown",
    "Happiness depends upon ourselves…\n" +
            "-Aristotle",
    "Try to be happy in this present moment, and put not off being so to a time to come, as though that time should be of another make from this, which has already come and is ours…\n" +
            "-Thomas Fuller",
    "Knowledge of what is possible is the beginning of happiness…\n" +
            "-George Santayana",
    "Happiness resides not in possessions, and not in gold, happiness dwells in the soul…\n" +
            "-Democritus",
    "Our minds are as different as our faces: we are all traveling to one destination; Happiness.. but few are going by the same road…\n" +
            "-Charles Caleb Colton",
    "Why not learn to enjoy the little things.. there are so many of them…\n" +
            "-Author Unknown",
    "Happiness is when what you think, what you say, and what you do are in harmony…\n" +
            "-Mahatma Gandhi",
    "To get up each morning with the resolve to be happy… is to set our own conditions to the events of each day. To do this is to condition circumstances instead of being conditioned by them…\n" +
            "-Ralph Waldo Emerson",
    "We either make ourselves miserable, or we make ourselves happy. The amount of work is the same…\n" +
            "-Carlos Castaneda",
    "Resolve to keep happy, and your joy and you shall form an invincible host against difficulties…\n" +
            "-Helen Keller",
    "Happiness will come to you when it comes from you. Success will be yours when you choose to take responsibility for making it so…\n" +
            "-Author Unknown",
    "Remember that happiness is a way of travel, not a destination…\n" +
            "-Roy Goodman",
    "When one door of happiness closes, another opens; but often we look so long at the closed door that we do not see the one which has been opened for us…\n" +
            "-Helen Keller",
    "Happiness comes when you focus on seeing the light at the end of every tunnel and being the light for those you love…\n" +
            "-Karen Salmansohn",
    "Happiness does not consist in pastimes and amusements but in virtuous activities…\n" +
            "-Aristotle",
    "If you have nothing else to do, look about you and see if there isn’t something close at hand that you can improve! It may make you wealthy, though it is more likely that it will make you happy…\n" +
            "-George Matthew Adams",
    "Most folks are about as happy as they make up their minds to be…\n" +
            "-Abraham Lincoln",
    "Happiness is not in our circumstance but in ourselves. It is not something we see, like a rainbow, or feel, like the heat of a fire. Happiness is something we are…\n" +
            "-John B. Sheerin"
};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_happiness_quotes);

        ListView listView = findViewById(R.id.listView);

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.preference_category,happiness_quotes);
        listView.setAdapter(adapter);

        listView.setOnItemLongClickListener(new AdapterView.OnItemLongClickListener() {
            @Override
            public boolean onItemLongClick(AdapterView<?> arg0, View arg1, int pos, long id) {
                String text = happiness_quotes[pos];
                ClipData myClip;
                ClipboardManager clipboard = (ClipboardManager) getSystemService(Context.CLIPBOARD_SERVICE);
                myClip = ClipData.newPlainText("text", text);
                clipboard.setPrimaryClip(myClip);

                Toast.makeText(happiness_quotes.this, "Item Copied ", Toast.LENGTH_SHORT).show();
                return true;
            }
        });
    }
}

    