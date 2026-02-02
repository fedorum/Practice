# General

RESTful web service: a web service that adheres to the design principles of the Representational State Transfer (REST) architecture

<br>

# Docker

The main selling point of Docker is its efficiency in setting up applications on a personal computer
- In programming applications, people use different machines with different OS's
- Docker containerises the application and allows it to be run on any machine

Container: a process on the machine that is isolated from the other processes on the machine

Image: provides the isolated file system used by the container - includes dependencies and configuration of the application
- is a read-only template of the application, which turns into an interactive container when it is run on a machine
- can be uploaded to an online repository (similar to GitHub) and downloaded
- contains everything needed to run the application - the source code is not needed and only required to make changes to the code

<b>Think of the container as another computer, and the image as the repository that contains the application</b>

Dockerfile: a configuration (?) file that is used with the 'docker build' command and specifies some instructions:
- FROM [image_name]: specifies the name/ version of the image used in the container
- WORKDIR [path]: specifies the root directory of the application
- COPY [. .]: ?
- RUN [command]: install any application dependencies (i.e. yarn install)
- CMD [command]: runs the command to launch the application (i.e. node index.js)

### Workflow

Docker works with version control systems like GitHub to have continuous deployment and integration
1. After changes in code have been made, they are pushed onto the repository
2. Some dev ops system like GitHub actions will automatically build a docker image using the dockerfile in the repo
3. The image is automatically pushed onto an online repository like Docker Hub
4. Depending on the application, other systems or developers will automatically pull the image to be run as a container

<br>

# Kubernetes

Kubernetes runs multiple instances of Docker - it orchestrates containerisation for multiple hosts

Automatically pulls docker images from an online repository/ registry like Docker Hub

<br>

# Java

Annotation: Text that provides extra info to the compiler about the code

"public class Example {}": The name of the class, 'Example', has to be the same as that of the file

"public record Example {}": A 'record' is a type of final class that is an immutable data carrier
    Why choose it over class? Reduces the boilerplate code needed for initialisation

"public static void main(String[] args) {}": Java looks for this line as the entry point for any app

## Spring Boot

Selling point of the framework is that it speeds up setup and deployment of apps

- Contains an embedded server and makes a single executable jar file (can be run immediately)
- 

The key components of Spring Boot are as follows:

### Dependencies

Are included in the properties of each application and reduce the work needed to integrate functions
- For example, Spring Boot has REST and Frontend dependencies available for easy integration

### Annotations

Define or tag code blocks to perform additional functions at runtime
- Controllers: classes that handle HTTP requests and return a response (POST, GET)
- Beans: are Java objects that are managed by Spring instead of by themselves

The RestController annotation is a specialised version of the Controller annotation
- It returns data directly in the response data in the JSON format (no customisation allowed)
- The Controller annotation is more useful when applications need to have specific and designed html pages

### Displaying Webpages

Webpages are displayed through Controller classes

Annotations are used to specify which webpages to display and when to display them

1. The `@GetMapping` annotation tags a function to be run when a specific URL is first accessed (i.e. "/hello")
    - The tagged function can take in a Model as a parameter and creates a new instance of the related model class (explained next)

- The `@Model` annotation is used to communicate between different pages and requests
    - The Model can 'add' an attribute (i.e. another Java class), which itself contains attributes that can be accessed by the page
    - For example, the Model adds a User class as an attribute, and can set and get the username and password attributes of the User
    - These attributes can then be used for other purposes, like authentication or simply to be displayed on the page

2. The `@PostMapping` annotation tags a function to be run after the a 'post' request is received, usually from a button press or a form submission
    - The tagged function takes in a Model again and its related model class, and adds the class to the Model as an attribute
    - This model class is not a created object, but contains the submitted user variables from the page (usually through a form submission)

### Form Submission

Form submissions can allow users to submit their credentials/ login to applications

1. An html `<form>` uses the `th:object` attribute to bind it to a Model attribute of the same name
    - For example, `th:object="login"` is bound to the `"login"` attribute of the Model
    - This `"login"` attribute of the Model annotation refers to a Model class (i.e. Login)
    - The Login class has its own attributes, which can be set automatically by Spring Boot using attributes of the same name within the form (explained next)

2. The form can contain multiple html `<input>` tags, which have the `th:field` attribute
    - This attribute can refer to attributes of the same name in the Model class
    - For example, `th:field="username"` refers to the username attribute of the Model
    - Spring Boot searches for these connections and allows the Model class to be automatically updated and passed around the program

### User Authentication

The 

### Others

The Spring initialiser is a website that generates a starter codebase for applications
- Speeds up development as the boilerplate code is already written

Spring Boot accesses object properties through a specific naming convention for getter and setter methods
- The first letter and ONLY the first letter of a get and set method (getName/ setName) must be capitalised

The Java Persistence API (JPA) is used in Spring Boot to simplify database interactions
- Similar to how Spring Boot itself operates, annotations are used to tag structures for the JPA to look up (i.e. classes and IDs)
- Instead of having to write code to manipulate data, the JPA repository has in-built functions like save() and find()

The 'redirect:/' keyword before a html page redirects the webpage to a new URL
- This new URL is not necessarily the same name as that of the webpage that is returned, but is a good convention for them to be the same
- This is used so that the webpage does not return to the previous page when refreshed

*SQL reserves the term 'User' for its dataset - rename any existing classes to a different term

<br>

# Thymeleaf

The main selling point of thymeleaf is its 'templating' ability - HTML is rendered in the 

Thymeleaf allows html tags to automatically detect and apply variables from the backen
- For example, reading in the user's name from a Controller class to display on the screen

'Fragments' are blocks of html syntax that can reused in other html files (e.g. inserting a header fragment into other html pages to avoid repeating code)
