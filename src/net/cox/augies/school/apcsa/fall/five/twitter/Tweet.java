package net.cox.augies.school.apcsa.fall.five.twitter;
import java.text.SimpleDateFormat;
import java.util.Date;
/**
 * This represents an individual tweet by a user
 * */
public class Tweet {
    //Attributes - Nouns or Variable that define the class
    private String userID = "";  //User name
    private String date ="";  //Date as definied by Ringenberg
    private String tweetContents = ""; // The actual characters of the tweet

    private Date d = new Date();
    private static SimpleDateFormat t = new SimpleDateFormat ("yyyy-MM-dd/HH:mm:ss");

    Tweet(String userID, String dateTime, String tweet){
        this.userID = userID;
        this.date = dateTime;
        this.tweetContents = limitTweetLength(tweet);
    }

    //Constructor runs when new object is created
    Tweet(String id, String tc) {
        userID = id;
        date = getTimeStamp();
        tweetContents = tc;
        tweetLimiter(); //Call in constructor
    }

    //Behaviors = Methods in Java
    //Getters - Because my fields are private
    public String getUserId() {
        return userID;
    }

    public String getTimeStamp() {
        return t.format (d);
    }

    public String getTweet() {
        return tweetContents;
    }

    /**
     * Limits the tweet to 280 characters
     * In house control, called by constructor
     */
    private void tweetLimiter() {
        if(tweetContents.length()>280) {
            tweetContents = tweetContents.substring(0, 280);
        }
    }

    /**
     * Concatenates the Attributes of the class into
     * one string
     */
    public String toString() {
        return this.userID + "\t" + this.date + "\t" + this.tweetContents;
    }

    public String getUserID(){
        return this.userID;
    }

    public Date getDate(){
        return d;
    }

    public static SimpleDateFormat getT(){
        return t;
    }

    public static String limitTweetLength(String tweet){
        if(tweet.length()>280){
            return tweet.substring(0,280);
        }
        return tweet;
    }
}