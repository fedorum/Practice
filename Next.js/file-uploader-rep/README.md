# File Uploader (Replicated)

This is a replication of an application that allows users to upload files to a database

The app authenticates users and assigns access based on their roles (regular/ admin)

<br>

## Program Flow

1. The user logs into the application via a form and is authenticated

2. Once authenticated, the user is directed to the `main` page

    - Here, the user is shown a list of folders they have access to

    - The user can access a folder and view and download any listed files, or upload one

3. Users that have an admin role can access the `admin` page and are redirected to it

    - Here, the admin is shown a list of 'user groups'
    
        - A user group determines the folders a user has access to, and can be assigned to users

    - The admin can add, remove, or rename user groups, or add or remove the folders a user group has access to

    - The admin can add or remove users from a user group

<br>

## File Structure

Pages

<br>

## Authentication

Users are authenticated using a JSON Web Token (JWT)

    Frontend    -> User submits credentials via form login
                -> Sends request to backend for authentication

    Backend     -> Authenticates the credentials and creates a JWT
                -> Sends it back to the frontend

    Frontend    -> Receives the JWT and stores the JWT somewhere (?)
                -> Sends this same JWT for subsequent requests


