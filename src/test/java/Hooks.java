import io.cucumber.java.After;
import io.cucumber.java.Before;
import utils.CommonFunctions;

public class Hooks extends CommonFunctions
{


    @Before
    public void beforeTest()
    {
          openBrowser("chrome");
    }

    @After
    public void afterTest() {
        closeBrowser();
    }

}
