import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class WorkSheetPage extends PageBase{
    public WorkSheetPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(className = "instance")
    List<WebElement> Questions;
    // Count number of Questions
    public void CountNoOfQuestions(){
        System.out.println("Number of questions = "+ Questions.size());
    }

}
