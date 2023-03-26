import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LessonPage extends PageBase{
    public LessonPage(WebDriver driver) {
        super(driver);
    }
    @FindBy(xpath = "//a[@href='../../worksheets/737102191030/']")
    WebElement WorkSheets;
//click on lesson preview
    public void WorksheetsPerview(){
        WorkSheets.click();
    }
}
