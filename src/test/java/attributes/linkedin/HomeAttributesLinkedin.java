package attributes.linkedin;

import core.DSL;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class HomeAttributesLinkedin extends DSL {

    @FindBy(xpath = "//a[contains(text(),'Encontre pessoas conhecidas')]")
    protected WebElement btnSearchPeople;


}
