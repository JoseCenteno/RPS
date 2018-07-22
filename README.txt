
The Project RPS is generated with maven 3.5.4, contains 2 modules
-	RPSlib contains the mains classes and jUnit Cases. Library dependencies resolved with maven: jUnit 4.12
-	RPSweb: contains a web application to play rounds of the game. Include a Tomcat 7 pluging to deploy localy the application.
			Library dependencies resolved with maven:
	o	RPSlib
	o	javax.faces 2.1.17
	o	primefaces  5.3

Compile

To compile the project, run the following maven statement from the command line (from the RPS parent project)

mvn clean install 

To deploy RPSweb module run the following maven statement from the command line 

mvn tomcat:run
