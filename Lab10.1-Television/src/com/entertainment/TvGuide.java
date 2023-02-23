package com.entertainment;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class TvGuide {
    public static void main(String[] args) throws Exception {

        try {
            Document doc = Jsoup.connect("https://www.channelmaster.com/pages/free-tv-guide-listings-chehalis-wa-98532").get();
            System.out.println(doc);
            Elements channelElements = doc.select(".title");
            for (Element channelElement : channelElements) {
                String channelName = channelElement.text();
                System.out.println(channelName);
            }
        } catch (Exception e) {
            System.out.println("An error occurred: " + e.getMessage());
        }


        /*Document doc = Jsoup.connect("https://www.tvguide.com/listings/").get();
        Elements channelElements = doc.select(".c-tvListingsProgram_title.g-text-bold");
        for (Element channelElement : channelElements) {
            String channelName = channelElement.text();//channelElement.select(".c-tvListingsProgram_title.g-text-bold").text();
            System.out.println(channelName);
            *//*Elements scheduleElements = channelElement.select(".l-program");
            for (Element scheduleElement : scheduleElements) {
                String showName = scheduleElement.select(".l-program__name").text();
                String showTime = scheduleElement.select(".l-program__time").text();
                System.out.println("\t" + showTime + " - " + showName);
            }*//*
        }*/
    }
}
