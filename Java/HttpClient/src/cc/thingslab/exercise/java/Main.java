package cc.thingslab.exercise.java;


public class Main {

    public static void main(String[] args) {
        String yourName = ""; //enter your name here
        String surname = ""; //enter your surname here
        String host = "http://httpbin.org";

        String postData = String.format("name=%s&surname=%s",yourName,surname);

        HttpClient client = new HttpClient(host);

        String getIP = client.get("/ip");
        String postMyName = client.post("/post",postData);
        System.out.println("================================================");
        System.out.println("TESTING GET:");
        System.out.println(getIP);
        System.out.println("\n\n\n");
        System.out.println("================================================");
        System.out.println("TESTING POST:");
        System.out.println(postMyName);

    }
}
