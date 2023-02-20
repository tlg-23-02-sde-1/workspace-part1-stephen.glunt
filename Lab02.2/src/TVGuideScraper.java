import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

public class TVGuideScraper {
    public static void main(String[] args) throws Exception {
        // Make an HTTP request to TVGuide.com
        Document doc = Jsoup.connect("https://www.tvguide.com/listings").get();

        // Use Jsoup to extract the information on the current program playing on channel 3
        /*Elements elements = doc.select("#listingsContainer > div:nth-child(3) > div > div.listings-info > h3 > a");
        if (!elements.isEmpty()) {
            System.out.println("The current program playing on channel 3 is: " + elements.first().text());
        } else {
            System.out.println("No information found on the current program playing on channel 3.");
        }*/

        Elements elements = doc.select("#c-pageTvListingsGrid_container > div:nth-child(3) > div > div.listings-info");
        if (!elements.isEmpty()) {
            System.out.println("The elements in div.listings-info are: ");
            for (int i = 0; i < elements.size(); i++) {
                System.out.println(elements.get(i));
            }
        } else {
            System.out.println("No elements found in div.listings-info.");
        }

    }
}
