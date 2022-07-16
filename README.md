# Phone Book Application
#### This is a simple Phone/Contact/Address Book back end application which allows the users to perform the CRUD operations.

### The user must enter the details such as:
  <ol>
  <li>First Name</li>
  <li>Surname</li>
  <li>Phone Label</li>
  <li>Phone Number</li>
  <li>Company Name</li>
  <li>Address</li>
  <li>Email ID</li>
  </ol>
  
 #### The user sends the different requests to the Postman API like Post, Get, Put, Delete to perform Add, Fetch, Update and Delete the records.

#### The data is stored in PostgreSQL database.

#### All Field Validations are added and it will validate the user input using SpringBoot annotations.

### Technologies Used
<ul>
  <li>FrameWork - SpringBoot</li>
  <li>API Tool - Postman API</li>
  <li>Database - PostgreSQL</li>
</ul>


### URL links to navigate in Postman API 
  1. To Add -->> http://localhost:7020/api/phonebook/add
  2. To Add many --> http://localhost:7020/api/phonebook/addmany
  3. To View All -->> http://localhost:7020/api/phonebook/viewall
  4. To View By ID -->> http://localhost:7020/api/phonebook/viewById
  5. To View By Name -->> http://localhost:7020/api/phonebook/viewByName
  6. To View By Phone Number -->> http://localhost:7020/api/phonebook/viewBynumber
  7. To Update -->> http://localhost:7020/api/phonebook/update
  8. To Delete by ID -->> http://localhost:7020/api/phonebook/delete
