package corona;

/**
 * Class description API description https://disease.sh/
 * 
 * @author John Keneth P. Paluca
 * @version 1.0.0
 */
public class MainClass extends OptionClass {

    // formatting table
    private static final String FORMAT_TABLE = "|| %-50s ||%n";

    /**
     * Main method.
     * @param args give arguments.
     */
    public static void main(String[] args) {
        final String[] LABEL = { "Cases - ", "Deaths - ", "Recovered - ", "Todays Cases - ", "Todays Deaths - ", "Continent - ", "Country - " };

        try {
            switch (args[0]) {
                case "--all":
                case "--today":
                    GET_ALL();
                    if (args[0] != "today") {
                        System.out.printf("========================================================%n||WORLD TOTAL CASES%-35s||%n========================================================%n", "");
                        for (byte i = 0; i < 3; i++) {
                            System.out.printf(FORMAT_TABLE, LABEL[i].concat(getResult(i)));
                        }
                    } else {
                        System.out.printf("========================================================%n||TODAYS WORLD TOTAL CASES%-36s||%n========================================================%n", "");
                        for (byte i = 3; i < 5; i++) {
                            System.out.printf(FORMAT_TABLE, LABEL[i].concat(getResult(i)));
                        }
                    }
                    break;
        
                case "--continent":
                    GET_CONTINENT(args[1]);
        
                    System.out.printf("========================================================%n||CONTINENT CASES%-37s||%n========================================================%n", "");
                    for (byte i = 0; i < 6; i++) {
                        System.out.printf(FORMAT_TABLE, LABEL[i].concat(getResult(i)));
                    }
                    break;
                case "--country":
                    GET_COUNTRY(args[1]);
        
                    System.out.printf("========================================================%n||LOCAL COUNTRY CASES%-33s||%n========================================================%n", "");
                    for (byte i = 0; i < 7; i++) {
                        System.out.printf(FORMAT_TABLE, LABEL[i].concat(getResult(i)));
                    }
                    break;
                default:
                    System.out.print("Invalid\n");
                    break;
            }
            CREDITS();

        // catch exceptions
        } catch (NullPointerException ex) {
            System.out.print("Invalid syntax\n");
            CREDITS();
        }
    }

    // initialize Array String INFO for CREDITS method
    private static final String[] INFO = { "AUTOR - John Keneth P. Paluca", "FACEBOOK - www.facebook.com/wwww.keneth.com.ph", "GITHUB - www.github.com/kandateach" };

    /**
     * Authors description.
     */
    private static final void CREDITS() {
        System.out.printf("========================================================%n");
        for (byte i = 0; i < 3; i++) {
            System.out.printf(FORMAT_TABLE, INFO[i]);
        }
        System.out.printf("========================================================%n");
    }
}