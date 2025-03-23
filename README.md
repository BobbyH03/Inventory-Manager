
Can be visited at http://192.168.40.162:8080/mainscreen

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
Created two new html templates, confirmationbuyproduct and errorbuyproduct to display message if purchase is successful or not  
file: mainscreen.html, lines: 85-86. added Buy Now button that asks to confirm purchase and links to /buyproduct  
file: Product.java, lines: 108-115. added a method to check inventory for product and then delete 1 of said product if purchased  
file: AddProductController.jave, lines: 177-188. added mapping to /buyproduct that uses productID to check if the product can be purchased. which returns either html template to display purchase status

G.  Modify the parts to track maximum and minimum inventory  
file: mainscreen.html, Lines: 38-39 48-49. added minimum and maximum fields  
file: Part.java, lines: 38-38 122-126. File: InhousePart.java and OutsourcedPart.java, lines: 18-19. modified sample inventory to include min and max fields as well as added a default min and max for each part  
file: InhousePartForm.html, lines: 25-35. file: OutsourcedPartForm.html, lines: 25-27. added additional text inputs so the user can set min and max values  
file: application.properties, line 6. renamed the file the persistent storage is saved to
file: Part.java, lines: 100-106. file: InhousePartServiceImpl.java, line: 54 and OutsourcedPartForm.java, line: 52. added a method to make sure the inventory is between min and max values

H.  Add validation for between or at the maximum and minimum fields.  
Created 4 new files. ValidMinimum.java, ValidMaximum.java, MinimumValidator.java, and MaximumValidator.java. These files are used to display an error message for when part is above the maximum or below the minimum.  
file: Part.java, lines: 4-5 and 23-24. imported validators  
file: EnufPartsValidator.java, lines: 37-39. displays a message if parts are lower than products  
file: OutsourcedPartForm.html, lines: 31-33. checks for errors and displays them

I.  Add at least two unit tests for the maximum and minimum fields to the PartTest class in the test package.  
file: PartTest.java, lines: 160-176. added two test

J.  Remove the class files for any unused validators in order to clean your code.
file: Part.java, lines: 3, 19. removed delete part validator
file: DeletePartValidator.java and ValidDeletePart.java. Deleted
