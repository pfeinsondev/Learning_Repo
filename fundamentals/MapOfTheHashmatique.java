import java.util.HashMap;
import java.util.Set;

public class MapOfTheHashmatique {
    public static void main(String[] args) {
        HashMap<String, String> trackList = new HashMap<String, String>();
        trackList.put("party_and_bullshit", String.format(
            "\nwas a terror since the public school era\n" +
            "Bathroom passes, cutting classes, squeezing asses\n" +
            "Smoking blunts was a daily routine\n" +
            "Since thirteen, a chubby nigga on the scene\n" +
            "I used to have the tre' duce\n" +
            "And the duce duce in my bubble-goose\n" +
            "Now I got the mack in my knapsack\n" +
            "Loungin' black, smoking sacks up in acts\n" +
            "And sidekicks with my sidekicks rocking fly kicks\n" +
            "Honeys want to chat\n" +
            "But all we want to know is \"where the party at?\"\n" +
            "And can I bring my gat?\n" + 
            "If not, I hope I don't get shot\n" +
            "Betta throw my vest on my chest\n" +
            "Cause niggas is a mess\n" +
            "It don't take nothin' but frontin'\n" +
            "For me to start somethin'\n" +
            "Buggin' and barkin' at niggas like I was duck huntin'\n" +
            "Dumbing out, just me and my crew\n" +
            "Cause all we want to do is\n"));
            
        trackList.put("many_men", String.format(
            "\nMany men, wish death upon me\n" +
            "Blood in my eye dog and I can't see\n" +
            "I'm trying to be what I'm destined to be\n" +
            "And niggas trying to take my life away\n" +
            "I put a hole in nigga for fucking with me\n" +
            "My back on the wall, now you gon' see\n" +
            "Better watch how you talk, when you talk about me\n" +
            "'Cause I'll come and take your life away\n"));
        
        trackList.put("still_dre", String.format(
            "\nI'm representing for them gangstas all across the world\n" +
            "Still hitting them corners in them lo-lo's, girl\n" +
            "Still taking my time to perfect the beat\n" +
            "And I still got love for the streets, it's the D-R-E"));   
        Set<String> keys = trackList.keySet();
        for (String key : keys) {
            System.out.printf("%20s:%80s%n", key, trackList.get(key));
        }
    }
}
