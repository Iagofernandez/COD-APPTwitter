/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package twitterjavagt;

import twitter4j.Twitter;
import twitter4j.TwitterFactory;

/**
 *
 * @author ifernandezblanco
 */
public class TwitterJavaGT {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // importacion 
        //objeto clase twitter, para postear
        // el sigleton nos permite instanciar un solo twitter
        Twitter twitter = TwitterFactory.getSingleton();
        
        
    }
    
}
