package net.cox.augies.school.apcsa.fall.five.twitter;

import java.time.LocalDateTime;
import java.util.Scanner;
import java.util.ArrayList;

public class Database {
    static ArrayList <Tweet> twitterDatabase = new ArrayList<Tweet>();
    static Scanner s = new Scanner(System.in);
    static int logins = 0;
    public static void main (String [] args) {
        //loop and populate the twitterDatabase array with 1000
        System.out.println("Welcome to the database");
        int choice = 1;
        while(choice!=8)
        {
            System.out.println("1) Add a Tweet");  //use .add()
            System.out.println("2) Remove Tweet by Index"); // use .remove()
            System.out.println("3) Moderate Tweet by Index"); //use .set();
            System.out.println("4) Print Tweet by Index"); //use .get()
            System.out.println("5) Print All Tweets");
            System.out.println("6) Get Earliest");//use .get()
            System.out.println("7) Get Latest");//use .get()
            System.out.println("8) EXIT");
            choice = Integer.parseInt(s.nextLine());
            switch(choice){
                case 1:
                    addTweet();
                    break;
                case 2:
                    System.out.println("Please enter the tweet index to be removed.");
                    System.out.println("Removed: " + twitterDatabase.remove(Integer.parseInt(s.nextLine())));
                    break;
                case 3:
                    System.out.println("Please enter the tweet index to be moderated");
                    int case3Index = Integer.parseInt(s.nextLine());
                    System.out.println("Please enter the new version of the tweet");
                    twitterDatabase.set(case3Index, new Tweet(logins+"", s.nextLine()));
                    break;
                case 4:
                    System.out.println("Please enter the tweet index to be printed");
                    System.out.println(twitterDatabase.get(Integer.parseInt(s.nextLine())).toString());
                    break;
                case 5:
                    for(Tweet i : twitterDatabase){
                        System.out.println(i);
                    }
                    break;
                case 6:
                    System.out.println(earliestTweet());
                    break;
                case 7:
                    System.out.println(latestTweet());
                    break;
                default:
                    break;
            }
        }
    }

    static public void addTweet() {
        System.out.println("Type message: ");
        String tw = s.nextLine();
        twitterDatabase.add(new Tweet(logins+"", tw));
        logins++;
    }

    public static void addTweet(Tweet tweet){
        twitterDatabase.add(tweet);
    }

    public static int getNumberOfTweets(){
        return twitterDatabase.size();
    }

    public static Tweet latestTweet(){
        Tweet latest = null;
        for(Tweet i : twitterDatabase){
            if(latest==null){
                latest = i;
            }else{
                latest = latest.getDate().before(i.getDate()) ? i : latest;
            }
        }
        return latest;
    }
    
    public static Tweet earliestTweet(){
        Tweet earliest = null;
        for(Tweet i : twitterDatabase){
            if(earliest==null){
                earliest = i;
            }else{
                earliest = earliest.getDate().after(i.getDate()) ? i : earliest;
            }
        }
        return earliest;
    }

    public static void removeTweet(Tweet tweet){
        twitterDatabase.remove(tweet);
    }
}