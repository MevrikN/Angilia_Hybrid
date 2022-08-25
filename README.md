# Task Angilia Hybrid Framework 

In this project , you can run your Automation test script on Chrome , Firefox and Edge browser. To select your fevorite browser follow this steps,
src > main > Java > org.example > DriverManager
In DriverManager class , you need to write browser name .
For example, 
String browserName = "chrome";

To run this acript on chrome , you must have Google chrome Version 104 or above.

To run this automation script you should have Cucumber for Java and Gherkin plugin to execute.
In pom.xml , there are many dependencies which should help this framework to run successfully. Please do not change version of any dependency file.

To run testcases by @tagname you can give @tag name to RunCuke class.

If you want to look into report ganerated by TestNG kindly just go to target > cucumber-Reports.html  
(You need to open in any of the web browser for batter result)
