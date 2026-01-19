package com.example.rest_service;

// this class represents the text displayed by the webpage application
public record Greeting(long id, String content) {}
// the id increments every time the page is refreshed or the "?name={}" query in the URL is changed
