package step;


import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import page.HomePage;

public class HomeStep {
    private HomePage homePage;

    public HomeStep(){
        this.homePage = new HomePage();
    }

    @Given("que eu abro a página do YouTube")
    public void que_eu_abro_a_página_do_you_tube() {

    }
    @When("eu pesquiso por {string}")
    public void eu_pesquiso_por(String string) {
        this.homePage.insertText(string);

    }
    @Then("o título da página deve conter {string}")
    public void o_título_da_página_deve_conter(String string) {

    }

}