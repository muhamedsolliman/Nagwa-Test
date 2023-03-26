import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends PageBase{
    public HomePage(WebDriver driver) {
        super(driver);
    }

@FindBy(xpath ="//button[@type='button']")
WebElement SearchButton;
@FindBy(id="txt_search_query")
WebElement SearchBar;
@FindBy(id = "btn_global_search")
WebElement Submit;
@FindBy(xpath ="(//span[text()='English']/following::i)[1]")
WebElement DropDownButton;
@FindBy(xpath = "(//a[text()='English'])[1]")
WebElement English ;
// Select the language
public void SelectLanguage(){
    DropDownButton.click();
    English.click();
}
//Search Function
    public void Search(String SearchKeyword){
        SearchButton.click();
        SearchBar.sendKeys(SearchKeyword);
        Submit.click();
    }
}

