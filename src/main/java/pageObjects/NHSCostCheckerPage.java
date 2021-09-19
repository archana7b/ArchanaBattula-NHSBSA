package pageObjects;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.CommonFunctions;

public class NHSCostCheckerPage extends CommonFunctions
{
   public WebDriver driver;

    public NHSCostCheckerPage(WebDriver driver)
    {
        PageFactory.initElements(driver, this);
    }

  @FindBy (xpath = "//input[@id='next-button']")
  public WebElement nextBtn;

  @FindBy (xpath = "//label[@id='label-wales']")
  public WebElement countryRadioBtn;

  @FindBy (xpath = "//input[@id='dob-day']")
  public WebElement enterDay;

  @FindBy (xpath = "//input[@id='dob-month']")
  public WebElement enterMonth;

  @FindBy (xpath = "//input[@id='dob-year']")
  public WebElement enterYear;

  @FindBy (xpath= "//label[@id='label-yes']")
  public WebElement yesRadioBtn;

  @FindBy (xpath = "//label[@id='label-no']")
  public WebElement noRadioBtn;

    @FindBy (xpath = "//body/main[@id='content']/div[2]/div[1]/form[1]/div[1]/fieldset[1]/label[1]")
    public WebElement yesUniversalCredit;

    @FindBy (xpath = "//body/main[@id='content']/div[2]/div[1]/form[1]/div[1]/fieldset[1]/label[2]")
    public WebElement creditsNotYetApplied;

    @FindBy (xpath = "//body/main[@id='content']/div[2]/div[1]/form[1]/div[1]/fieldset[1]/label[3]")
    public WebElement noDifferentBenefits;

           @FindBy(xpath = "//body/main[@id='content']/div[2]/div[1]/form[1]/div[1]/fieldset[1]/label[1]")
        public WebElement taxCreditCheckBox;

        @FindBy(xpath = "//input[@id='incSupport']")
        public WebElement incomeSupportCheckBox;

        @FindBy(css = "#esa")
        public WebElement employmentAndSupportAllowanceCheckBox;

        @FindBy(xpath = "//body/main[@id='content']/div[2]/div[1]/form[1]/div[1]/fieldset[1]/label[4]")
        public WebElement jobSeekerAllowanceCheckBox;

        @FindBy(xpath = "//input[@id='penCredit']")
        public WebElement pensionCreditCheckBox;

        @FindBy(xpath = "//input[@id='continue']")
        public WebElement noBenefitCheckBox;

        @FindBy(xpath = "//body/main[@id='content']/div[2]/div[1]/form[1]/div[1]/fieldset[1]/label[1]")
        public WebElement workingChildTaxCreditRadioButton;

        @FindBy(xpath = "//body/main[@id='content']/div[2]/div[1]/form[1]/div[1]/fieldset[1]/label[2]")
        public WebElement workingDisabilityTaxCreditRadioButton;

        @FindBy(xpath = "//body/main[@id='content']/div[2]/div[1]/form[1]/div[1]/fieldset[1]/label[3]")
        public WebElement childTaxCreditRadioButton;

        @FindBy(xpath = "//body/main[@id='content']/div[2]/div[1]/form[1]/div[1]/fieldset[1]/label[4]")
        public WebElement workingTaxCreditRadioButton;

        @FindBy(xpath = "//body/main[@id='content']/div[2]/div[1]/form[1]/div[1]/fieldset[1]/label[1]")
        public WebElement incomeESARadioButton;

        @FindBy(xpath = "//body/main[@id='content']/div[2]/div[1]/form[1]/div[1]/fieldset[1]/label[2]")
        public WebElement contributionESARadioButton;

        @FindBy(id = "income-jsa")
        public WebElement incomeJobSeekerRadioButton;

        @FindBy(id = "contBaseJsa")
        public WebElement contributionJobSeekerRadioButton;

        @FindBy(id = "guaranteeCreditOnly")
        public WebElement guaranteeCreditOnlyRadioButton;

