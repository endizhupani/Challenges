package cc.thingslab.exercise.java;

import java.net.URL;


/**
 * This class should represent a simple HTTP Client. It has only two methods
 * for getting and posting data into a server.
 */
public class HttpClient {

    /**
     * Constructor
     * @param u The base URL of the website/API
     */
    public HttpClient(URL u) {
        //TODO: implement this constructor
    }

    /**
     * Constructor
     * @param url The base URL of the website/API as a string
     */
    public HttpClient(String url)  {
        //TODO: implement this constructor
    }


    /**
     * This method send a GET request to a specified route of the API
     * @param route A string representing the route of the API/website
     * @return The response of the API/website as a string
     */
    public String get(String route) {
        //TODO: implement this method
        return null;
    }


    /**
     * This method sends a POST request to a specified route of the API,
     * posting the data passed as a string
     * @param route A string representing the route where should be POSTed
     * @param data The data passed as a string
     * @return The response of the API/website as a string
     */
    public String post(String route, String data) {
        //TODO: implement this method
        return null;
    }
}
