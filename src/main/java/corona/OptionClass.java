package corona;

/**
 * Class description The purpose of this class is that it provides the methods
 * that filters the results
 * 
 * @author John Keneth P. Paluca
 */
public class OptionClass extends ResultClass {
    /**
     * In this GET_ALL method gets the total counting of the corona virus.
     * 
     * @throws Exception MalformedURLException, JSONException, IOException
     */
    protected static final void GET_ALL() throws Exception{
        setResult("all", "");
    }

    /**
     * In this GET_CONTINENT method gets the total counting to the specific
     * continent.
     * 
     * @param continent continent path of the API url.
     * @throws Exception MalformedURLException, JSONException, IOException
     */
    protected static final void GET_CONTINENT(String continent) throws Exception {
        setResult("continents", continent);
    }

    /**
     * In this GET_COUNTRY method gets the total counting to the specific country.
     * 
     * @param country country path of the API url.
     * @throws Exception MalformedURLException, JSONException, IOException
     */
    protected static final void GET_COUNTRY(String country) throws Exception{
        setResult("countries", country);
    }
}