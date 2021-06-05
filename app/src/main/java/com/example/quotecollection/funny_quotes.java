package com.example.quotecollection;

import androidx.appcompat.app.AppCompatActivity;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class funny_quotes extends AppCompatActivity {
    ListView listView;
    String[] funny_quotes = {"When I was born, the doctor came out to the waiting room and said to my father.. I’m very sorry, We did everything we could.. But he pulled through…\n" +
            "-Rodney Dangerfield",
    "To steal ideas from one person is plagiarism. To steal from many is research… \n" +
            "-Wilson Mizner",
    "It is the duty of the Patriot to protect his country from its government… \n" +
            "-Thomas Paine",
    "What would men be without women?..Scarce, sir… might scarce… \n" +
            "-Mark Twin",
    "A computer once beat me at chess, but it was no match for me at kick boxing… \n" +
            "-Emo Philips",
    "I didn’t fall. The floor just needed a hug … \n" +
            "-Author Unknown",
    "I feel sorry for people who don’t drink. When they wake up in the morning, that’s good as they’re going to feel all day… \n" +
            "-Frank Sinatra",
    "I’m so clever that sometimes I don’t understand a single word of what I’m saying… \n" +
            "-Oscar Wilde",
    "Money can’t buy happiness. It can, however rent it … \n" +
            "-Author Unknown",
    "Always borrow money from a pessimist. He won’t expect it back… \n" +
            "-Oscar Wilde",
    "You have to stay in shape. My grandmother, she started walking five miles a day when she was 60. She’s 97 today and we don’t know where the hell she is… \n" +
            "-Ellen DeGeneres",
    "Why didn’t Noah swat those two mosquitoes?… \n" +
            "-Author Unknown",
    "Avoid fruits and nuts. You are what you eat… \n" +
            "-Jim Davis",
    "Better to remain silent and be thought a fool than to speak out and remove all doubt… \n" +
            "-Abraham Lincoln",
    "The trouble with being punctual is that nobody’s there to appreciate it… \n" +
            "-Franklin P. Jones",
    "Gravitation is not responsible for people falling in love… \n" +
            "-Albert Einstein",
    "The hardest thing in the world to understand is the income tax… \n" +
            "-Albert Einstein",
    "America is a country where half the money is spent buying food, and the other half is spent trying to lose weight… \n" +
            "-Author Unknown",
    "Always end the name of your child with a vowel, so that when you yell the name will carry… \n" +
            "-Bill Cosby",
    "The only mystery in life is why the kamikaze pilots wore helmets… \n" +
            "-Al McGuire",
    "Patience is something you admire in the driver behind you, but not in one ahead… \n" +
            "-Bill McGlashen",
    "Never go to bed angry, stay awake and plot your revenge… \n" +
            "-Author Unknown",
    "Yes Madam I am drunk but in the morning I shall be sober and you will still be ugly… \n" +
            "-Winston Churchill",
    "Skinny jeans are like calories. Easy to put on but impossible to take off… \n" +
            "-Author Unknown",
    "Your environment will eat your goals and plans for breakfast… \n" +
            "-Steve Pavlina" ,
            "The quickest way to double your money is to fold it over and put it back in your pocket… \n" +
                    "-Will Rogers",
    "If women ran the world we wouldn’t have wars, just intense negotiations every 28 days… \n" +
            "-Robin Williams",
    "How is it one careless match can start a forest fire, but it takes a whole box to start a campfire… \n" +
            "-Author Unknown",
    "When I was a boy of fourteen, my father was so ignorant. I could hardly stand to have the old man around. But when I got to be twenty one, I was astonished at how much he had learned in seven years… \n" +
            "-Mark Twain",
    "If you die in an elevator, be sure to push the up button… \n" +
            "-Sam Levenson",
    "A house is just a place to keep your stuff while you go out and get more stuff… \n" +
            "-George Carlin",
    "If you think nobody cares if you’re alive, try missing a couple of car payments… \n" +
            "-Earl Wilson",
    "If you can make a girl laugh, you can make her do anything… \n" +
            "-Marilyn Monroe",
    "To be old & wise, you must first have to be young & stupid… \n" +
            "-Author Unknown",
    "Love is grand, Divorce is a hundred grand… \n" +
            "-Author Unknown",
    "Men marry women with the hope they will never change. Women marry men with the hope they will change. Invariably they are both disappointed… \n" +
            "-Albert Einstein",
    "Good Enough is the New Perfect… \n" +
            "-Becky Beaupre Gillespie",
    "A citizen of America will cross the ocean to fight for democracy, but won’t cross the street to vote in a national election… \n" +
            "-Bill Vaughan"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_funny_quotes);

        ListView listView = findViewById(R.id.listView);

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.preference_category, funny_quotes);
        listView.setAdapter(adapter);

        listView.setOnItemLongClickListener(new AdapterView.OnItemLongClickListener() {
            @Override
            public boolean onItemLongClick(AdapterView<?> arg0, View arg1, int pos, long id) {
                String text = funny_quotes[pos];
                ClipData myClip;
                ClipboardManager clipboard = (ClipboardManager) getSystemService(Context.CLIPBOARD_SERVICE);
                myClip = ClipData.newPlainText("text", text);
                clipboard.setPrimaryClip(myClip);

                Toast.makeText(funny_quotes.this, "Item Copied ", Toast.LENGTH_SHORT).show();
                return true;
            }
        });
    }
}