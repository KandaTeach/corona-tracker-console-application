package corona;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.MalformedURLException;
import java.util.List;
import java.util.ArrayList;

import org.json.JSONObject;
import org.json.JSONException;

/**
 * Class description
 * The purpose of this class is that it provides the results.
 * @author John Keneth P. Paluca
 */
public class ResultClass {

    /**
     * In this getJSON method it returns the JSON object after reading it.
     * @param url API url address.
     * @return responce.
     */
    private static String getJSON(String url) {
        //url.replaceAll(" ", "%20");
        URL urlObj;
        HttpURLConnection conObj = null;
        BufferedReader reader;
        StringBuilder response;
        try {
            // open connection
            urlObj = new URL(url);
            conObj = (HttpURLConnection) urlObj.openConnection();

            // get request
            conObj.setRequestMethod("GET");

            // add request header
            conObj.setRequestProperty("User-Agent", "Mozilla/5.0");

            // connect
            conObj.connect();

            // read json file
            reader = new BufferedReader(new InputStreamReader(conObj.getInputStream()));
            response = new StringBuilder();
            String line;
            while ((line = reader.readLine()) != null) {
                response.append(line);
            }
            reader.close();
            return response.toString();

        // catch exceptions
        } catch (MalformedURLException ex) {
            System.out.print("Unaccepted URL");
        } catch (IOException ex) {
            System.out.print("File not Found\n");
        } finally {
            // disconnect
            if (conObj != null) {
                try {
                    conObj.disconnect();
                } catch (Exception ex) {
                    System.out.print("Problem in disconnecting server\n");
                }
            }
        }
        return null;
    }

    // initialize List 
    private static List<Object> result;

    /**
     * In this storeResult method it stores the JSON object to ArrayList.
     * @param json path of the API url.
     * @param query query path of the API url.
     * @return null.
     */
    protected static String storeResult(String json, String query)  {
        String jsonURL;
        final String[] LABEL_KEYS = {"cases","deaths","recovered","todayCases","todayDeaths","continent","country"};
        JSONObject jsonObj;
        try {
            // get API url
            jsonURL = getJSON("https://corona.lmao.ninja/v2/".concat(json + "/" + query.replaceAll("-","%20")));
            // create JSONObject
            jsonObj = new JSONObject(jsonURL);
            // create a new ArrayList
            result = new ArrayList<Object>();
            // add data to ArrayList
            for(byte i = 0; i < 7; i++) {
                result.add(jsonObj.get(LABEL_KEYS[i]));
            }
        // catch exceptions
        } catch (JSONException ex) {
            result.add(null);
        }
        return null;
    }

    /**
     * In this getResult method is getting the value from the ArrayList.
     * @param index ArrayList index.
     * @return value of the index.
     */
    protected static String getResult(int index) {
        return result.get(index).toString();
    }
}