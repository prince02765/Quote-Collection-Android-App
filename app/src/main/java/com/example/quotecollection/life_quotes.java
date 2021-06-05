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

public class life_quotes extends AppCompatActivity {
    ListView listView;
    String [] life_quotes = {"Life is a shipwreck but we must not forget to sing in the lifeboats…\n" +
            "-Voltaire",
            "Life is too short to be living somebody else’s dream …\n" +
                    "-Hugh Hefner",
            "Life is either a daring adventure or nothing…\n" +
                    "-Helen Keller",
            "In three words I can sum up everything I’ve learned about life.. It goes on…\n" +
                    "-Robert Frost",
            "Many of life’s failures are experianced by people who did not realize how close they were to success when they gave up…\n" +
                    "-Thomas Edison",
            "Life is like a game of cards. The hand that is dealt you represents determinism; the way you play it is free will…\n" +
                    "-Jawaharlal Nehru",
            "There are only two ways to live your life. One is as though nothing is a miracle. The other is as though everything is a miracle…\n" +
                    "-Albert Einstein",
            "The best years of your life are the ones in which you decide your problems are your own. You do not blame them on your mother, the ecology, or the president. You realize that you control your own destiny…\n" +
                    "-Albert Ellis",
            "As much as you live your life in the present, burdens in the past or uncertainties in the future will not bother you…\n" +
                    "-C. Jay",
            "Don’t go around saying, the world owes you a living. The world owes you nothing. It was here first…\n" +
                    "-Mark Twain",
            "The mystery of life is not a problem to be solved but a reality to be experienced…\n" +
                    "-Art Van Der Leeuw",
            "Take care of your body. It’s the only place you have to live…\n" +
                    "-Jim Rohn",
            "Everyone has his own specific vocation or mission in life… Therein he cannot be replaced, nor can his life be repeated. Thus, everyone’s task is as unique as is his specific opportunity to implement it…\n" +
                    "-Viktor Frankl",
            "Nothing is likely to help a person overcome or endure troubles than the consciousness of having a task in life…\n" +
                    "-Victor Frankl",
            "People will forget what you said. People will forget what you did. But people will never forget how you made them feel…\n" +
                    "-Maya Angelou",
            "My Life is My Message…\n" +
                    "-Mahatma Gandhi",
            "There is always room in your life for thinking bigger, pushing limits and imagining the impossible…\n" +
                    "-Tony Robbins",
            "no matter what happens, or how bad it seems today, life does go on, and it will be better tomorrow…\n" +
                    "-Maya Angelou",
            "There is more to life than simply increasing its speed…\n" +
                    "-Mahatma Gandhi",
            "Let yourself be open and life will be easier. A spoon of salt in a glass of water makes the water undrinkable. A spoon of salt in a lake is almost unnoticed…\n" +
                    "-Gautama Buddha",
            "Only a life lived for others is worth living…\n" +
                    "-Albert Einstein",
            "Things end. People leave. And you know what? Life goes on. Besides, if bad things didn’t happen, how would you be able to feel the good ones?…\n" +
                    "-Elizabeth Scott",
            "The more I think of it, the more I realize there are no answers. Life is to be lived…\n" +
                    "-Marilyn Monroe",
            "It’s time to start living the life you’ve imagined…\n" +
                    "-Henry James",
            "It’s not what you say out of your mouth that determines your life, it’s what you whisper to yourself that has the most power…\n" +
                    "-Robert Kiyosaki",
            "One of the most scariest thing in life is, when you come to the realization that only thing that can save you is your self…\n" +
                    "-Demi Lovato",
            "Every moment and every event of every man’s life on earth plants something in his soul…\n" +
                    "-Thomas Merton",
            "The best things in life are never rationed. Friendship, loyalty, love do not require coupons…\n" +
                    "-George T. Hewitt",
            "What do we live for, if it is not to make life less difficult for each other?…\n" +
                    "-George Eliot",
            "Life is 10% what happens to you and 90% how you react to it…Charles SwindollWhat do we live for; if it is not to make life less difficult to each other?\n" +
                    "-George Eliot",
            "The Unexamined Life is Not Worth Living…\n" +
                    "-Socrates",
            "Life is change. Growth is optional. Choose wisely…\n" +
                    "-Author Unknown",
            "Obscurity and a competence. That is the life that is best worth living…\n" +
                    "-Mark Twain",
            "In life, as in football, you won’t go far unless you know where the goalposts are…\n" +
                    "-Arnold H. Glasgow",
            "You need a plan to build a house. To build a life, it is even more important to have a plan or goal…\n" +
                    "-Zig Ziglar",
            "One’s life begins when they are finally able to live for something other than themselves…\n" +
                    "-Albert Einstein",
            "Participate in life instead of just watching it pass you by…L\n" +
                    "-indsey Wonderson"
    };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_life_quotes);

        ListView listView = findViewById(R.id.listView);

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.preference_category,life_quotes);
        listView.setAdapter(adapter);

        listView.setOnItemLongClickListener(new AdapterView.OnItemLongClickListener() {
            @Override
            public boolean onItemLongClick(AdapterView<?> arg0, View arg1, int pos, long id) {
                String text = life_quotes[pos];
                ClipData myClip;
                ClipboardManager clipboard = (ClipboardManager) getSystemService(Context.CLIPBOARD_SERVICE);
                myClip = ClipData.newPlainText("text", text);
                clipboard.setPrimaryClip(myClip);

                Toast.makeText(life_quotes.this, "Item Copied ", Toast.LENGTH_SHORT).show();
                return true;
            }
        });

    }
}