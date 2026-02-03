# Next.js React

Next.js is a framework that builds off of React (library)

It adds the following features to React to address common problems in development 

### Rendering



<br>

### Routing

A next.js application uses its file structure as its URL routes, under the `app` folder

- For example, an application that allows users to view private data might require a login page, a home page, and a data page

- These components would be individual sub-folders under the `app` folder and correspond to the actual URLs of the application (i.e. /login, /home, /data)

<br>

Folders can be routable or non-routable (i.e. have a URL or not) depending on the files they contain

| File | Usage
| - | -
| `page` | Displays the UI for the folder it is located in (e.g. `/login`)
| `route` | Creates an API endpoint for the folder/ URL <br> Handles incoming HTTP requests like GET, POST, etc.
| `layout` | Displays a shared UI that is common between folders (e.g. a navigation bar)
|

Prefixing a folder name with an underscore (e.g. `_database`) makes it non-routable

<br>

Enclosing a folder name with parentheses prevents it from affecting the URL path of the folders it contains

- For example, a `(marketing)` folder that contains a routable `about` folder will only display a `/about` URL when it is accessed

<br>

### Optimisation



<br>

# Tailwind CSS

Tailwind is a framework for CSS

It adds pre-built classes that can be added to HTML tags for instant styling

Reduces the time spent configuring CSS classes and styles
