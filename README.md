<strong>** DO NOT DISTRIBUTE OR PUBLICLY POST SOLUTIONS TO THESE LABS. MAKE ALL FORKS OF THIS REPOSITORY WITH SOLUTION CODE PRIVATE. PLEASE REFER TO THE STUDENT CODE OF CONDUCT AND ETHICAL EXPECTATIONS FOR COLLEGE OF INFORMATION TECHNOLOGY STUDENTS FOR SPECIFICS. ** </strong>

# WESTERN GOVERNOR UNIVERSITY 
## D287 – JAVA FRAMEWORKS
Welcome to Java Frameworks! This is an opportunity for students to implement user interfaces and learn to leverage existing frameworks, assets, and content for object-oriented programming.
FOR SPECIFIC TASK INSTRUCTIONS AND REQUIREMENTS FOR THIS ASSESSMENT, PLEASE REFER TO THE COURSE PAGE.
## BASIC INSTRUCTIONS
For this project, you will use the Integrated Development Environment (IDE) link in the web links section of this assessment to install the IDE, IntelliJ IDEA (Ultimate Edition). All relevant links are on the course page. Please refer to the course of study for specific links. You will sign up for a free student license using your WGU.edu email address. Please see the “IntelliJ Ultimate Edition Instructions” attachment for instructions on how do this. Next you will download the “Inventory Management Application Template Code” provided in the web links section and open it in IntelliJ IDEA (Ultimate Edition). You will upload this project to a private external GitLab repository and backup regularly. As a part of this, you have been provided with a base code (starting point). 

## SUPPLEMENTAL RESOURCES  
1.	How to clone a project to IntelliJ using Git?

