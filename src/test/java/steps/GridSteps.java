package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import pages.GridPage;

public class GridSteps {

    GridPage grid = new GridPage();

    @Given("I am on the Grid page")
    public void navigateToGridPage() {
        grid.navigateToGridPage();
    }

    @Then("The results match with the cell in the table")
    public void bringCell() {
        String value = grid.getValueCell(3, 2);

        System.out.println(value);

        // grid.sendValueToTable(3, 3, "Mauro"); ---> Tiene que aceptar la tabla para
        // isnertar texto
    }
}
