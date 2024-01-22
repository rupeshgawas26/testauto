
# TESTAUTO Framework
  -----------
  TESTAUTO Framework is Created in Java using Eclipse Adoptium JDK 11 and Apache Maven 3.9.6 to Automate Enterprise Web Applications

How to run project
----------------
mvn test -Dcucumber.filter.tags="@smoke"

Salient Features of TESTAUTO Framework
----------------
* This framework is created using industry Standard tools such as Selenium, Cucumber BDD(Behaviour Driven developement), TestNG, Maven and other java libraries
* It usage POM(Page Object Model) as a page object is created for every single page consisting of Locaters and methods which makes it highly Scalable, maintainable, reusable and Readable
* This framework is Hybrid framework as user actions can be autmated using keyword driven approach like LoginPage.login() and can also be driven by different type of data
* This Framework is highly Dynamic in terms of Handling data as data can be parameterized in various ways as mentioned below:
  * User credentials, base URLs etc can be configured using config.properties file
  * User data can be parameterized in feature files by giving Examples in scenario Outline
  * Data can also be referenced from excel sheet using XLUtils 
* Test scenarios can be annotated with tags such as @smoke, @regression etc for selection and dynamically controlling execution using commandline filters so that only relevant scenarios are executed
* Scenarios can be tested on multiple browsers such as Chrome,Firefox by configuring browser property in config.properties file
* This Framework can be easily integrated with CI/CD tools such as Jenkins, Gitlab, Teamcity to run test cases as part of CI/CD pipeline
* Its loosely coupled framework which makes it extensible,configurable for incorporating new functionalities 

