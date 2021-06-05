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

public class motivational_quotes extends AppCompatActivity {
    ListView listView;

    String[] motivational_quotes = new String[]{"Don’t let people tell you your ideas are stupid. If you’re really passionate about something, find a way to build it…\n" +
            "-Dennis Crwley",
            "When the best things are not possible, the best may be made of those that are…\n" +
                    "-Richard Hooker",
            "The man of wisdom is never of two minds; the man of benevolence never worries; then man of courage is never afraid. The fact is, that to do anything in the world worth doing, we must not stand back shivering and thinking of the cold and danger, but jump in and scramble through as well as we can…\n" +
                    "-Robert Cushing",
            "I do it because I can, I can because I want to, I want to because you said I couldn’t!…\n" +
                    "-Author Unknown",
            "Take control of your destiny. Believe in yourself. Ignore those who try to discourage you. Avoid negative sources, people, places, things and habits. Don’t give up and don’t give in…\n" +
                    "-Wanda Hope Carter",
            "Experience is the child of thought, and thought is the child of action…\n" +
                    "-Benjamin Disraeli",
            "You don’t learn to walk by following rules. You learn by doing and falling over…\n" +
                    "-Richard Branson",
            "If you lose today, win tomorrow. In this never ending spirit of challenge is the heart of a victor…\n" +
                    "-Daisaku Ikeda",
            "A creative man is motivated by the desire to achieve, not by the desire to beat others…\n" +
                    "-Ayn Rand",
            "You have brains in your head. You have feet in your shoes. You can steer yourself in any direction you choose. You’re on your own. And you know what you know. You are the guy who’ll decide where to go…\n" +
                    "-Theodor Seuss Geisel",
            "Obstacles are those frightful things you see when you take your eyes off your goals…\n" +
                    "-Henry Ford",
            "Motivation is what gets you started. Habit is what keeps you going…J\n" +
                    "-im Rohn",
            "It doesn’t matter how slowly you go so long as you do not stop…\n" +
                    "-Confucius",
            "Hold yourself responsible for a higher standard than anybody else expects of you, never excuse yourself…\n" +
                    "-Henry Ward Beecher",
            "There is no one giant step that does it. It’s a lot of little steps …\n" +
                    "-Peter A. Cohen",
            "Twenty years from now you will be more disappointed by the things that you didn’t do than by the ones you did do. So throw off the bowlines. Sail away from the safe harbor. Catch the trade winds in your sails. Explore – Dream – Discover…\n" +
                    "-Mark Twain",
            "As soon as you truly commit to making something happen, the “how” will reveal itself…\n" +
                    "-Tony Robbins",
            "If all people in the world thought, the moon was not achievable those days, there wouldn’t be any mission to Mars these days…\n" +
                    "-C. Jay",
            "Believe you can and you are halfway there…\n" +
                    "-Theodore Roosevelt",
            "Be miserable. Or motivate yourself. Whatever has to be done, it’s always your choice…\n" +
                    "-Wayne Dyer",
            "I never took a day off in my twenties. Not one..\n" +
                    "-Bill Gates",
            "Constant dripping hollows out a stone…\n" +
                    "-Lucretius",
            "It’s not because things are difficult that we dare not venture. It’s because we dare not venture that they are difficult…\n" +
                    "-Seneca",
            "How long should you try? Until…\n" +
                    "-Jim Rohn",
            "Men often become what they believe themselves to be. If I believe I cannot do something, it makes me incapable of doing it. But when I believe I can, then I acquire the ability to do it even if I didn’t have it in the beginning…\n" +
                    "-Mahatma Gandhi",
            "They can because they think they can…\n" +
                    "-Virgil",
            "If you run, you stand a chance of losing. But if you don’t run, you’ve already lost…\n" +
                    "-Barack Obama",
            "You have to expect things of yourself before you can do them…\n" +
                    "-Michael Jordan",
            "Almost everything you do will seem insignificant, but it is important that you do it…\n" +
                    "-Mahatma Gandhi",
            "Great works are performed not by strength but by perseverance…\n" +
                    "-Samuel Johnson",
            "Even if you’re on the right track, you’ll get run over if you just sit there…\n" +
                    "-Will Rogers",
            "Visualize this thing that you want, see it, feel it, believe in it. Make your mental blue print, and begin to build…\n" +
                    "-Robert Collier",
            "Try and fail, but don’t fail to try…\n" +
                    "-Stephen Kaggwa",
            "To get something you never had, you have to do something you never did…\n" +
                    "-Author Unknown",
            "Everything that happens in our life, there’s a purpose. What we need is to widen our understanding, be more patient and persevere because in the end there’s a reward…\n" +
                    "-Author Unknown",
            "Don’t be afraid to go out on a limb. That’s where the fruit is…\n" +
                    "-H. Jackson Browne",
            "The darkest hour of the night came just before the dawn…\n" +
                    "-Paulo Coelho",
            "The future is called “perhaps,” which is the only possible thing to call the future. And the only important thing is not to allow that to scare you…\n" +
                    "-Tennessee Williams"
};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_motivational_quotes);

        ListView listView = findViewById(R.id.listView);

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.preference_category,motivational_quotes);
        listView.setAdapter(adapter);

        listView.setOnItemLongClickListener(new AdapterView.OnItemLongClickListener() {
            @Override
            public boolean onItemLongClick(AdapterView<?> arg0, View arg1, int pos, long id) {
                String text = motivational_quotes[pos];
                ClipData myClip;
                ClipboardManager clipboard = (ClipboardManager) getSystemService(Context.CLIPBOARD_SERVICE);
                myClip = ClipData.newPlainText("text", text);
                clipboard.setPrimaryClip(myClip);

                Toast.makeText(motivational_quotes.this, "Item Copied ", Toast.LENGTH_SHORT).show();
                return true;
            }
        });
    }
}