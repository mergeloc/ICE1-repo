/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.sheridancollege.week3.softwarefundamentals.ice1;
import java.util.Scanner;
import java.util.Random;

/**
 * A class that fills a magic hand of 7 cards with random Card Objects
 * and then asks the user to pick a card and searches the array of cards
 * for the match to the user's card. To be used as starting code in ICE 1
 * @author dancye
 * @modifier Chris Mergelos
 * @studentNumber 991823764
 */
public class CardTrick {
    
    public static void main(String[] args)
    {
        Card[] magicHand = new Card[7];
        Random rand=new Random();
        Card lucky=new Card();
        lucky.setValue(3);
        lucky.setSuit("Spades");
        boolean win=false;
        
        for (int i=0; i<magicHand.length; i++){
            Card c = new Card();
            //c.setValue(insert call to random number generator here)
            c.setValue(rand.nextInt(13)+1);
            //c.setSuit(Card.SUITS[insert call to random number between 0-3 here])
            c.setSuit(Card.SUITS[rand.nextInt(4)]);
            magicHand[i]=c;
        }
        
        //insert code to ask the user for Card value and suit, create their card
        
        // and search magicHand here
        for (int i=0; i<=6;i++){
            if ((magicHand[i].getValue()==lucky.getValue())&&magicHand[i].getSuit().equals(lucky.getSuit())){
                win=true;
            }
        }
        //Then report the result here
        if(win){
            System.out.println("You win!  The lucky card "+lucky.getValue()+" of "+lucky.getSuit()+" was in your hand!");
        }else{
                    System.out.println("You lose.  The lucky card, "+lucky.getValue()+" of "+lucky.getSuit()+" was not in your hand");
                    }
        }
    }
    
