package pages;

public class GridPage extends BasePage {

    String table = "//div[@id='root']/div";

    public GridPage() {
        super(driver);
    }

    public void navigateToGridPage() {
        navigateTo("https://1v2njkypo4.csb.app/");
    }

    public String getValueCell(int row, int column) {
        return getValueFromTable(table, row, column);
    }

    public void sendValueToTable(int row, int column, String stringToSend) {
        setValueOnTable(table, row, column, stringToSend);
    }

}
