package fr.eql.pageObject;

import jdk.javadoc.internal.doclets.formats.html.markup.Head;
import org.openqa.selenium.WebDriver;
import utils.Logging;
import utils.OutilsProjet;
import utils.SeleniumTools;

public abstract class AbstractFullPage extends Logging {
    protected OutilsProjet outilsProjet = new OutilsProjet();
    protected SeleniumTools seleniumTools = new SeleniumTools();

    protected final WebDriver driver;

    public AbstractFullPage(WebDriver driver) {
        this.driver = driver;
    }

    public HeaderPage getHeader(){
        return new HeaderPage(driver);
    }


}
