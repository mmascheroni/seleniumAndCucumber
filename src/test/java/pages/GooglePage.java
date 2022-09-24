package pages;

public class GooglePage extends BasePage {

    // private String criteriaSearch =
    // "//body/div[1]/div[3]/form[1]/div[1]/div[1]/div[1]/div[1]/div[2]/input[1]";

    private String criteriaSearch = "//input[@title='Buscar']";

    // private String searchButton =
    // "//body/div[1]/div[3]/form[1]/div[1]/div[1]/div[2]/div[2]/div[5]/center[1]/input[1]";

    private String searchButton = "//input[@value='Buscar con Google']";

    public GooglePage() {
        super(driver);
    }

    public void navigateToGoogle() {
        navigateTo("https://www.google.com");
    }

    public void searchCriteriaOnGoogle() {
        enterCriteria(criteriaSearch, "Testing");
    }

    public void clickGoogleSearch() {
        clickButton(searchButton);
    }

}