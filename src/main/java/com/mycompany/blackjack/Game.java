/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.blackjack;

/**
 *
 * @author steph
 */
import java.util.*;


public class Game 
{
    //main function has game play
    public static void main(String[] args)
    {
         Vector <Card> deck = new Vector<Card>();
         int selection = 0;
         Random rand = new Random();
         Scanner in = new Scanner(System.in);
         int playerScore = 0, dealerScore = 0, playerTotal = 0, dealerTotal =0;
         player user = new player();
         player dealer =  new player();
         int drawnCard = 0;
         //begin do while loop
         do
         {
                selection =0;
                boolean playerBust = false;
                boolean dealerBust = false;
            deck = createDeck();  //initialize deck
            for(int i = 0; i < deck.size();i++)
            {
               // System.out.print(deck.elementAt(i).);
            }
            //draw and erase 2 cards for dealer and player
            for(int j = 0; j < 2; j++)
            {
                
                drawnCard = rand.nextInt(deck.size());
                user.hand.add(deck.elementAt(drawnCard));   //at element at index to users hand
                deck.remove(drawnCard);   //remove card from deck
                
                drawnCard = rand.nextInt(deck.size());
                dealer.hand.add(deck.elementAt(drawnCard));
                deck.remove(drawnCard);
            }
                dealer.displayDealerHand();
                user.displayHand();
            while(true)
            {    
                //display cards
                
                //21 winner break
                if(user.sum()==21)
                {
                    System.out.println("Player wins!!");
                    playerScore++;
                    break;
                }
                if(dealer.sum() == 21)
                {
                    System.out.println("Dealer Wins!!");
                    dealerScore++;
                    break;
                }
                //display menu
                selection = menu();
                dealerTotal = dealer.sum();
               
                if(selection == 1)
                {
                   
                    //player hit // sum player //break if bust
                    drawnCard = rand.nextInt(deck.size());
                    user.hand.add(deck.elementAt(drawnCard));   //at element at index to users hand
                    deck.remove(drawnCard);   //remove card from deck
                     dealer.displayDealerHand();
                    user.displayHand();
                   
                    playerTotal = user.sum();
                    if(playerTotal > 21)
                    {
                        user.ace();
                        if(playerTotal > 21)
                        {    
                        playerBust = true;
                        dealerScore++;
                        break;
                        }
                    }
                    else if(playerTotal == 21)
                    {
                        System.out.println("Player wins!!");
                        playerScore++;
                        break;
                    }
                }
                else if(selection == 2)
                {
                    if(dealerTotal >= 17 && dealerTotal < 21)
                    {
                        System.out.println("Dealer total: " + dealer.sum());
                        System.out.println("Player total: " + user.sum());
                        if(dealer.sum() > user.sum())
                        {
                            System.out.println("Dealer Wins.");
                            dealerScore++;
                        }
                        else if(dealer.sum() < user.sum())
                        {
                            System.out.println("Player wins.");
                            playerScore++;
                        }
                        else
                        {
                            System.out.println("Tie game.");
                        }
                        break;
                    }
                    else if(dealerTotal > 21)
                    {
                        dealer.ace();
                        if(dealerTotal > 21)
                        {
                            dealerBust = true;
                            playerScore++;
                            break;
                        }
                    }
                    else
                    {
                        drawnCard = rand.nextInt(deck.size());
                        dealer.hand.add(deck.elementAt(drawnCard));
                        deck.remove(drawnCard);
                        dealer.displayDealerHand();
                        user.displayHand();
                        if(dealer.sum()==21)
                        {
                            System.out.println("Dealer wins!");
                            dealerScore++;
                            break;
                        }
                        else if(dealer.sum()>21)
                        {
                            dealer.ace();
                            if(dealer.sum()>21)
                            {
                                dealerBust = true;
                                playerScore++;
                                break;
                            }
                        }
                    }
                }
               
                      //display player
                      //if dealer < 17
                      //dealer hit display dealer //sum dealer //break if bust
            }      //end while loop
            if(dealerBust)
            {
                System.out.println("Dealer Bust!!");
            }
            if(playerBust)
            {
                System.out.println("Player Bust!!");
            }
             System.out.println("Score:\n" + playerScore + " to " + dealerScore);
             System.out.println("1. Play Again\n2. Quit");
             String str_input = in.nextLine();
             selection = IntegerInputValidation(str_input);
             user.hand.clear();
             dealer.hand.clear();
         }while(selection == 1);
         //end do-while
         
         
     
         
    }
   
    public static Vector<Card> createDeck()
    {
        Vector<Card> d = new Vector<Card>();
        
        String name[] =  new String[] {"2", "3", "4", "5", "6", "7", "8", "9", "X", "J", "Q", "K", "A"};
        int value[] = new int[] {2,3,4,5,6,7,8,9,10,10,10,10,11};
        String suit[] = new String[] {"C", "S", "D", "H"};
        
       for(int i = 0; i < 4; i++)
       {
           for(int k = 0; k < 13; k++)
           {
               Card current = new Card();
               current.name = name[k];
               current.value = value[k];
               current.suit = suit[i];
               d.add(current);
           }
       }
        return d;
    }
    //draw funnction with erase vector index
    
    
 
    //input validation function
     static int IntegerInputValidation(String str_input)
    {
        int intNum;
        Scanner in = new Scanner(System.in);
        while(true)
        {
            try
            {
                intNum = Integer.parseInt(str_input);  // convert to int
                break;  // breaks loop if conversion is succesful
            }
            catch(NumberFormatException e)
            {
                // error message
               System.out.println("Invalid Entry.");
            }
            
            str_input = in.nextLine();
            
        }
        
        return intNum;
    }
    //check for ace
    
    //menu function
    public static int menu()
    {
        Scanner in = new Scanner(System.in);
        System.out.println("1. Hit");
        System.out.println("2. Stay");
        String s = in.nextLine();
        int ans = IntegerInputValidation(s);
        
        return ans;
    }
}
