# File Uploader (Replicated)

This is a replication of an application that allows users to upload files to a database

The app authenticates users and assigns access based on their roles (regular/ admin)

## File Structure

Pages contain a 

## Authentication

Users are authenticated using a JSON Web Token (JWT)

    Frontend    -> User submits credentials via form login
                -> Sends request to backend for authentication

    Backend     -> Authenticates the credentials and creates a JWT
                -> Sends it back to the frontend

    Frontend    -> Receives the JWT and stores the JWT somewhere (?)
                -> Sends this same JWT for subsequent requests


