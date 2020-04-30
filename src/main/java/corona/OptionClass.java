package corona;

/**
 * Class description
 * The purpose of this class is that it provides the methods that filters the results
 * @author John Keneth P. Paluca
 */
public class OptionClass extends ResultClass {
    /**
     * In this GET_ALL method gets the total counting of the corona virus.
     * @return storeResult method meaning returns the total counting of corona virus.
     */
    protected static final String GET_ALL() {return storeResult("all","");}

    /**
     * In this GET_CONTINENT method gets the total counting to the specific continent.
     * @param continent continent path of the API url.
     * @return storeResult method meaning returns the total counting to the specific continent.
     */
    protected static final String GET_CONTINENT(String continent) {return storeResult("continents",continent);}

    /**
     * In this GET_COUNTRY method gets the total counting to the specific country.
     * @param country country path of the API url.
     * @return storeResult method meaning returns the total counting to the specific country.
     */
    protected static final String GET_COUNTRY(String country) {return storeResult("countries",country);}
}