        @FindBy(id = "guaranteeCreditWithSavingCredit")
        public WebElement guaranteeCreditWithSavingCreditRadioButton;

        @FindBy(id = "savingCredit")
        public WebElement savingCreditRadioButton;

        @FindBy(id = "nhsuk-cookie-banner__link_accept_analytics")
        public WebElement acceptCookiesBtn;



    public void clickNextBtn()
    {
        waitForElement(nextBtn);
        nextBtn.click();
    }

    public void selectCountryRadioBtn()
    {
      countryRadioBtn.click();
    }

        public void enterDateOfBirth(String string) {
            String[] dob = string.split("-");
            enterDay.sendKeys(dob[0]);
            enterMonth.sendKeys(dob[1]);
            enterYear.sendKeys(dob[2]);
        }


        public void selectYesRadioBtn()
        {
            yesRadioBtn.click();
        }

        public void selectNoRadioBtn()
        {
           noRadioBtn.click();
        }

        public void selectYesUniversalCreditsRadioBtn()
        {
            yesUniversalCredit.click();
        }

        public void selectUniversalCreditsNotYetAppliedRadioBtn()
        {
            JSClick(creditsNotYetApplied);
             creditsNotYetApplied.click();
        }

        public void selectDifferentBenefitsRadioBtn()
        {
            noDifferentBenefits.click();
        }

        public void selectWorkingChildTaxCreditRadioBtn()
        {
             workingChildTaxCreditRadioButton.click();
        }

        public void selectWorkingDisabilityTaxCreditRadioBtn()
        {
           workingDisabilityTaxCreditRadioButton.click();
        }

        public void selectChildTaxCreditRadioBtn()
        {
           childTaxCreditRadioButton.click();
        }

        public void selectWorkingTaxCreditRadioBtn() {
            workingTaxCreditRadioButton.click();
        }

        public void selectIncomeESARadioBtn() {
            incomeESARadioButton.click();
        }

        public void selectContributionESARadioBtn() {
            contributionESARadioButton.click();

        }

        public void selectIncomeJobSeekerRadioBtn() {
            incomeJobSeekerRadioButton.click();
        }

        public void selectContributionJobSeekerRadioBtn() {
            contributionJobSeekerRadioButton.click();
        }

        public void selectGuaranteeCreditOnlyRadioBtn() {
            guaranteeCreditOnlyRadioButton.click();
        }

        public void selectGuaranteeCreditWithSavingCreditRadioBtn() {
            guaranteeCreditWithSavingCreditRadioButton.click();
        }

        public void selectSavingCreditRadioBtn() {
            savingCreditRadioButton.click();
        }

        public void selectTaxCreditChkBx() {
           taxCreditCheckBox.click();
        }

        public void selectIncomeSupportChkBx() {
            incomeSupportCheckBox.click();
        }

        public void selectEmploymentAndSupportAllowanceChkBx()
        {
            employmentAndSupportAllowanceCheckBox.click();
        }

        public void selectJobSeekerAllowanceChkBx() {
           jobSeekerAllowanceCheckBox.click();
        }

        public void selectPensionCreditChkBx() {
            pensionCreditCheckBox.click();
        }

        public void selectNoBenefitChkBx() {

        JSClick(noBenefitCheckBox);

        noBenefitCheckBox.click();


              }

    public void validateStartPage()
    {
        compareUrl(url);
    }



    public void selectYesOrNoRadio(String string) {

        if (string.equalsIgnoreCase("YES")) {
            System.out.println(" live_with_partner selecting Yes");
            selectYesRadioBtn();
        } else if (string.equalsIgnoreCase("No")) {
            selectNoRadioBtn();
        }
        clickNextBtn();
        waitForTime(3000);

    }


    public void acceptCookies() throws InterruptedException {
        acceptCookiesBtn.click();
        waitForTime(1000);
    }





}
