package stepDefinations;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pageObjects.NHSCostCheckerPage;
import utils.CommonFunctions;

public class CheckerPageSteps extends CommonFunctions
{
 NHSCostCheckerPage nhsCostCheckerPage = new NHSCostCheckerPage(driver);


 @Given("I navigate to the url on browser {string}")
 public void i_navigate_to_the_url_on_browser(String string) throws Exception {

      driver.get(readProperty("url"));
      waitForTime(3000);
 }
 @Then("I should be navigated to Start Page")
 public void i_should_be_navigated_to_start_page()
 {
     Assert.assertTrue(nhsCostCheckerPage.nextBtn.isDisplayed());
 }
 @When("I click on Start button")
 public void i_click_on_start_button() throws InterruptedException {
     nhsCostCheckerPage.acceptCookies();
    nhsCostCheckerPage.clickNextBtn();
 }
 @Then("I select {string} on where-you-live page and click next")
 public void i_select_on_where_you_live_page_and_click_next(String string)
 {
     waitForTime(3000);
    nhsCostCheckerPage.selectCountryRadioBtn();
    nhsCostCheckerPage.clickNextBtn();
 }
 @Then("I enter {string} and click next")
 public void i_enter_DOB_and_click_next(String dob)
 {
     waitForTime(3000);
     nhsCostCheckerPage.enterDateOfBirth(dob);
     nhsCostCheckerPage.clickNextBtn();
 }
 @Then("I select option {string} on live with partner page and click next")
 public void i_select_option_on_live_with_partner_page_and_click_next(String string)
 {
     waitForTime(3000);
      if (!string.isEmpty())
      {
        nhsCostCheckerPage.selectYesOrNoRadio(string);

      } else
      {
        System.out.println("Select 'yes' if you live with a partner");
      }
 }
 @Then("I select option {string} on claim-benefits-tax-credits page and click next")
 public void i_select_option_on_claim_benefits_tax_credits_page_and_click_next(String string) throws InterruptedException {
  if (!string.isEmpty())
  {
      waitForTime(3000);
   nhsCostCheckerPage.selectYesOrNoRadio(string);

  } else
  {
   System.out.println("Select 'yes' if you are claiming any benefits or tax credits");
  }

 }
 @Then("I select option {string} on paid-universal-credit page and click next")
 public void i_select_option_on_paid_universal_credit_page_and_click_next(String string)


 {  waitForTime(3000);
     if (!string.isEmpty()) {
    if (string.equals("YES")) {
        waitForTime(3000);
        nhsCostCheckerPage.selectYesUniversalCreditsRadioBtn();
    } else if (string.equals("NO")) {
        nhsCostCheckerPage.selectDifferentBenefitsRadioBtn();
    } else if (string.equals("NOT_YET")) {
        nhsCostCheckerPage.selectUniversalCreditsNotYetAppliedRadioBtn();
        nhsCostCheckerPage.clickNextBtn();
    }
    nhsCostCheckerPage.clickNextBtn();
} else {
    System.out.println(" Select 'yes' if you get paid Universal Credit ");
}
}
 @Then("I click next button on  awaiting-universal-credit page")
 public void I_click_next_button_on_awaiting_universal_credit_page()
 {
    nhsCostCheckerPage.clickNextBtn();
 }

  @Then("I select {string} on benefits page and click next")
 public void i_select_on_benefits_page_and_click_next(String string)
  { waitForTime(3000);

      if (!string.isEmpty()) {

          String[] benefits = string.split(",");

          if (benefits[0].equals("NO")) {

              nhsCostCheckerPage.selectNoBenefitChkBx();


          } else if (benefits[0].equals("YES")) {
              if (benefits[1].equals("YES")) {
                  nhsCostCheckerPage.selectTaxCreditChkBx();
              }
              if (benefits[2].equals("YES")) {
                  nhsCostCheckerPage.selectIncomeSupportChkBx();
              }
              if (benefits[3].equals("YES")) {
                  nhsCostCheckerPage.selectEmploymentAndSupportAllowanceChkBx();
              }
              if (benefits[4].equals("YES")) {
                  nhsCostCheckerPage.selectJobSeekerAllowanceChkBx();
              }
              if (benefits[5].equals("YES")) {
                  nhsCostCheckerPage.selectPensionCreditChkBx();
              }
          }
          System.out.println("for click ");
          nhsCostCheckerPage.clickNextBtn();

      } else {
          System.out.println("Select which benefit you get or select 'no'");
      }

  }

