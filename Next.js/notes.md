# Next.js React

Next.js is a framework that builds off of React (a JavaScript library)

Its core function is to make web interaction more efficient for users

It adds the following features to React to address common problems in development 

## Rendering

### Partial Rendering

When navigating between pages, next.js does not re-render the layout

- Next.js splits code and prefetches it, making navigation between pages feel near-instant
- This also isolates pages from one another - so if one throws an error, the rest of the website will still work

### Static vs Dynamic Rendering

?

## Routing

A next.js application uses its file structure as its URL routes, under the `app` folder

- For example, an application that allows users to view private data might require a login page, a home page, and a data page

- These components would be individual sub-folders under the `app` folder and correspond to the actual URLs of the application (i.e. /login, /home, /data)

### Folder and File Types

Folders can be routable or non-routable (i.e. have a URL or not) depending on the files they contain:

| File | Usage
| - | -
| `page` | Displays the UI for the folder it is located in (e.g. `/login`)
| `route` | Creates an API endpoint for the folder/ URL <br> Handles incoming HTTP requests like GET, POST, etc.
| `layout` | Displays a shared UI that is common between folders (e.g. a navigation bar)
| `error` | Displays an error UI when a thrown error is caught

### Folder Names

Prefixing a folder name with an underscore (e.g. `_database`) makes it non-routable

- For example, a 

Enclosing a folder name with parentheses prevents it from affecting the URL path of the folders it contains

- For example, a `(marketing)` folder that contains a routable `about` folder will only display a `/about` URL when it is accessed 

Enclosing a folder name with square brackets makes it routes dynamic

- For example, if a route/ page URL needs to be based on something inputted by the user, like a blog post or ID, a Dynamic Route Segment can be used

*Side note: UUIDs are longer versions of id values (i.e. '2c2b-213n' vs just '2')<br>
They make the URL longer to eliminate the risk of ID collision*

## Optimisation

Display elements like fonts and images can affect the performance of a web application

- For example, fonts and images are fetched at build time and may take a long time
- After they are loaded, they may shift the layout of the surrounding elements

Next.js optimises these elements by loading them with the `next/font` module and `<Image>` component at build time

- These ensure that the elements are served alongside static assets so that there are no additional network requests

### Server Components

Next.js uses React Server Components, which can query a database directly without the need for an API layer

- Server Components run on the server and allow expensive data fetches to be kept within the server (improves performance)

### Server Actions

Next.js also uses React Server Actions to run asynchronous code directly on a server (no APIs endpoints are needed)

- Increases security of applications as they can encrypt data, check inputs, etc.

<br>

# Tailwind CSS

Tailwind is a framework for CSS

It adds pre-built classes that can be added to HTML tags for instant styling

Reduces the time spent configuring CSS classes and styles

<br>

# JWT Authentication

A JSON Web Token (JWT) is a method of a authenticating users in web applications

The token contains three encoded parts for the authentication:

1. 

The authentication is a form of stateless architecture that stores the token in the client, which is repeatedly used for authentication requests in the session
