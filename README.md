# Lords-Engineering-College-Bootcamp

Topics covered in Bootcamp.
1) Identifying the attributes for real world objects.
2) Data types. 
   1) primitive 
      1) int
      2) boolean
      3) float
      4) byte
      5) short
      6) long
   2) non primitive.
      1) Objects
3) Constructors.
    1) parameterised
   2) default
   3) copy
4) Methods/Functions.
5) Access Modifiers.
    1) private
   2) default
   3) protected
   4) public
6) Pojo (getters & setters).
7) toString.
8) Scanner input.
9) Conditional Statements.
10) Loops.
11) Github.
12) Packages.
13) Spring Intializr.
14) Enum.
15) Nested loops.
16) Switch Expressions.
17) Factory Setting in default constructor.
18) Dependency hierarchy in classes.
19) ArrayList as Warehouse.
20) Class level variable.
    1) In FanService Arraylist and counters.
21) Rest API Operations.
    1) get (To retrieve data from server).
    2) put (To update existing data in system).
    3) post (To add data to server/system. Such as creating profile).
    4) delete (To delete any existing data from server).
22) Standard Package Structure for API base application
    1) controller
    2) services
23) Annotations
    1) @RestController
    2) @Service
    3) @GetMapping
    4) @Autowired (Constructor) Constructor Injection

24) Using postman tested "Get" endpoints in FanController
25) CRUD operation (Get, Put, Post, Delete)
26) Map
27) Comparing Map with ArrayList
    1) Time complexity
          1) Arraylist Getbyindex O(1) searching in arraylist O(n) upate by index is O(1) delete by index O(n)
          2) Map all the operation time complexity is o(1)
          3) Map stores in Key Value format
             Hashmap<Key, Value> map = new Hashmap<>();
             map.put
             map.get
             map.remove
28) Virtual Machines

# Assignment Details
    1) Create git repo with your rollnumber and name e.g 1234-abdurraheem
    2) Spring initalizr
    3) package names
       1) controller
       2) services
       3) models
       4) images
   4) Submission date 18th Aug 2025
   5) README.md file should contain instructions to run the project.
      and json sample to for post request
   6)Image folder should contain min 4 images one for each operation


   # Challege Details
     Similar to StudentProfile you need create a class for Task

     Task class will have these attributes
     id, title, description, status
     status enum TODO, IN_PROGRESS, COMPLETED, BLOCKED

     Controller operations
     get, put, post and delete.

     # Good to have
     Get operation get all the tasks created in the api's
