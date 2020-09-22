package corona.data;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.net.URL;
import javax.net.ssl.HttpsURLConnection;

import org.json.JSONObject;
import org.json.JSONException;

public abstract class AbstractJSONAlgorithm {

    public JSONObject responce(String apiUrl) {
        HttpsURLConnection conObj = null;
        try {
            URL urlObj = new URL(apiUrl);
            conObj = (HttpsURLConnection) urlObj.openConnection();
            conObj.setRequestMethod("GET");
            conObj.setRequestProperty("User-Agent", "Mozilla/5.0");
            conObj.connect();
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(conObj.getInputStream()));
            String jsonText = reader(bufferedReader);
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

    private String reader(BufferedReader bufferedReader) throws IOException {
        StringBuilder sb = new StringBuilder();
        String line;
        while ((line = bufferedReader.readLine()) != null) {
            sb.append(line);
        }
        bufferedReader.close();
        return sb.toString();
    }

}