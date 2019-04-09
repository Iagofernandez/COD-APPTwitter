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
import twitter4j.conf.ConfigurationBuilder;

/**
 *
 * @author ifernandezblanco
 */
public class TwitterAP {
        public static void main(String[] args) throws TwitterException {
        ConfigurationBuilder cb = new ConfigurationBuilder();
        cb.setDebugEnabled(true);
        TwitterFactory tf = new TwitterFactory(cb.build());
        Twitter twitter = tf.getInstance();
    
        /**
         * @author ifernandezblanco
        * importacion 
        *objeto clase twitter, para postear
        * el sigleton nos permite instanciar un solo twitter
        */
        Twitter twitter1 = TwitterFactory.getSingleton();
        /**creacion de la variable latestStatus
        *se inicia dandole un valor que escribira en Twitter
         */
            String latestStatus = "hola chicos";
  Status status = twitter.updateStatus(latestStatus);
  System.out.println("Se actualizo el estado [" + status.getText() + "].");
  
          /**Esto nos permite ver la linea de tiempo de todo tu Twitter
           * List Status que nos da linea de tiempo
           * 
           */
// Twitter twitter1 = TwitterFactory.getSingleton();
//    List<Status> statuses = twitter.getHomeTimeline();
//    System.out.println("Linea de tiempo");
//    for (Status statu : statuses) {
//        System.out.println(statu.getUser().getName() + ":" +
//                           statu.getText());
//    }
//    
//    Twitter twitter2 = TwitterFactory.getSingleton();
//    Query query = new Query("source:twitter4j yusukey");
//    QueryResult result = twitter.search(query);
//    for (Status statu : result.getTweets()) {
//        System.out.println("@" + statu.getUser().getScreenName() + ":" + statu.getText());
//    }
//    
//     
//        }
    }
}

        
    
    

