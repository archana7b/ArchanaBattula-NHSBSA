Feature: Help with the NHS costs

  As a person from Wales
  I need to know what help I can get with my NHS costs
  So that I can get the treatment I need


  Scenario Outline: Enter circumstance into the checker tool and get result with the treatment
    Given I navigate to the url on browser "chrome"
    Then  I should be navigated to Start Page
    When  I click on Start button
    Then  I select "<COUNTRY>" on where-you-live page and click next
    And   I enter "<DOB>" and click next
    And   I select option "<LIVEWITHPARTNER>" on live with partner page and click next
    And   I select option "<CLAIM_BENEFIT>" on claim-benefits-tax-credits page and click next
    And   I select option "<UNIVERSAL_CREDITS>" on paid-universal-credit page and click next
    And   I select "<UNIVERSAL_BENEFITS>" on benefits page and click next
    And   I select option "<TAX_TYPE>" on tax-credit-type page and click next
    And   I select option "<TAX_CREDIT_INCOME>" on tax-credit-income page and click next
    And   I select option "<EMPLOYMENT_ALLOWANCE>" on employment-support-allowance-type page and click next
    And   I select option "<JOBSEEKER_ALLOWANCE>" on jobSeekers-allowance-type page and click next
    And   I select option "<UNIVERSAL_CREDIT_CLAIM>" on universal-credit-claim page and click next
    And   I select option "<UNIVERSAL_TAKE_HOME_PAY>" on universal-credit-take-home-pay page and click next
    And   I select option "<PREGNANT_OR_GIVE_BIRTH>" on pregnant-or-given-birth page and click next
    And   I select option "<WAR_PENSIONER>" on war-pensioner page and click next
    And   I select option "<DIABETES>" on diabetes page and click next
    And   I select option "<GLAUCOMA>" on glaucoma page and click next
    And   I select option "<CARE_HOME>" on care-home page and click next
    And   I select option "<LOCAL_COUNCIL_ASSESSED>" on local-council-assessed and click next
    And   I select option "<SAVINGS>" on savings page and click next
    Then  I get help with NHS treatment costs

    Examples:
      | COUNTRY | DOB        | LIVEWITHPARTNER | CLAIM_BENEFIT | UNIVERSAL_CREDITS | UNIVERSAL_BENEFITS | TAX_TYPE | TAX_CREDIT_INCOME | EMPLOYMENT_ALLOWANCE | JOBSEEKER_ALLOWANCE | UNIVERSAL_CREDIT_CLAIM | UNIVERSAL_TAKE_HOME_PAY | PREGNANT_OR_GIVE_BIRTH | WAR_PENSIONER | DIABETES | GLAUCOMA | CARE_HOME | LOCAL_COUNCIL_ASSESSED | SAVINGS |

      | WALES   | 10-09-1980 | YES             | YES           | NO                |  YES,NO,NO,YES,NO,NO |            |               |        INCOME ESA     |                     |                        |                          |                       |               |         |           |          |                       |          |
      | WALES   | 10-09-1980 | YES             | YES           | NO                |  YES,YES,NO,NO,NO,NO |  CHILD TAX |     YES       |                       |                     |                        |                          |                       |               |         |           |           |                      |          |
      | WALES   | 10-09-1980 | YES             | YES           | YES               |                      |            |               |                       |                     |          YES           |             YES          |                       |               |         |           |           |                      |          |
      | WALES   | 10-09-1980 | YES             | YES           | YES               |                      |            |               |                       |                     |          YES           |          NO              |     NO                |     NO        | NO      |  NO       |   NO      |                      |    YES   |
      | WALES   | 10-09-1980 |  NO             | NO            |                   |                      |            |               |                       |                     |                        |                          |     YES               |    YES        | YES     |  NO       | NO        |                      |    YES   |
      | WALES   | 10-09-1980 | NO              | NO            |                   |                      |            |               |                       |                     |                        |                          |     YES               |    YES        | YES     |  NO       | YES       |     YES              |          |
      | WALES   | 10-09-1980 | YES             | YES           | NOT_YET           |  YES,NO,NO,YES,NO,NO |            |               |     INCOME ESA        |                     |                        |                          |                       |               |         |           |           |                      |          |




