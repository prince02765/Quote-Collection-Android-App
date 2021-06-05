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

public class love_quotes extends AppCompatActivity {
    ListView listView;
    String [] love_quotes = {"When we love, we always strive to become better than we are. When we strive to become better than we are, everything around us becomes better too…\n" +
            "-Paulo Coelho",
    "Once you have learned to love, you will have learned to live…\n" +
            "-Author Unknown",
    "Love is that condition in which the happiness of another person is essential to your own…\n" +
            "-Robert A. Heinlein",
    "I love her and that’s the beginning and end of everything…\n" +
            "-F. Scott Fitzgerald",
    "Where love is concerned, too much is not even enough…\n" +
            "-Pierre de Beaumarchais",
    "He who is devoid of the power to forgive is devoid of the power to love…\n" +
            "-Martin Luther King, Jr.",
   "Where there is love there is life…Mahatma Gandhi",
    "Love is horrible when uni-directional. Terrible when multi-directional. But amazingly Beautiful when bi-directional…\n" +
            "-C. Jay",
    "People wait around too long for love. I’m happy with all of my lusts!…\n" +
            "-C. JoyBell C",
    "We cannot do great things on this Earth, only small things with great love…\n" +
            "-Mother Teresa",
    "Before, I wanted to say: I found love!..But now, I want to say: I found a person, and he belongs to me and I belong to him…\n" +
            "-C. JoyBell C.",
    "I would rather have eyes that cannot see; ears that cannot hear; lips that cannot speak, than a heart that cannot love…\n" +
            "-Robert Tizon",
    "Who, being loved, is poor?…\n" +
            "-Oscar Wilde",
    "Love is the absence of judgment…\n" +
            "-Dalai Lama",
    "Love makes your soul crawl out from its hiding place…\n" +
            "-Zora Neale Hurston",
    "Tell me who loves, who admires you, and I will tell you who you are…\n" +
            "-Charles Augustin Sainte",
    "Faith moves mountains, love transforms hearts…\n" +
            "-John Paul Warren",
    "The hate you put out there will eventually come back to you, So love and you will receive love…\n" +
            "-Author Unknown",
    "True love is being as one. When you hurt, I hurt. When you laugh, I laugh. When you cry, I cry. When you breathe, I breathe. What you see, I see. What you desire, I desire. Nothing can break this bond of one but one itself…\n" +
            "-Stacy Wilks",
    "When you love someone, you love the person as they are, and not as you’d like them to be…\n" +
            "-Leo Tolstoy",
    "A coward is incapable of exhibiting love; it is the prerogative of the brave…\n" +
            "-Mahatma Gandhi",
    "Love is like a good cake; you never know when it’s coming, but you’d better eat it when it does!…\n" +
            "-C. JoyBell C.",
    "And still, after all this time, the Sun has never said to the Earth..You owe me.. Look what happens with love like that. It lights up the sky…\n" +
            "=Rumi",
    "To forgive is the highest, most beautiful form of love. In return, you will receive untold peace and happiness…\n" +
            "-Robert Muller",
    "In dreams and in love there are no impossibilities…\n" +
            "-Janos Amay",
    "I don’t look for love. Love looks for me.” “Why?” “Because it needs me. Because I’m not afraid of it…\n" +
            "-C. JoyBell C.",
    "Love me and the world is mine…\n" +
            "-David Reed",
    "Love is a force more formidable than any other. It is invisible, it cannot be seen or measured, yet it is powerful enough to transform you in a moment, and offer you more joy than any material possession could…\n" +
            "-Barbara De Angelis",
    "I have found the paradox that if I love until it hurts, then there is no hurt, but only more love…\n" +
            "-Mother Teresa",
    "Whenever you are confronted with an opponent, conquer him with love…\n" +
            "-Mahatma Gandhi",
    "Even if you push them away, people who truly love you will always choose to stay…\n" +
            "-Author Unknown",
    "Love Is the Irresistible Desire to be Irresistibly Desired…\n" +
            "-Mark Twain",
    "We are shaped and fashioned by what we love…\n" +
            "-Johann Wolfgang Von Goethe",
    "Love is everything it’s cracked up to be. That’s why people are so cynical about it. It really is worth fighting for, being brave for, risking everything for. And the trouble is, if you don’t risk anything, you risk even more…\n" +
            "-Erica Jong",
    "The law of love could be best understood and learned through little children…\n" +
            "-Mahatma Gandhi",
    "Respect is love in plain clothes…\n" +
            "-Frank Byrnes",
    "There is a place you can touch a woman That will drive her crazy. Her heart…\n" +
            "-Melanie Griffith",
    "Love is composed of a single soul inhabiting two bodies…\n" +
            "-Aristotle"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_love_quotes);

        ListView listView = findViewById(R.id.listView);

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,android.R.layout.preference_category,love_quotes);
        listView.setAdapter(adapter);

        listView.setOnItemLongClickListener(new AdapterView.OnItemLongClickListener() {
            @Override
            public boolean onItemLongClick(AdapterView<?> arg0, View arg1, int pos, long id) {
                String text = love_quotes[pos];
                ClipData myClip;
                ClipboardManager clipboard = (ClipboardManager) getSystemService(Context.CLIPBOARD_SERVICE);
                myClip = ClipData.newPlainText("text", text);
                clipboard.setPrimaryClip(myClip);

                Toast.makeText(love_quotes.this, "Item Copied ", Toast.LENGTH_SHORT).show();
                return true;
            }
        });
    }
}