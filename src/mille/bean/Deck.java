package mille.bean;

import java.util.ArrayList;
import java.util.Collections;
import mille.bean.CardTypes.*;

public class Deck
{
    private ArrayList<Card> cards;
    
    public Deck()
    {
        cards = new ArrayList<>();
        
        // TODO: change this
        CardImage defaultImage = new CardImage();
        
        // constructs the deck by filling in all the card types
        for (int i = 0; i < 3; i++) {
            cards.add(new AccidentCard(defaultImage));
        }
        
        for (int i = 0; i < 3; i++) {
            cards.add(new OutOfGasCard(defaultImage));
        }
        
        for (int i = 0; i < 3; i++) {
            cards.add(new FlatTireCard(defaultImage));
        }
        
        for (int i = 0; i < 4; i++) {
            cards.add(new SpeedLimitCard(defaultImage));
        }
        
        for (int i = 0; i < 5; i++) {
            cards.add(new StopCard(defaultImage));
        }
        
        for (int i = 0; i < 6; i++) {
            cards.add(new RepairsCard(defaultImage));
        }
        
        for (int i = 0; i < 6; i++) {
            cards.add(new GasolineCard(defaultImage));
        }
        
        for (int i = 0; i < 6; i++) {
            cards.add(new SpareTireCard(defaultImage));
        }
        
        for (int i = 0; i < 6; i++) {
            cards.add(new EndOfLimitCard(defaultImage));
        }
        
        for (int i = 0; i < 14; i++) {
            cards.add(new RollCard(defaultImage));
        }
        
        cards.add(new DrivingAceCard(defaultImage));
        cards.add(new ExtraTankCard(defaultImage));
        cards.add(new PunctureProofCard(defaultImage));
        cards.add(new RightOfWayCard(defaultImage));
        
        for (int i = 0; i < 10; i++)
        {
            cards.add(new Distance25Card(defaultImage));
        }
        
        for (int i = 0; i < 10; i++)
        {
            cards.add(new Distance50Card(defaultImage));
        }
        
        for (int i = 0; i < 10; i++)
        {
            cards.add(new Distance75Card(defaultImage));
        }
        
        for (int i = 0; i < 12; i++)
        {
            cards.add(new Distance100Card(defaultImage));
        }
        
        for (int i = 0; i < 4; i++)
        {
            cards.add(new Distance200Card(defaultImage));
        }
    }
    
    public void shuffle()
    {
        // rearranges all the cards in the Deck
        Collections.shuffle(cards);
    }
    
    public Card getTopCard()
    {
        // returns the card at the top of the Deck
        return cards.get(cards.size() - 1);
    }
    
    public Card takeTopCard()
    {
        // returns the top card and removes it from the Deck
        Card topCard = getTopCard();
        cards.remove(cards.size() - 1);
        return topCard;
    }
}
