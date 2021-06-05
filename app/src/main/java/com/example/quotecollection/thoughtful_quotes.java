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

public class thoughtful_quotes extends AppCompatActivity {
    ListView listView;
    String[] thoughtful_quotes = {"Not everything that can be counted counts, and not everything that counts can be counted…\n" +
            "-Albert Einstein",
    "In everything, the middle course it best. All things in excess bring trouble to men…\n" +
            "-Titus Maccius Plautus",
    "Great spirits have always encountered violent opposition from mediocre minds…\n" +
            "-Albert Einstein",
    "I never made one of my discoveries through the process of rational thinking…\n" +
            "-Albert Einstein",
    "An eye for an eye only ends up making the whole world blind…\n" +
            "-Mahatma Gandhi",
    "A man is but the product of his thoughts. What he thinks, he becomes…\n" +
            "-Mahatma Gandhi",
    "Cause change and lead; accept change and survive; resist change and die\n" +
            "-Ray Norda",
    "The difference between what we do and what we are capable of doing would suffice to solve most of the world’s problems…\n" +
            "-Mahatma Gandhi",
    "The first and final thing you have to do in this world is to last it and not be smashed by it…\n" +
            "-Ernest Hemingway",
    "The glow of one warm thought is to me worth more than money…\n" +
            "-Thomas Jefferson",
    "No one can make you feel inferior without your consent…\n" +
            "-Rosa Parks",
    "Two percent of the people think; three percent of the people think they think; and ninety-five percent of the people would rather die than think…\n" +
            "-George Bernard Shaw",
    "The best way out is always through…\n" +
            "-Robert Frost",
    "Sometimes the road less traveled is less traveled for a reason…\n" +
            "-Jerry Seinfeld",
    "If you find yourself in a hole, stop digging…\n" +
            "-Will Rogers",
    "You cannot push anyone up the ladder unless he is willing to climb…\n" +
            "-Andrew Carnegie",
    "People take different roads seeking fulfillment and happiness. Just because they’re not on your road doesn’t mean they’ve gotten lost…\n" +
            "-Dalai Lama",
    "No matter how bad things are, you can always make things worse…\n" +
            "-Randy Pausch",
    "When someone tells me ‘no,’ it doesn’t mean I can’t do it, it simply means I can’t do it with them…\n" +
            "-Karen E. Quinones Miller",
    "Common sense is not so common…\n" +
            "-Jessica Truman",
    "It was character that got us out of bed, commitment that moved us into action, and discipline that enabled us to follow through…\n" +
            "-Zig Ziglar",
    "We must always seek to ally ourselves with that part of the enemy that knows what is right…\n" +
            "-Mahatma Gandhi",
    "Better to remain silent and be thought a fool than to speak out and remove all doubt…\n" +
            "-Abraham Lincoln",
    "If you accept the expectations of others, especially negative ones, then you never will change the outcome…\n" +
            "-Michael Jordan",
    "All things excellent are as difficult as they are rare…\n" +
            "-Baruch Spinoza",
    "The whole is more than the sum of its parts…\n" +
            "-Aristotle",
    "The quicker you let go of old cheese, the sooner you find new cheese…\n" +
            "-Spencer Johnson",
    "Complaining is silly. Either act or forget…\n-" +
            "Stefan Sagmeister",
    "The quieter you become, the more you can hear…\n-" +
            "Baba Ramdas",
    "You can’t understand where someone’s going unless you understand where they’ve been…\n" +
            "-Jerry B. Jenkins",
    "Give me six hours to chop down a tree and I will spend the first four sharpening the ax…\n" +
            "-Abraham Lincoln",
    "To understand the heart and mind of a person, look not at what he has already achieved, but what he aspires to…\n" +
            "-Kahlil Gibran",
    "The components of anxiety, stress, fear, and anger do not exist independently of you in the world. They simply do not exist in the physical world, even though we talk about them as if they do…\n" +
            "-Wayne Dyer",
    "The service you do for others is the rent you pay for the time you spend on earth…\n" +
            "-Mohammed Ali",
    "Never chase love, affection or attention. If it isn’t given freely by another person it isn’t worth having…\n" +
            "-Author Unknown",
    "You cannot step into the same river twice, for other waters are continually flowing on…\n" +
            "-Heraclitus",
    "As I grow older, I pay less attention to what men say. I just watch what they do…\n" +
            "-Andrew Carnegie",
    "No one has ever made himself great by showing how small someone else is…\n" +
            "-Irvin Himmel"
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_thoughtful_quotes);

        ListView listView = findViewById(R.id.listView);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.preference_category,thoughtful_quotes);
        listView.setAdapter(adapter);

        listView.setOnItemLongClickListener(new AdapterView.OnItemLongClickListener() {
            @Override
            public boolean onItemLongClick(AdapterView<?> arg0, View arg1, int pos, long id) {
                String text = thoughtful_quotes[pos];
                ClipData myClip;
                ClipboardManager clipboard = (ClipboardManager) getSystemService(Context.CLIPBOARD_SERVICE);
                myClip = ClipData.newPlainText("text", text);
                clipboard.setPrimaryClip(myClip);

                Toast.makeText(thoughtful_quotes.this, "Item Copied ", Toast.LENGTH_SHORT).show();
                return true;
            }
        });
    }
}