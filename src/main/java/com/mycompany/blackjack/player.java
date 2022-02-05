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
public class player 
{
 // vector for hand
    public Vector<Card> hand = new Vector<Card>();
    // display hand
    public void displayHand()
    {
        int size = hand.size();
        System.out.println("User Hand: ");
        switch(size)
        {
        case 2:
            
            System.out.println("|" + hand.elementAt(0).suit+ "---" + hand.elementAt(0).name+ "|" + " " + "|" + hand.elementAt(1).suit+ "---" + hand.elementAt(1).name+ "|");
            for(int i = 0; i < 3;i++)
            {
                System.out.println("|" + "-----" + "|" + " " + "|" + "-----" + "|");
            }
            System.out.println("|" + hand.elementAt(0).name+ "---" + hand.elementAt(0).suit+ "|" + " " + "|" + hand.elementAt(1).name+ "---" + hand.elementAt(1).suit+ "|");
            break;
        case 3: 
            System.out.println("|" + hand.elementAt(0).suit+ "---" + hand.elementAt(0).name+ "|" + " " + "|" + hand.elementAt(1).suit+ "---" + hand.elementAt(1).name+ "|" + " "+ "|" + hand.elementAt(2).suit+ "---" + hand.elementAt(2).name+ "|");
            for(int i = 0; i < 3;i++)
            {
                System.out.println("|" + "-----" + "|" + " " + "|" + "-----" + "|" + " " + "|" + "-----" + "|");
            }
            System.out.println("|" + hand.elementAt(0).name+ "---" + hand.elementAt(0).suit+ "|" + " " + "|" + hand.elementAt(1).name+ "---" + hand.elementAt(1).suit+ "|" + " " + "|" + hand.elementAt(2).name+ "---" + hand.elementAt(2).suit+ "|");
            break;
        case 4:
            System.out.println("|" + hand.elementAt(0).suit+ "---" + hand.elementAt(0).name+ "|" + " " + "|" + hand.elementAt(1).suit+ "---" + hand.elementAt(1).name+ "|" + " "+ "|" + hand.elementAt(2).suit+ "---" + hand.elementAt(2).name+ "|" + " "+ "|" + hand.elementAt(3).suit+ "---" + hand.elementAt(3).name+ "|");
            for(int i = 0; i < 3;i++)
            {
                System.out.println("|" + "-----" + "|" + " " + "|" + "-----" + "|" + " " + "|" + "-----" + "|" + " " + "|" + "-----" + "|");
            }
            System.out.println("|" + hand.elementAt(0).name+ "---" + hand.elementAt(0).suit+ "|" + " " + "|" + hand.elementAt(1).name+ "---" + hand.elementAt(1).suit+ "|" + " " + "|" + hand.elementAt(2).name+ "---" + hand.elementAt(2).suit+ "|" + " " + "|" + hand.elementAt(3).name+ "---" + hand.elementAt(3).suit+ "|");
            break;
        case 5:
            System.out.println("|" + hand.elementAt(0).suit+ "---" + hand.elementAt(0).name+ "|" + " " + "|" + hand.elementAt(1).suit+ "---" + hand.elementAt(1).name+ "|" + " "+ "|" + hand.elementAt(2).suit+ "---" + hand.elementAt(2).name+ "|" + " "+ "|" + hand.elementAt(3).suit+ "---" + hand.elementAt(3).name+ "|" + " " + "|" + hand.elementAt(4).suit+ "---" + hand.elementAt(4).name+ "|");
            for(int i = 0; i < 3;i++)
            {
                System.out.println("|" + "-----" + "|" + " " + "|" + "-----" + "|" + " " + "|" + "-----" + "|" + " " + "|" + "-----" + "|" + " " + "|" + "-----" + "|");
            }
            System.out.println("|" + hand.elementAt(0).name+ "---" + hand.elementAt(0).suit+ "|" + " " + "|" + hand.elementAt(1).name+ "---" + hand.elementAt(1).suit+ "|" + " " + "|" + hand.elementAt(2).name+ "---" + hand.elementAt(2).suit+ "|" + " " + "|" + hand.elementAt(3).name+ "---" + hand.elementAt(3).suit+ "|" + " " + "|" + hand.elementAt(3).name+ "---" + hand.elementAt(3).suit+ "|") ;
            break;
        }
    }
    //dealers hand
      public void displayDealerHand()
    {
        int size = hand.size();
        System.out.println("Dealer Hand: ");
       switch(size)
        {
        case 2:
            
            System.out.println("|-----|" + " " + "|" + hand.elementAt(1).suit+ "---" + hand.elementAt(1).name+ "|");
            for(int i = 0; i < 3;i++)
            {
                System.out.println("|" + "-----" + "|" + " " + "|" + "-----" + "|");
            }
            System.out.println("|-----|" + " " + "|" + hand.elementAt(1).name+ "---" + hand.elementAt(1).suit+ "|");
            break;
        case 3: 
            System.out.println("|-----|" + " " + "|" + hand.elementAt(1).suit+ "---" + hand.elementAt(1).name+ "|" + " "+ "|" + hand.elementAt(2).suit+ "---" + hand.elementAt(2).name+ "|");
            for(int i = 0; i < 3;i++)
            {
                System.out.println("|" + "-----" + "|" + " " + "|" + "-----" + "|" + " " + "|" + "-----" + "|");
            }
            System.out.println("|-----|" +  " " + "|" + hand.elementAt(1).name+ "---" + hand.elementAt(1).suit+ "|" + " " + "|" + hand.elementAt(2).name+ "---" + hand.elementAt(2).suit+ "|");
            break;
        case 4:
            System.out.println("|-----|" +  " " + "|" + hand.elementAt(1).suit+ "---" + hand.elementAt(1).name+ "|" + " "+ "|" + hand.elementAt(2).suit+ "---" + hand.elementAt(2).name+ "|" + " "+ "|" + hand.elementAt(3).suit+ "---" + hand.elementAt(3).name+ "|");
            for(int i = 0; i < 3;i++)
            {
                System.out.println("|" + "-----" + "|" + " " + "|" + "-----" + "|" + " " + "|" + "-----" + "|" + " " + "|" + "-----" + "|");
            }
            System.out.println("|-----|" + " " + "|" + hand.elementAt(1).name+ "---" + hand.elementAt(1).suit+ "|" + " " + "|" + hand.elementAt(2).name+ "---" + hand.elementAt(2).suit+ "|" + " " + "|" + hand.elementAt(3).name+ "---" + hand.elementAt(3).suit+ "|");
            break;
        case 5:
            System.out.println("|-----|" + " " + "|" + hand.elementAt(1).suit+ "---" + hand.elementAt(1).name+ "|" + " "+ "|" + hand.elementAt(2).suit+ "---" + hand.elementAt(2).name+ "|" + " "+ "|" + hand.elementAt(3).suit+ "---" + hand.elementAt(3).name+ "|" + " " + "|" + hand.elementAt(4).suit+ "---" + hand.elementAt(4).name+ "|");
            for(int i = 0; i < 3;i++)
            {
                System.out.println("|" + "-----" + "|" + " " + "|" + "-----" + "|" + " " + "|" + "-----" + "|" + " " + "|" + "-----" + "|" + " " + "|" + "-----" + "|");
            }
            System.out.println("|-----|" + " " + "|" + hand.elementAt(1).name+ "---" + hand.elementAt(1).suit+ "|" + " " + "|" + hand.elementAt(2).name+ "---" + hand.elementAt(2).suit+ "|" + " " + "|" + hand.elementAt(3).name+ "---" + hand.elementAt(3).suit+ "|" + " " + "|" + hand.elementAt(3).name+ "---" + hand.elementAt(3).suit+ "|") ;
            break;
        }
        
    }
     //change ace value for bust
      public void ace()
      {
          int size = hand.size();
          for(int i = 0; i < size; i++)
          {
              if(hand.elementAt(i).value == 11)
              {
                  hand.elementAt(i).value = 1;
              }
          }
      }
    //recursive function to count hand
       public int sum()
    {
        int num=0;
        for(int i = 0; i < hand.size(); i++)
        {
            num+= hand.elementAt(i).value;
        }
        return num;
    }
}
