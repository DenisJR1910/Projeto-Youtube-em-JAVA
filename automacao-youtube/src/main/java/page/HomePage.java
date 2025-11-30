package page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import util.Util;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends Util {

    public HomePage(){
        PageFactory.initElements(getDriver(), this);
    }

    @FindBy(xpath = "//input[@class=\"ytSearchboxComponentInput yt-searchbox-input title\"]")
    private WebElement inputSearch;

    @FindBy(xpath = "(//button[@title=\"Pesquisar\"])[1]")
    private WebElement buttonSearchHome;

    public HomePage insertText(String text){
        insertTextElement(inputSearch,text);
        clickElement(buttonSearchHome);
        return this;
    }

}
