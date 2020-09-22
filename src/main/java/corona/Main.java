package corona;

import corona.parameter.ParameterClass;
import corona.data.ApiDataSource;

import com.beust.jcommander.JCommander;

import org.json.JSONObject;

/**
 * @author John Keneth P. Paluca
 * @version 1.0.0
 */
public class Main {

    private static final ParameterClass PARAMETER_OBJ = new ParameterClass();

    public static void main(String[] args) {
        Main main = new Main();
        JCommander.newBuilder().addObject(PARAMETER_OBJ).build().parse(args);
        if (PARAMETER_OBJ.isHelp())
            JCommander.newBuilder().addObject(PARAMETER_OBJ).build().usage();
        else
            main.run();
    }

    private void run() {
        ApiDataSource source = new ApiDataSource(PARAMETER_OBJ.getRequest());
        String apiUrl = source.apiGetRequest();
        JSONObject jsonObj = source.responce(apiUrl);
        source.printResult(jsonObj);
    }
}
