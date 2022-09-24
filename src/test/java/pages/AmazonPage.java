package pages;

public class AmazonPage extends BasePage {

    // private String select = "//select[@title='Search in']";
    private String selectDrop = "//select[@name='country']";

    // private String value = "";

    public AmazonPage() {
        super(driver);
    }

    public void navigateToAmazon() {
        // navigateTo("https://www.amazon.com/ref=nav_logo");
        navigateTo("https://demo.guru99.com/test/newtours/register.php");
    }

    public void SelectOption(int option) {
        // selectFromDropdownByValue(selectDrop, option);
        selectFromDropdownByIndex(selectDrop, option);
    }

}
