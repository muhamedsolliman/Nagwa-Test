import org.testng.annotations.Test;

public class TestScenario extends TestBase{


    @Test
    public void test(){

        // object from homepage
        HomePage homePage = new HomePage(driver);
        // object from SearchResults
        SearchResults searchResults = new SearchResults(driver);
        // object from LessonPage
        LessonPage lessonPage = new LessonPage(driver);
        // object from workSheetPage
        WorkSheetPage workSheetPage =new WorkSheetPage(driver);
        //Test Scenario
        homePage.SelectLanguage();
        homePage.Search("addition");
        searchResults.ChooseFromSearchResults(2);
        lessonPage.WorksheetsPerview();
        workSheetPage.CountNoOfQuestions();
    }

}
