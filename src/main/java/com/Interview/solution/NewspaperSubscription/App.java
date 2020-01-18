package com.Interview.solution.NewspaperSubscription;

import java.util.ArrayList;
import java.util.List;

import com.Interview.solution.Subscription.Subscriptionrate;


/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	// Provide the list of newspaper name
    	// Update the price in DailyPrice.json file
    	Subscriptionrate rate = new Subscriptionrate();
    	List<String> papers = new ArrayList<String>();
    	papers.add("BM");
    	papers.add("HT");
    	papers.add("RK");
     	System.out.println(rate.finalSubscriptionChargeForAllPapers(papers));
    }
}
