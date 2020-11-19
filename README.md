# GUI_AUTOMATION
The application under test has a Canvas (HTML5) Element. Objects on Canvas cannot be identified in a straight forwad way. 
So there are 2 challenges here :   
1. Identifying the individual element on Canvas  
2. Action Performing on the element  
3. Reading the value from element  

For these problems we will use Action class to identify and to perform actions on the elements and use OCR library for verification  

To Build and Execute the Solution :   
Prerequisites :   
	1. JDK8 or above should be already installed on machine.  
	2. Eclipse or IntelliJ or any other IDE required.  
Step 1 : Clone my public repository on your local machine  
Step 2 : Right Click on the POM.xml and update the project OR open the POM.xml and save the project. All the dependencies will start downloading.  
Below Dependencies :  
	1. Selenium-Java  
	2. Cucumber-Java  
	3. Cucumber-JUnit  
	4. Log4J  
	5. OCR  
  
Step 3 : Download the Browser Drivers (Chrome Driver, Firefox Driver, etc) from their respective hosting sites. This is used by our code to communicate with the browser.  
Step 4 : Set the System property for the path of the driver. Exception will occur if not set properly.  
Step 5 : Go to the Runner file where we have set the path to the feature file folder and their mapping with the step files.  
Step 6 : Right click on the file and select Run configuration as JUnit and execute.  
Step 7 : We have 2 reports here :  
	1. Cucumber Reports : The path will be available in the console. to keep the result set the token in the environment variables.  
	2. JUnit Reports : In the target folder these reports will be present.  
  
#####   In case of any help required or any doubts, kindly contact me on faizahmed.sdet@gmail.com  #####
