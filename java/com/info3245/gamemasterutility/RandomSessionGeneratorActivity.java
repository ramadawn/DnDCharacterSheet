package com.info3245.gamemasterutility;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class RandomSessionGeneratorActivity extends AppCompatActivity {

    int sessionPosition;
    String[] sessionList = {"The party are all framed for the same murder/robbery and meet in jail.",
            "The party are all victims of a doppelganger who stole each of your identities.",
            "The party all meet at a nearby bar to accept the same job.",
            "The party start as guards to a noble’s gathering on the eve of a revolutionary uprising.",
            "The party finds, to their surprise, that they are the only non-cultists staying at the inn.",
            "Locals hear chants in the nearby ruins, the party is sent out to investigate.",
            "A map has been found that leads to parts of an artifact that once reassembled, will summon a fiendish monster.",
            "The party is sent to find a hermit that lives on the “moving island”, a zircon/dragon turtle.",
            "A local sage/astronomer is convinced that a massive meteor is going to strike the kingdom/city/town.",
            "News spreads that a dragon was slain while away from his cave, a search for its unguarded hoard is underway.",
            "A thief has stolen a powerful item from a lich and then joins the party for protection.",
            "Rat catchers are going missing under the city and a plague is spreading in their absence.",
            "A wandering merchant trades a party member for their magic item for a fake he claims is more powerful.",
            "A powerful noble/wizard is hosting a masquerade ball where the guests are polymorphed into monster as their costume, but an actual monster attends to kill the noble/wizard.",
            "A sorcerer has died of old age, strange things are creeping out of his tower as his spells, and creations break down.",
            "Slavers are capturing peasants and merchants on the highway and selling them to mindflayers.",
            "An evil druid has taken up residence in the sewers and is waging a guerilla war on civilization.",
            "The owner of a failing inn claims to have the entrance to a mysterious dungeon in his cellar hoping that the ruse will draw business from adventurers.",
            "Two rival gangs are actually devils and demons fighting a Blood War battle on the city streets.",
            "Grave robbers working for a necromancer are running out of graves and start looking for easy prey.",
            "A killer is released from prison and the father of one of his victims stages a similar murder in the hopes of framing him.",
            "The new judge is in fact a devil hoping to harvest souls for not guilty verdicts.",
            "A traveling “holy man” is selling relics that disappear in the morning.",
            "A logging camped is being haunted by the ghost of a treant/forest haunt and his dryad followers.",
            "A local orphanage is actually run by a demonic cultist that sacrifices the weak children and raises the strong ones to be followers",
            "The party sent to a battlefield to retrieve a family heirloom from a missing soldier where a necromancer and his corpse collector golem are raising the fallen as undead.",
            "The party arrives to new land in binds, ready to be delivered as slaves.",
            "The party is kidnapped by a great wyrm and tossed in the deepest layer of its dungeon.",
            "Your party unknowingly and inadvertently foils an assassination attempt. The would-be assassins now want revenge against you for foiling their plans.",
            "A prominent if eccentric shopkeeper suddenly needs to leave town for a week, and he wants your party to watch his shop while he's gone."
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_random_session_generator);

        TextView sessionText = (TextView) findViewById(R.id.sessionText);
        Button sessionButton = (Button) findViewById(R.id.sessionButton);
        sessionButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sessionPosition = new Random().nextInt(30);
                sessionText.setText(sessionList[sessionPosition]);
            }
        });

    }
}
