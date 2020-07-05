package corona;

import com.beust.jcommander.JCommander;
import com.beust.jcommander.ParameterException;

/**
 * API link https://disease.sh/
 * 
 * @author John Keneth P. Paluca
 * @version 1.0.0
 */
public class MainClass extends ResultClass {

    private static final ParameterClass parameterObj = new ParameterClass();

    public static void main(String[] args) {
        try {
            MainClass mainObj = new MainClass();
            mainObj.inputHandle(args);
            mainObj.run();
        } catch (NullPointerException ex) {
            System.exit(0);
        }
    }

    private void inputHandle(String... inputArgs) {
        JCommander commander = new JCommander(parameterObj);
        try {
            commander.parse(inputArgs);
        } catch (ParameterException ex) {
            throw new IllegalArgumentException("Invalid Argument.");
        }

        if (parameterObj.Help()) {
            commander.usage();
            System.exit(0);
        }
    }

    private void run() {
        if (parameterObj.getAll() == true && parameterObj.getContinent() == null && parameterObj.getCountry() == null) {
            printResult();
        } else if (parameterObj.getAll() == false && parameterObj.getContinent() != null
                && parameterObj.getCountry() == null) {
            printResult(parameterObj.getContinent());
        } else if (parameterObj.getAll() == false && parameterObj.getContinent() == null
                && parameterObj.getCountry() != null) {
            printResult("countries", parameterObj.getCountry());
        } else if (parameterObj.getAll() == true && parameterObj.getContinent() != null
                && parameterObj.getCountry() == null) {
            printResult();
            printResult(parameterObj.getContinent());
        } else if (parameterObj.getAll() == true && parameterObj.getContinent() == null
                && parameterObj.getCountry() != null) {
            printResult();
            printResult("countries", parameterObj.getCountry());
        } else if (parameterObj.getAll() == false && parameterObj.getContinent() != null
                && parameterObj.getCountry() != null) {
            printResult(parameterObj.getContinent());
            printResult("countries", parameterObj.getCountry());
        } else if (parameterObj.getAll() == true && parameterObj.getContinent() != null
                && parameterObj.getCountry() != null) {
            printResult();
            printResult(parameterObj.getContinent());
            printResult("countries", parameterObj.getCountry());
        } else {
            System.out.print("Need Arguments to Parse.");
        }
    }
}
