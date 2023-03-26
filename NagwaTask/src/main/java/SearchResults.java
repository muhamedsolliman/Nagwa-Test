import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class SearchResults extends PageBase{
    public SearchResults(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "(//div[@class='right']/child::a)")
    List<WebElement> Results ;
    //click on the 2nd Result
    public void ChooseFromSearchResults(int index) {Results.get(index-1).click();

    }

}
