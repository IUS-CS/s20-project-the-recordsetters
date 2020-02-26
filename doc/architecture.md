# Record Setters
#  Software Architecture Document


1 	Introduction
 
This document provides an architectural overview of the app, using several different architectural views to depict different aspects of it.  This is intended to capture the architectural decisions which have been made on the project.
1.	Purpose

Record Setter is an Android based app that allows users to identify an album cover and determine whether it is in their collection.  The app will use the device’s camera and Google Cloud Vision API to identify an album cover.  It will reference this with the Discogs API to determine the album and supporting information.  Finally, it will compare this to a database containing the user’s album collection.
The project will largely be developed with in Android Studios using Kotlin and Java (as much as we can get away with).  The app will require means of accessing the camera on supported devices, as well as GUI functionality to read input from the camera or log, as well as basic features to review the user’s collection (add, remove, etc.). 
Google Cloud Vision and Discogs, both, have API with support towards the type of project we are undertaking.  Currently there are several apps or plug-ins that circle around the idea we are implementing.  The big differentiator between our project is the inclusion of a method of cataloguing the user’s collection.

2	Architectural Overview
1.	Diagram

	The project relies on the proper application of the API from Discogs and Google Cloud Vision (GCV) as well as a functioning database using SQLite. The process can be broken into two primary areas; broken into discovery/add and view/remove.
The user side, described in case below, involved initiating buttons (wrapped under UI in diagram to simplify view).  Once open, the User will be presented with home window, providing Initiates Camera Scan, initiating discovery/add, and View Collection buttons, initiating view/remove.
The discovery/add process is initiated by the user activating the Initiates Camera Scan.  This will deploy the device’s onboard camera, allowing the user to take a picture.  This image will be scanned by Google Cloud Vision, which will return the album name to the application.
Once returned, it will be cross referenced with Discogs, to identify the proper album.  If the album is not found, a message to that extent will be presented.  If found the user will receive results in the Identification window. The database will be queried, using album name and artist, to determine if the album is in the collection. The User will have the option to add or leave this window.  Should they add, the album will be added to the collection.
The view/remove is activated by View Collection button.  This will depict the current Collection database.  The database will be composed of the album name, and artist, as well as a link the Discogs page.  The Remove function will allow the User to remove an entry from the collection.

![DIAGRAM GOES HERE!!!!!!!](LINK)

3	Goals and Constraints

The development of Google Cloud Vision, and similar packed, pretrained, technology, has opened the door for a plethora of opportunities for student and independent developers. The goal for this project is to deliver a functioning app that will allow users the ability to identify albums and maintain a working database of albums they already own. 

There are several constraints:
- Core functionality requires navigating through all of Google’s authentication and verification requirements for development of the project.
- Establishing method of doing the same for the user end.
-	Language barriers between the Discogs API and the larger project.
-	Not all Android devices are made equally.

4	Use Case
1.	User

	A description of use cases for the User.
	-	Open Application
	-	Initiates Camera Scan
	-	Add to collection
	-	Leave Results
	-	View collection
	-	Remove item

2.	Open Application

	User engages icon stored location.


3.	Initiates Camera Scan

	Button available at opening app.  Activation engages camera and begins process of identification with Clough Vision and Discogs.  Results in Identification window, with results (found or not).


4.	Add to Collection

	Button in Identification window. Allows user to add album to collection database.


5. Leave Results

	Button in Identification window.  Allows user to leave Identification window.


6. 	View Collection

	Button available at opening app. Opening access to View Collection window, allowing user to see collection.


7.	Remove Item

	Button available in View Collection window.  Allows user to remove item from their collection.


8.	Leave Collection
	
	Button available in View Collection window.  Allows user to leave View Collection window.










