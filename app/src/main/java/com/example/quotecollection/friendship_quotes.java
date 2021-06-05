package com.example.quotecollection;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.AbsListView;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.lang.reflect.Array;

public class friendship_quotes extends AppCompatActivity {
    ListView listView;

    String[] friendship_quotes = {"Truly great friends are hard to find, difficult to leave, and impossible to forget… \n" +
            "-G. Randolf",
            "Am I not destroying my enemies when I make friends of them?… \n" +
                    "-Abraham Lincoln",
            "The only way to have a friend is to be one… \n" +
                    "-Ralph Waldo Emerson", "Stay is a charming word in a friend’s vocabulary…\n " +
            "-Louisa May Alcott",
            "A real friend is one who walks in when the rest of the world walks out… \n" +
                    "-Walter Winchell",
            "What progress, you ask, have I made?.. I have begun to be friend to myself… \n" +
                    "-Hecato",
            "A true friend is one soul in two bodies… \n" +
                    "-Aristotle",
            "The good man is the friend of all living things…\n" +
                    "-Mahatma Gandhi",
            "Be courteous to all, but intimate with few, and let those few be well tried before you give them your confidence… \n" +
                    "-George Washington",
            "A friend is one who has the same enemies as you have…\n " +
                    "-Abraham Lincoln",
            "Father is my Defender (Hero). Mother is my Teacher. Sister is my Counselor. Wife is my Savior. Children are my Fighters. Then what is the role of my Friend?.. Friend is my motivator in life… \n" +
                    "-Sandeep Kumar",
            "Associate with men of good quality if you esteem your own reputation; for it is better to be alone than in bad company… \n" +
                    "-George Washington",
            "You can make a new friend but you can’t make an old one… \n" +
                    "-Tom Bodett",
            "I know what I have given you, I do not know what you have received… \n" +
                    "-Antonio Porchia",
            "The differences between friends cannot but reinforce their friendship… \n" +
                    "-Mao Tse-Tung",
            "A true friend is someone who is there for you when he’d rather be anywhere else… \n" +
                    "-Len Wein",
            "Each friend represents a world in us, a world possibly not born until they arrive, and it is only by this meeting that a new world is born… \n" +
                    "-Anais Nin",
            "The firmest of friendships have been formed in mutual adversity, as iron is most strongly united by the fiercest flame… \n" +
                    "-Charles Caleb Colton",
            "I destroy my enemies when I make them my friends… \n" +
                    "-Abraham Lincoln",
            "Between men and women there is no friendship possible. There is passion, enmity, worship, love, but no friendship… \n" +
                    "-Oscar Wilde",
            "Friendship is the source of the greatest pleasures, and without friends even the most agreeable pursuits become tedious… \n" +
                    "-St. Thomas Aquinas",
            "Value friendship for what there is in it, not for what can be gotten out of it… \n" +
                    "-H. Clay Trumbull",
            "He who sows courtesy, reaps friendship; he who plants kindness, gathers love… \n" +
                    "-Saint Basil",
            "Friends are like melons; shall I tell you why?.. To find one good, you must one hundred try… \n" +
                    "-Claude Mermet",
            "When you really matter to someone, that person will always make time for you. No excuses, no lies, and no broken promises… \n" +
                    "-Author Unknown",
            "One friend in a lifetime is much, two are many, three are hardly possible… \n" +
                    "-Henry Adams",
            "Friendship is the soul’s heaven… \n" +
                    "-A. Bronson Alcott",
            "A false friend and a shadow attend only while the sun shines… \n" +
                    "-Benjamin Franklin",
            "A friend is someone who knows all about you and still loves you… \n" +
                    "-Elbert Hubbard",
            "A friend is one that knows you as you are, understands where you have been, accepts what you have become, and still, gently allows you to grow… \n" +
                    "-William Shakespeare",
            "A friend is, as it were, a second self… \n" +
                    "-Cicero",
            "Friendship needs no words. It is solitude delivered from the anguish of loneliness… \n" +
                    "-Dag Hammarskjold",
            "Friends are thieves of time… \n" +
                    "-Francis Bacon",
            "No one would choose a friendless existence on condition of having all the other things in the world… \n" +
                    "-Aristotle",
            "Friendship isn’t a big thing, it’s a million little things… \n" +
                    "-Author Unknown",
            "Good friends dont let you do stupid things.. \n" +
                    "-Alone… Author Unknown",
            "When you ask God for a gift, Be thankful if he sends, Not diamonds, pearls or riches, but the love of real true friends… \n" +
                    "-Helen Steiner Rice","Friendship is a word, the very sight of which in print makes the heart warmAugustine \n" +
            "-Birrell"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_friendship_quotes);

        ListView listView = findViewById(R.id.listView);

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.preference_category,friendship_quotes);

        listView.setAdapter(adapter);

        listView.setOnItemLongClickListener(new AdapterView.OnItemLongClickListener() {
            @Override
            public boolean onItemLongClick(AdapterView<?> arg0, View arg1, int pos, long id) {
                String text = friendship_quotes[pos];
                ClipData myClip;
                ClipboardManager clipboard = (ClipboardManager) getSystemService(Context.CLIPBOARD_SERVICE);
                myClip = ClipData.newPlainText("text", text);
                clipboard.setPrimaryClip(myClip);

                Toast.makeText(friendship_quotes.this, "Item Copied ", Toast.LENGTH_SHORT).show();
                return true;
            }
        });
    }
}