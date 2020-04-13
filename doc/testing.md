# Record Setters Testing Doc

1.	Introduction
        The Record Setters project is an Android based app that allows users to identify an album cover and determine whether it is in their collection.  The app will use the device’s camera and Google Cloud Vision API to identify an album cover.  It will reference this with the Discogs API to determine the album and supporting information.  Finally, it will compare this to a database containing the user’s album collection stored by SQLite.

2.	Objectives
The objectives of testing are to ensure proper functioning of the App as a whole experience and its individual components.  This will be achieved by combination of unit testing and human interfacing.

3.	Strategy
Testing is broken into 3 primary views: that of the whole experience, unit testing, and human testing.  The whole experience will be done by hand, going through the operation of the app, ensuring the user experience works.  Human testing will be done by hand and will ensure interface (and associated functions) are working properly.  Unit testing will be performed on the SQLite and Discogs interface.

4.	Tasks
-   App Opens
-   Discovery/add
        - Go button- hand
        -Google Cloud Vision interface -hand
-CV return types -hand
-Discogs interface – unit
-Discogs return type – unit
-   View/Remove
-Access button -hand
-RUD buttons – hand
-CRUD operations -unit

5.	Control Procedures
Testing will be performed by group members (based on above tasks), with issues identified and annotated, along with corrections.  These will be collated into a further document of changes.
