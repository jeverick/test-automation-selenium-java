package utils;


import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;

public class Urls {

    public static int getHTTPResponseStatusCode(String u) throws IOException {
        /**
         * Returns the status code returned by hitting the provided url (u)
         */

        URL url = new URL(u);
        HttpURLConnection http = (HttpURLConnection)url.openConnection();
        return http.getResponseCode();
    }
}
