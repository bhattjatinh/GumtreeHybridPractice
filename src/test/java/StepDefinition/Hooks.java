package StepDefinition;

import Gumtree.Pages.BasePage;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks extends BasePage {

    @Before
    public void startBrowser(){openBrowser();}

    /*@After
    public void quitBrowser(){closeBrowser();}*/


}
