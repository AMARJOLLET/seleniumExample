package fr.eql.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class PageAccueil extends AbstractFullPage{

    public PageAccueil(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

/*######################################################################################################################
                                                  WEBELEMENTS
######################################################################################################################*/

/*######################################################################################################################
													METHODES
######################################################################################################################*/


    /*
    public PageConnexion connexion(WebDriver wait) {
        seleniumTools.clickOnElement(wait, xpath);
        return new PageConnexion(driver, wait);
    }
     */
}
