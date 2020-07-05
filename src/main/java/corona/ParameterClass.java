package corona;

import com.beust.jcommander.Parameter;

public class ParameterClass {
    @Parameter(names = "--help", description = "View all parameters", help = true)
    private boolean help;

    @Parameter(names = "--all", description = "View all results")
    private boolean all = false;

    @Parameter(names = "--continent", description = "View continent results", arity = 1)
    private String continent;

    @Parameter(names = "--country", description = "View country results", arity = 1)
    private String country;

    public boolean getAll() {
        return all;
    }

    public String getContinent() {
        return continent;
    }

    public String getCountry() {
        return country;
    }

    public boolean Help() {
        return help;
    }

}