> Ensure that you have Git installed on your system and that IntelliJ is installed using [Toolbox](https://www.jetbrains.com/toolbox-app/). Make sure that you are using version 2022.3.2. Once this has been confirmed, click the clone button and use the 'IntelliJ IDEA (HTTPS)' button. This will open IntelliJ with a prompt to clone the proejct. Save it in a safe location for the directory and press clone. IntelliJ will prompt you for your credentials. Enter in your WGU Credentials and the project will be cloned onto your local machine.  

2. How to create a branch and start Development?

- GitLab method
> Press the '+' button located near your branch name. In the dropdown list, press the 'New branch' button. This will allow you to create a name for your branch. Once the branch has been named, you can select 'Create Branch' to push the branch to your repository.

- IntelliJ method
> In IntelliJ, Go to the 'Git' button on the top toolbar. Select the new branch option and create a name for the branch. Make sure checkout branch is selected and press create. You can now add a commit message and push the new branch to the local repo.

## SUPPORT
If you need additional support, please navigate to the course page and reach out to your course instructor.
## FUTURE USE
Take this opportunity to create or add to a simple resume portfolio to highlight and showcase your work for future use in career search, experience, and education!

# CHANGES TO ORIGINAL FILE
## SECTION C
### PROMPT
Customize the HTML user interface for your customer’s application. The user interface should include the shop name, 
the product names, and the names of the parts.
### FILE NAME(S)
mainscreen.html
### LINE NUMBER(S)
1. 14
2. 19
3. 21
4. 53
### CHANGE(S)
1. Changed the title from "My Bycicle Shop" to "Play 'n Hooky"
2. Changed header 1 from "Shop" to "Play 'n Hooky"
3. Changed header 2 from "Parts" to "Crochet Kit Components"
4. Changed header 2 from "Products" to "Crochet Kits"

## SECTION D
### PROMPT
Add an “About” page to the application to describe your chosen customer’s company to web viewers and include navigation
to and from the “About” page and the main screen.
### FILE NAME(S)
* aboutpage.html
* AboutPageController.java
* mainscreen.html
### LINE NUMBER(S)
1. All line numbers (aboutpage.html)
2. All line numbers (AboutPageController.java)
3. 90-94 (mainscreen.html)
### CHANGE(S)
1. Created aboutpage.html, added a title and company description, and linked it back to the main screen
2. Created AboutPageController.java to attribute aboutpage.html to the pathname "/about"
3. Added a link from the main page to the about page

## SECTION E
### PROMPT
Add a sample inventory appropriate for your chosen store to the application. You should have five parts and five 
products in your sample inventory and should not overwrite existing data in the database.
### FILE NAME(S)
* BootStrapData.java
* OutsourcedPart.java
### LINE NUMBER(S)
1. 19-25 (OutsourcedPart.java)
2. 42-69 (BootStrapData.java)
3. 73 & 75 (BootStrapData.java)
### CHANGE(S)
1. Added a parameterized constructor for OutsourcedPart to create its objects with more ease
2. I replaced all the code in this section with code that added the parts and products I needed for my shop if their
respective repositories were empty
3. Added spaces to the print statements to make them more clear

## SECTION F
### PROMPT
Add a “Buy Now” button to your product list. Your “Buy Now” button must meet each of the following parameters:
* The “Buy Now” button must be next to the buttons that update and delete products.
* The button should decrement the inventory of that product by one. It should not affect the inventory of any of the 
associated parts.
* Display a message that indicates the success or failure of a purchase.
### FILE NAME(S)
* mainscreen.html
* confirmationbuyproduct.html
* unsuccessfulbuyproduct.html
* AddProductController.java
### LINE NUMBER(S)
1. 85 (mainscreen.html)
2. All line numbers (confirmationbuyproduct.html)
3. All line numbers (unsuccessfulbuyproduct.html)
4. 129-146 (AddProductController.java)
### CHANGE(S)
1. Added a "Buy Now" button in the products section
2. Created the page that would show if the product purchase was successful
3. Created the page that would show if the product purchase was unsuccessful
4. Built the logic to ensure the "Buy Now" button worked with the right product and led to the correct outcome (show that
the purchase was successful or unsuccessful based on the product inventory)

## SECTION G
### PROMPT
Modify the parts to track maximum and minimum inventory by doing the following:
* Add additional fields to the part entity for maximum and minimum inventory.
* Modify the sample inventory to include the maximum and minimum fields.
* Add to the InhousePartForm and OutsourcedPartForm forms additional text inputs for the inventory so the user can set 
the maximum and minimum values.
* Rename the file the persistent storage is saved to.
* Modify the code to enforce that the inventory is between or at the minimum and maximum value.
### FILE NAME(S)
* Part.java
* OutsourcedPart.java
* InhousePart.java
* BootStrapData.java
* InhousePartForm.html
* OutsourcedPartForm.html
* application.properties
* spring-h2-storage.db.h2.db
* inventoryValueErrorInhouse.html
* inventoryValueErrorOutsourced.html
* inventoryRangeErrorInhouse.html
* inventoryRangeErrorOutsourced.html
* AddInhousePartController.java
* AddOutsourcedPartController.java
### LINE NUMBER(S)
1. 31-34 (Part.java)
2. 44 & 48-49 (Part.java)
3. 52 & 57-58 (Part.java)
4. 93-108 (Part.java)
5. 20 & 25-26 (OutsourcedPart.java)
6. 20-27 (InhousePart.java)
7. 44-48 (BootStrapData.java)
8. 24-29 (InhousePartForm.html)
9. 25-30 (OutsourcedPartForm.html)
10. 6 (application.properties)
11. Everything (spring-h2-storage.db.h2.db)
12. 134-141 (Part.java)
13. All line numbers (inventoryValueErrorInhouse.html)
14. All line numbers (inventoryValueErrorOutsourced.html)
15. All line numbers (inventoryRangeErrorInhouse.html)
16. All line numbers (inventoryRangeErrorOutsourced.html)
17. 41-46 (AddInhousePartController.java)
18. 42-47 (AddOutsourcedPartController.java)
### CHANGE(S)
1. Added fields minInv and maxInv for minimum and maximum inventory values
2. Added minInv and maxInv to parameterized Part constructor #1
3. Added minInv and maxInv to parameterized Part constructor #2
4. Made getters and setters for minInv and maxInv
5. Added minInv and maxInv to parameterized OutsourcedPart constructor 
6. Added a parameterized constructor to InhousePart that includes minInv and maxInv
7. Changed the Part object initializations so that they include minInv and maxInv values
8. Added input boxes for minInv and maxInv
9. Added input boxes for minInv and maxInv
10. Removed the URL line; it was unnecessary and may have caused problems for other users
11. I previously had the database in a file outside of this project's directory. I moved it in here and changed its
name from spring-boot-h2-db to spring-h2-storage.
12. Created methods that can check if the inventory value and its range are valid in a Part object
13. Created the page that would show if the InhousePart inventory value was outside the range of its minimum and maximum 
inventory values
14. Created the page that would show if the OutsourcedPart inventory value was outside the range of its minimum and 
maximum inventory values
15. Created the page that would show if the InhousePart minimum and maximum inventory values were reversed
16. Created the page that would show if the OutsourcedPart minimum and maximum inventory values were reversed
17. Added logic that checks if the inventory range and value are correct and redirects the user to their respective error pages if they aren't
18. Added logic that checks if the inventory range and value are correct and redirects the user to their respective error pages if they aren't

## SECTION H
### PROMPT
### FILE NAME(S)
### LINE NUMBER(S)
### CHANGE(S)

## SECTION I
### PROMPT
### FILE NAME(S)
### LINE NUMBER(S)
### CHANGE(S)

## SECTION J
### PROMPT
### FILE NAME(S)
### LINE NUMBER(S)
### CHANGE(S)