

# WESTERN GOVERNORS UNIVERSITY 
## D287 – JAVA FRAMEWORKS
C.  Customize the HTML user interface for your customer’s application. The user interface should include the shop name, the product names, and the names of the parts.  
File: mainscreen.html, Line: 14. changed title tag to customers store name  
File: mainscreen.html, Line: 19. changed h1 header to Performance PCs & Parts

D.  Add an “About” page to the application to describe your chosen customer’s company to web viewers and include navigation to and from the “About” page and the main screen.  
added a file named about.html to templates folder with information on company lines (12-16) as well as navigation back to the main screen line 20  
file: mainscreen.html, line: 90. added link to about page  
file: mainscreencontroller.java, line: 55-57. added mapping for the about page
 
E.  Add a sample inventory appropriate for your chosen store to the application. You should have five parts and five products in your sample inventory and should not overwrite existing data in the database.  
file: BootStrapData.java lines: 47-107. added 5 in house parts as well as 5 products. Also made sure that the list of parts and projects weren't duplicated and were reset each time the app is ran.

F.  Add a “Buy Now” button to your product list  


G.  Modify the parts to track maximum and minimum inventory  


H.  Add validation for between or at the maximum and minimum fields.  


I.  Add at least two unit tests for the maximum and minimum fields to the PartTest class in the test package.  


J.  Remove the class files for any unused validators in order to clean your code.
