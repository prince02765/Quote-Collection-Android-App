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

public class wisdom_quotes extends AppCompatActivity {
    ListView listView;

    String[] wisdom_quotes = {"A fool’s mind is at the mercy of his tongue and a wise man’s tongue is under the control of his mind…\n" +
            "-Hazrat Ali Ibn Abu-Talib",
    "It is unwise to be too sure of one’s own wisdom. It is healthy to be reminded that the strongest might weaken and the wisest might err…\n" +
            "-Mahatma Gandhi",
    "A wise man first thinks and then speaks and a fool speaks first and then thinks…\n" +
            "-Hazrat Ali ibn Abu-Talib",
    "From the errors of others, a wise man corrects his own…\n" +
            "-Publilius Syrus",
    "It is easier to be wise for others than for ourselves…\n" +
            "-François de La Rochefoucauld",
    "Take risks; if you win, you will be happy.. If you lose, you will be wise…\n" +
            "-Author Unknown",
    "The art of being wise is knowing what to overlook…\n" +
            "-William James",
    "Three methods to learn wisdom: 1. Reflection..Which is noblest; 2. Imitation.. Which is easiest; and 3. Experience.. Which is the bitterest…\n" +
            "-Confucius",
    "Wise men are not always silent, but they know when to be…\n" +
            "-Author Unknown",
    "Wise men speak because they have something to say; Fools because they have to say something…\n" +
            "-Plato",
    "What the superior man seeks is in himself.. what the small man seeks is in others…\n" +
            "-Confucius",
    "It requires wisdom to understand wisdom: the music is nothing if the audience is deaf…\n" +
            "-Walter Lippmann",
    "Knowledge speaks, but wisdom listens…\n" +
            "-Jimi Hendrix",
    "It is unwise to be too sure of one’s own wisdom. It is healthy to be reminded that the strongest might weaken and the wisest might err…\n" +
            "-Mahatma Gandhi",
    "Nature and wisdom never are at strife…\n" +
            "-Plutarch",
    "Knowing yourself is the beginning of all wisdom…\n" +
            "-Aristotle",
    "The first step in the acquisition of wisdom is silence, the second listening, the third memory, the fourth practice, the fifth teaching others…\n" +
            "-Solomon Ibn Gabriol",
    "Nobody can give you wiser advice than yourself…\n" +
            "-Cicero",
    "The wisdom of nations lies in their proverbs, which are brief and pithy…\n" +
            "-William Penn",
    "Wisdom is knowing what to do next, skill is knowing how to do it, and virtue is doing it…\n" +
            "-David Starr Jordan",
    "The only medicine for suffering, crime, and all the other woes of mankind, is wisdom…\n" +
            "-Thomas Huxley",
    "Wisdom is nothing more than healed pain…\n" +
            "-Robert Gary Lee",
    "A loving heart is the truest wisdom…\n" +
            "-Charles Dickens",
    "A wise man looks upon men as he does on horses; all their comparisons of title, wealth, and place, he considers but as harness…\n" +
            "-Robert Cecil",
    "Better be wise by the misfortunes of others than by your own…\n" +
            "-Aesop",
    "Wisdom is always an over-match for strength…\n" +
            "-Phil Jackson",
    "All truly wise thoughts have been thought already thousands of times; but to make them truly ours, we must think them over again honestly, till they take root in our personal experience…\n" +
            "-Johann Wolfgang Von Goethe",
    "Strength and wisdom are not opposing values…\n" +
            "-Bill Clinton",
    "Be wiser than other people if you can; but do not tell them so…\n" +
            "-Lord Chesterfield",
    "Wise men know their limits; great men know none…\n" +
            "-Author Unknown",
    "A word to the wise isn’t necessary, it is the stupid ones who need all the advice…\n" +
            "-Bill Cosby",
    "A short saying often contains much wisdom…\n" +
            "-Sophocles",
    "The end of wisdom is to dream high enough to lose the dream in the seeking of it…\n" +
            "-William Faulkner",
    "True wisdom comes to each of us when we realize how little we understand about life, ourselves, and the world around us…\n" +
            "-Socrates",
    "A fool will learn nothing from a wise man, but a wise man will learn much from a fool…\n" +
            "-Confucius",
    "A wise man will make more opportunities than he finds…\n" +
            "-Francis Bacon",
    "Never equate education with intelligence; nor intelligence with wisdom…\n" +
            "-Author Unknown"
};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wisdom_quotes);

        ListView listView = findViewById(R.id.listView);
        ArrayAdapter<String>adapter = new ArrayAdapter<String>(this, android.R.layout.preference_category,wisdom_quotes);
        listView.setAdapter(adapter);

        listView.setOnItemLongClickListener(new AdapterView.OnItemLongClickListener() {
            @Override
            public boolean onItemLongClick(AdapterView<?> arg0, View arg1, int pos, long id) {
                String text = wisdom_quotes[pos];
                ClipData myClip;
                ClipboardManager clipboard = (ClipboardManager) getSystemService(Context.CLIPBOARD_SERVICE);
                myClip = ClipData.newPlainText("text", text);
                clipboard.setPrimaryClip(myClip);

                Toast.makeText(wisdom_quotes.this, "Item Copied ", Toast.LENGTH_SHORT).show();
                return true;
            }
        });
    }
}