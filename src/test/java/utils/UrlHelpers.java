package utils;


import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;

public class UrlHelpers {

    public static int getHTTPResponseStatusCode(String u) throws IOException {

        URL url = new URL(u);
        HttpURLConnection http = (HttpURLConnection)url.openConnection();
        return http.getResponseCode();
    }
}
