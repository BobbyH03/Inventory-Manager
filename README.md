
# Inventory Manager

## Overview
Inventory Manager is a **custom inventory management system** built using **Spring Boot and Java** for the backend, with **HTML and CSS** for the front end. It is designed for businesses that sell products composed of individual parts, helping them **track, manage, and maintain accurate inventory records**.  

The application allows users to:  
- **Add, update, and delete** products and parts  
- **Enforce inventory constraints** to prevent overstocking or shortages  
- **Process purchases** and adjust inventory levels automatically  

## Features

### 1. Customizable Storefront
- The application is customized for **Performance PCs & Parts**, a fictional store specializing in computer hardware.  
- The **main screen** displays the store name, available products, and their associated parts.  

### 2. Product and Part Management  
- Users can **add, edit, or remove** products and parts from the inventory.  
- Each **product** consists of one or more **parts**, maintaining a clear relationship between components.  
- Inventory levels are **tracked** for both products and parts, ensuring proper stock management.  

### 3. Purchase System  
- Each product has a **“Buy Now” button**, allowing customers to purchase items.  
- When a product is purchased, its stock count is automatically reduced.  
- If a product is out of stock, an **error message** is displayed to prevent overselling.  

### 4. Inventory Constraints  
- Parts include **minimum and maximum inventory thresholds** to prevent stock shortages or overstocking.  
- **Validation** ensures that part inventory levels remain within the defined range.  

### 5. Sample Inventory Data  
- The application includes **preloaded inventory data** with **five products and five parts** to provide an example setup.  
- Sample inventory is **reset every time** the application is restarted to maintain consistency during testing.  

### 6. About Page  
- A dedicated **“About” page** provides details about the store.  
- Includes **easy navigation** between the main screen and the about section.  

### 7. Input Validation and Error Handling  
- Validation is implemented to ensure accurate inventory tracking, including:  
  - **Preventing** products from being created with more parts than available stock.  
  - **Restricting** inventory changes to remain within min/max constraints.  
  - **Displaying appropriate error messages** when invalid data is entered.  

### 8. Unit Testing  
- **Two unit tests** are included to verify that **minimum and maximum inventory constraints** function correctly.  

## Technology Stack  
- **Backend:** Java, Spring Boot  
- **Frontend:** HTML, CSS  
- **Database:** Persistent storage with Spring JPA  
- **Testing:** JUnit  

## Future Enhancements  
- Implement a **database-backed** persistent inventory system.  
- Improve the **user interface** with a more modern design.  
- Add **authentication** and role-based access for inventory management.  
