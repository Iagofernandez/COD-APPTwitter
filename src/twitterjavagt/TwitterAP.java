/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package twitterjavagt;

import java.util.List;
import twitter4j.Query;
import twitter4j.QueryResult;
import twitter4j.Status;
import twitter4j.Twitter;
import twitter4j.TwitterException;
import twitter4j.TwitterFactory;

/**
 *
 * @author ifernandezblanco
 */
public class TwitterAP {
        public static void main(String[] args) throws TwitterException {

    
         // importacion 
        //objeto clase twitter, para postear
        // el sigleton nos permite instanciar un solo twitter
        Twitter twitter = TwitterFactory.getSingleton();
        //creacion de la variable latestStatus
        //se inicia en null
            String latestStatus = "hola";
  Status status = twitter.updateStatus(latestStatus);
  System.out.println("Se actualizo el estado [" + status.getText() + "].");
  
        
 Twitter twitter1 = TwitterFactory.getSingleton();
    List<Status> statuses = twitter.getHomeTimeline();
    System.out.println("Showing home timeline.");
    for (Status statu : statuses) {
        System.out.println(statu.getUser().getName() + ":" +
                           statu.getText());
    }
    
    Twitter twitter2 = TwitterFactory.getSingleton();
    Query query = new Query("source:twitter4j yusukey");
    QueryResult result = twitter.search(query);
    for (Status statu : result.getTweets()) {
        System.out.println("@" + statu.getUser().getScreenName() + ":" + statu.getText());
    }
        }
    
}
        
    
    

