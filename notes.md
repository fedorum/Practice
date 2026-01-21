# General

RESTful web service: a web service that adheres to the design principles of the REST architecture

"Representational State Transfer"

<br>

# Docker

The main selling point of Docker is its efficiency in setting up applications on a personal computer
- In programming applications, people use different machines with different OS's
- Docker containerises the application and allows it to be run on any machine
- While 

Container: a process on the machine that is isolated from the other processes on the machine

Image: provides the isolated file system used by the container - includes dependencies and configuration of the application

<b>Think of the container as another computer, and the image as the repository that contains the application</b>

<b>The image is a read-only template of the application, which turns into an interactive container when it is run on a machine</b>

Dockerfile: a configuration (?) file that is used with the 'docker build' command and specifies some instructions:
- FROM [image_name]: specifies the name/ version of the image used in the container
- WORKDIR [path]: specifies the root directory of the application
- COPY [. .]: ?
- RUN [command]: install any application dependencies (i.e. yarn install)
- CMD [command]: runs the command to launch the application (i.e. node index.js)

## Workflow

1. To build a container image, create and specify a Dockerfile and run the command "docker build"
2. To run the container image, run the command "docker run"
3. To update a container image, 

Docker images can be uploaded to an online repository (similar to GitHub) and downloaded



<br>

# Kubernetes

Related to Docker?

<br>

# Java

Annotation: Text that provides extra info to the compiler about the code
            Used one live above class or code declarations
            "@ThisIsAnAnnotation"

"public class Example {}": The name of the class, 'Example', has to be the same as that of the file

"public record Example {}": A 'record' is a type of final class that is an immutable data carrier
    Why choose it over class? Reduces the boilerplate code needed for initialisation

"public static void main(String[] args) {}": Java looks for this line as the entry point for any app

<br>

## Spring Boot

Selling point of the framework is that it speeds up setup and deployment of apps
- It contains an embedded server and makes a single executable jar file (can be run immediately)

The key components of Spring Boot seem to be:
- Dependencies
    - Are included in the properties of each application and reduce the work needed to integrate functions
    - For example, Spring Boot has REST and Frontend dependencies available for easy integration

- Annotations: define or tag code blocks to perform additional functions at runtime
    - Controllers: classes that handle HTTP requests and return a response (POST, GET)
    - Beans:are Java objects that are managed by Spring instead of by themselves

The RestController annotation is a specialised version of the Controller annotation
- It returns data directly in the response data in the JSON format (no customisation allowed)
- The Controller is more useful when applications need to have specific and designed html pages

An example of a Spring Boot application is a RESTful web service:
1. Web page that displays a JSONObject containing an 'id' and a 'string'
    - The string is able to take a parameter from the URL and override its default value
        - For example, a string with "Hello, {name}!" takes a name value from the "?name=Isaac" portion of the URL
        - The 'id' counts the number of times a new object is made (whenever the name parameter is changed)
2. HTTP requests (POST, GET, etc.) are handled by a controller class

The Spring initialiser is a website that generates a starter codebase for applications
- Speeds up development as the boilerplate code is already written

Spring Boot accesses object properties through a specific naming convention for getter and setter methods
- The first letter and ONLY the first letter of a get and set method (getName/ setName) must be capitalised

The Java Persistence API (JPA) is used in Spring Boot to simplify database interactions
- Similar to how Spring Boot itself operates, annotations are used to tag structures for the JPA to look up (i.e. classes and IDs)
- Instead of having to write code to manipulate data, the JPA repository has in-built functions like save() and find()

*SQL reserves the term 'User' for its dataset - rename any existing classes to a different term

### Workflow

A Controller class is required for each webpage that is displayed
- The GetMapping annotation is used to specify the URL of the page (i.e. "/hello")

