package demo.steps_definition;

import demo.pages.backoffice.CategoriesPage;
import demo.pages.backoffice.DashboardPage;
import demo.pages.backoffice.ItemLibraryPage;
import demo.pages.backoffice.LoginPage;
import demo.pages.backoffice.ModifiersPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class BackOfficeStepDefinitions {

  LoginPage loginPage = new LoginPage();
  DashboardPage dashboardPage = new DashboardPage();
  CategoriesPage categoriesPage = new CategoriesPage();
  ItemLibraryPage itemLibraryPage = new ItemLibraryPage();
  ModifiersPage modifiersPage = new ModifiersPage();

  @Given("User open moka backoffice login page")
  public void userOpenMokaBackofficeLoginPage() {
    loginPage.openPage();
  }

  @When("User input email/phone {string} on backoffice login page")
  public void userInputEmailOnBackofficeLoginPage(String emailOrPhone) {
    loginPage.inputEmailorPhone(emailOrPhone);
  }

  @When("User input password {string} on backoffice login page")
  public void userInputPasswordOnBackofficeLoginPage(String password) {
    loginPage.inputPassword(password);
  }

  @When("User click Sign in on backoffice login page")
  public void userClickSignInOnBackofficeLoginPage() {
    loginPage.clickSignIn();
  }

  @Then("User successfully login on backoffice")
  public void userSuccessfullyLoginOnBackoffice() {
    Assert.assertTrue(dashboardPage.isOnPage());
  }

  @When("User go to menu categories on backoffice")
  public void userGoToMenuCategoriesOnBackoffice() {
    categoriesPage.openPage();
  }

  @When("User go to menu item library on backoffice")
  public void userGoToMenuItemLibraryOnBackoffice() {
    itemLibraryPage.openPage();
  }

  @When("User go to menu modifiers on backoffice")
  public void userGoToMenuModifiersOnBackoffice() {
    modifiersPage.openPage();
  }

  @When("User add random menu to the item")
  public void userAddRandomMenuToTheItem(){
    itemLibraryPage.inputName();
  }

  @And("User click Create Item Button")
  public void userClickCreateItemButton() {
    itemLibraryPage.clickCreate();
  }

  @And("User add item price")
  public void userAddItemPrice() {
    itemLibraryPage.inputPrice();
  }

  @And("User add item SKU")
  public void userAddItemSKU() {
    itemLibraryPage.inputSKU();
  }

  @And("User save item")
  public void userSaveItem() {
    itemLibraryPage.saveItem();
  }

  @Then("User will see new item on item library page")
  public void userWillSeeNewItemOnItemLibraryPage() {
    boolean actual = itemLibraryPage.checkItemDisplayed();
    Assert.assertTrue(actual);
  }

  @And("User Create a modifier")
  public void userCreateAModifier() {
    modifiersPage.clickCreate();
  }

  @And("User input modifier name")
  public void userInputModifierName() {
    modifiersPage.inputName();
  }

  @And("User add or manage modifier")
  public void userAddOrManageModifier() {
    modifiersPage.addManageOptions();
  }

  @And("User input modifier options name {string}")
  public void userInputModifierOptionsName(String op_name) {
    modifiersPage.inputOpName(op_name);
  }

  @And("User input modifier options price")
  public void userInputModifierOptionsPrice() {
    modifiersPage.inputPrice();
  }

  @And("User save modifier options name")
  public void userSaveModifierOptionsName() {
    modifiersPage.saveOP_Modifier();
  }

  @And("User save modifier")
  public void userSaveModifier() {
    modifiersPage.saveModifier();
  }

  @Then("User see new modifier")
  public void userSeeNewModifier() {
    boolean actual = modifiersPage.checkItemDisplayed();
    Assert.assertTrue(actual);
  }

  @And("User click add new categories")
  public void userClickAddNewCategories() {
    categoriesPage.clickCreate();
  }

  @And("User add new categories")
  public void userAddNewCategories() {
    categoriesPage.inputCategoryName();
  }

  @And("User save new categories")
  public void userSaveNewCategories() {
    categoriesPage.saveCategory();
  }

  @Then("User see new categories")
  public void userSeeNewCategories() {
  }

  @And("User click modifier options")
  public void userClickModifierOptions() {
    modifiersPage.addOptions();
  }
}
