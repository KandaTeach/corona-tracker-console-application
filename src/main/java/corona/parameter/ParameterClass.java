package corona.parameter;

import java.util.List;

import com.beust.jcommander.Parameter;

public class ParameterClass {

    @Parameter(names = "--help", description = "View all parameters", help = true)
    private boolean help;

    @Parameter(names = "--request", description = "--request [path-query] What data do you want to request for", arity = 1, splitter = ParameterDashSplitter.class)
    private List<String> request;

    public List<String> getRequest() {
        return request;
    }

    public boolean isHelp() {
        return help;
    }

}
