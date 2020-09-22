package corona.data;

import java.util.List;
import java.util.stream.Collectors;

import org.apache.commons.lang3.StringUtils;

import org.json.JSONException;
import org.json.JSONObject;

public class ApiDataSource extends AbstractJSONAlgorithm {

    private static final String[] LABEL_KEYS = { "Cases", "Deaths", "Recovered", "Today Cases", "Today Deaths", "Active Cases", "Critical Condition", "Tested", "Population" },JSON_KEYS = { "cases", "deaths", "recovered", "todayCases", "todayDeaths", "active", "critical", "tests", "population" };

    private String apiUrl = "https://disease.sh/";

    private String apiVersion = "v3/covid-19/";

    private String getRequestLink;

    private volatile String request;

    private volatile String country, continent, state, header;

    public ApiDataSource(List<String> listOfRequest) {
        request = listOfRequest.stream().map(Object::toString).collect(Collectors.joining("/"));
    }

    public String apiGetRequest() {
        getRequestLink = apiUrl.concat(apiVersion).concat(request);
        return getRequestLink;
    }

    public void printResult(JSONObject jsonObj) {
        try {
            country = jsonObj.getString("country");
        } catch (JSONException jsonException) {
            try {
                continent = jsonObj.getString("continent");
            } catch (Exception exception) {
                country = null;
                continent = null;
                state = jsonObj.getString("state");
            }
        } finally {
            header = country == null && continent == null && state == null? "world" : country != null ? country : continent != null ? continent : state;
        }

        System.out.print("========================================================\n|"
                .concat(StringUtils.rightPad("Updated Number: " + jsonObj.get("updated"), 54)).concat("|\n"));

        System.out.print("========================================================\n|"
                .concat(StringUtils.center(StringUtils.upperCase(header), 54))
                .concat("|\n========================================================\n"));
        for (byte i = 0; i < 9; i++) {
            try {
                System.out.printf("|%1$-26s|%2$,-27d|%n", LABEL_KEYS[i], jsonObj.get(JSON_KEYS[i]));
            } catch(JSONException jsonException) {
                continue;
            }
        }
        System.out.print("========================================================\n");
        System.out.print("Data Source : Worldometers\n\n");
    }

    @Override
    public String toString() {
        return  "API Source : "+ apiUrl + "/n" +  "Version" + "/n" + apiVersion;
    }
}