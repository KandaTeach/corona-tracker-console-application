package corona;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;

import org.apache.commons.lang3.StringUtils;

import org.json.JSONObject;
import org.json.JSONException;

public class ResultClass {

    private static final String[] LABEL_KEYS = { "Cases", "Deaths", "Recovered", "Today Cases", "Today Deaths" },
            JSON_KEYS = { "cases", "deaths", "recovered", "todayCases", "todayDeaths" };

    private static JSONObject getJSON(String url) {
        HttpURLConnection conObj = null;
        try {
            URL urlObj = new URL(url);
            conObj = (HttpURLConnection) urlObj.openConnection();
            conObj.setRequestMethod("GET");
            conObj.setRequestProperty("User-Agent", "Mozilla/5.0");
            conObj.connect();
            BufferedReader reader = new BufferedReader(new InputStreamReader(conObj.getInputStream()));
            String jsonText = readJSON(reader);
            JSONObject jsonObj = new JSONObject(jsonText);
            return jsonObj;
        } catch (IOException | JSONException ex) {
            throw new IllegalArgumentException("JSON File not Found.");
        } finally {
            if (conObj != null) {
                conObj.disconnect();
            }
        }
    }

    private static String readJSON(BufferedReader reader) throws IOException {
        StringBuilder sb = new StringBuilder();
        String line;
        while ((line = reader.readLine()) != null) {
            sb.append(line);
        }
        reader.close();
        return sb.toString();
    }

    private static final String FORMAT = "|%1$-26s|%2$,-27d|%n";

    protected static void printResult() {
        JSONObject json = getJSON("https://disease.sh/v2/all".replaceAll("-", "%20"));
        System.out.print("========================================================\n|"
                .concat(StringUtils.center("WORLD TOTAL CASES", 54))
                .concat("|\n========================================================\n"));
        for (byte i = 0; i < 5; i++) {
            System.out.printf(FORMAT, LABEL_KEYS[i], json.get(JSON_KEYS[i]));
        }
        System.out.print("========================================================\n\n");
    }

    protected static void printResult(String continentName) {
        JSONObject json = getJSON("https://disease.sh/v2/continents/".concat(continentName).replaceAll("-", "%20"));
        System.out
                .print("========================================================\n|"
                        .concat(StringUtils
                                .center(StringUtils.upperCase(json.getString("continent")).concat(" TOTAL CASES"), 54))
                        .concat("|\n========================================================\n"));
        for (byte i = 0; i < 5; i++) {
            System.out.printf(FORMAT, LABEL_KEYS[i], json.get(JSON_KEYS[i]));
        }
        System.out.print("========================================================\n\n");
    }

    protected static void printResult(String country, String countryName) {
        JSONObject json = getJSON("https://disease.sh/v2/".concat(country + "/" + countryName).replaceAll("-", "%20"));
        System.out.print("========================================================\n|"
                .concat(StringUtils.center(StringUtils.upperCase(json.getString("country")).concat(" TOTAL CASES"), 54))
                .concat("|\n========================================================\n"));
        for (byte i = 0; i < 5; i++) {
            System.out.printf(FORMAT, LABEL_KEYS[i], json.get(JSON_KEYS[i]));
        }
        System.out.print("========================================================\n\n");
    }
}