 @Then("I select option {string} on tax-credit-type page and click next")
 public void i_select_option_on_tax_credit_type_page_and_click_next(String string)
 { waitForTime(3000);
   if (!string.isEmpty()){
    if (string.equalsIgnoreCase("WORK AND CHILD TAX"))
    {
     nhsCostCheckerPage.selectWorkingChildTaxCreditRadioBtn();
    }
    else if (string.equalsIgnoreCase("WORK AND DISABILITY"))
    {
     nhsCostCheckerPage.selectWorkingDisabilityTaxCreditRadioBtn();
    }
    else if (string.equalsIgnoreCase("CHILD TAX"))
    {
     nhsCostCheckerPage.selectWorkingChildTaxCreditRadioBtn();
     }
    else if (string.equalsIgnoreCase("WORK TAX"))
    {
     nhsCostCheckerPage.selectWorkingTaxCreditRadioBtn();
    }
    nhsCostCheckerPage.clickNextBtn();
    }
   else {
    System.out.println("Select which type of tax credits you get");
   }

}
 @Then("I select option {string} on tax-credit-income page and click next")
 public void i_select_option_on_tax_credit_income_page_and_click_next(String string)
 {
     waitForTime(3000);
  if (!string.isEmpty())
  {
 nhsCostCheckerPage.selectYesOrNoRadio(string);
  }else {
    System.out.println("Select 'yes' if you have an income of £15,276 or less");
  }

 }
 @Then("I select option {string} on employment-support-allowance-type page and click next")
 public void i_select_option_on_employment_support_allowance_type_page_and_click_next(String string)
 {
     waitForTime(3000);
  if (!string.isEmpty()){
   if (string.equalsIgnoreCase("INCOME ESA")){
    nhsCostCheckerPage.selectIncomeESARadioBtn();
   }else if (string.equalsIgnoreCase("CONTRIBUTE ESA"))
   {
    nhsCostCheckerPage.selectContributionESARadioBtn();
   }
   nhsCostCheckerPage.clickNextBtn();
  }else {
   System.out.println("Select which type of ESA you get");
  }
 }
 @Then("I select option {string} on jobSeekers-allowance-type page and click next")
 public void i_select_option_on_jobSeekers_allowance_type_page_and_click_next(String string)
 {
     waitForTime(3000);
   if (!string.isEmpty())
   {
    if (string.equalsIgnoreCase("INCOME JSA"))
    {
       nhsCostCheckerPage.selectContributionJobSeekerRadioBtn();
    }else if (string.equalsIgnoreCase("CONTRIBUTE JSA"))
    {
     nhsCostCheckerPage.selectContributionJobSeekerRadioBtn();
    }
    nhsCostCheckerPage.clickNextBtn();
   } else
   {
    System.out.println("Select which type of JSA you get");
   }

 }
 @Then("I select option {string} on universal-credit-claim page and click next")
 public void i_select_option_on_universal_credit_claim_page_and_click_next(String string)
 {
     if (!string.isEmpty())
     {
      nhsCostCheckerPage.selectYesOrNoRadio(string);

     }else
     {
         System.out.println("Select 'yes' if your Universal Credit includes payments for a child or disability");
     }
 }
 @Then("I select option {string} on universal-credit-take-home-pay page and click next")
 public void i_select_option_on_universal_credit_take_home_pay_page_and_click_next(String string)
 {
     if (!string.isEmpty())
     {
      nhsCostCheckerPage.selectYesOrNoRadio(string);

     }else
     {
      System.out.println("Select 'yes' if your take-home pay was this amount or less");
     }
 }
 @Then("I select option {string} on pregnant-or-given-birth page and click next")
 public void i_select_option_on_pregnant_or_given_birth_page_and_click_next(String string)
 {
       if (!string.isEmpty())
       {
        nhsCostCheckerPage.selectYesOrNoRadio(string);

       }else
       {
         System.out.println("Select 'yes' if you are pregnant or have given birth in the last 12 months");
       }
 }
 @Then("I select option {string} on war-pensioner page and click next")
 public void i_select_option_on_war_pensioner_page_and_click_next(String string)
 {
    if (!string.isEmpty())
    {
     nhsCostCheckerPage.selectYesOrNoRadio(string);

    }else
    {
         System.out.println("Select 'yes' if you have an illness or injury caused by serving in the armed forces");
    }
 }
 @Then("I select option {string} on diabetes page and click next")
 public void i_select_option_on_diabetes_page_and_click_next(String string)
 {
   if (!string.isEmpty())
   {
    nhsCostCheckerPage.selectYesOrNoRadio(string);

   }else
   {
    System.out.println("Select 'Select 'yes' if you have diabetes");
   }
 }
 @Then("I select option {string} on glaucoma page and click next")
 public void i_select_option_on_glaucoma_page_and_click_next(String string)
 {
  if (!string.isEmpty())
  {
   nhsCostCheckerPage.selectYesOrNoRadio(string);

  }else
  {
   System.out.println("Select 'yes' if you have glaucoma");
  }
 }
 @Then("I select option {string} on care-home page and click next")
 public void i_select_option_on_care_home_page_and_click_next(String string)
 {
  if (!string.isEmpty())
  {
   nhsCostCheckerPage.selectYesOrNoRadio(string);

  }else
  {
   System.out.println("Select 'yes' if you permanently live in a care home");
  }
 }
 @Then("I select option {string} on local-council-assessed and click next")
 public void i_select_option_on_local_council_assessed_and_click_next(String string)
  {
   if (!string.isEmpty())
   {
    nhsCostCheckerPage.selectYesOrNoRadio(string);

   }else
   {
    System.out.println("Select 'yes' if your council pays towards your care home");
   }
 }
 @Then("I select option {string} on savings page and click next")
 public void i_select_option_on_savings_page_and_click_next(String string)
 {
  if (!string.isEmpty())
  {
   nhsCostCheckerPage.selectYesOrNoRadio(string);

  }else
  {
   System.out.println("Select 'yes' if you have savings, investments and property over this amount ");
  }
 }
 @Then("I get help with NHS treatment costs")
 public void i_get_help_with_nhs_treatment_costs() throws Exception {

     takeScreenshot("DonePage.jpg");
     System.out.println("treatment details displayed");


 }



}
