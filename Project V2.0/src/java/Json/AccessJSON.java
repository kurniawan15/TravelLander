/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Json;

import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Lenovo
 */
public class AccessJSON {
        private String origin;
        private String destination;
        private String jsonUrl;

    /**
     * @return the origin
     */
    public String getOrigin() {
        return origin;
    }

    /**
     * @param origin the origin to set
     */
    public void setOrigin(String origin) {
        this.origin = origin;
    }

    /**
     * @return the destination
     */
    public String getDestination() {
        return destination;
    }

    /**
     * @param destination the destination to set
     */
    public void setDestination(String destination) {
        this.destination = destination;
    }

    /**
     * @return the jsonUrl
     */
    public String getJsonUrl() {
        return jsonUrl;
    }

    /**
     * @param jsonUrl the jsonUrl to set
     */
    public void setJsonUrl(String jsonUrl) {
        this.jsonUrl = jsonUrl;
    }
        
    
    public int getDistance(){
            int dist = 0;    
            try {
                URL url = new URL(jsonUrl);
                HttpURLConnection request = (HttpURLConnection) url.openConnection();
                
                JsonParser jp = new JsonParser();
                JsonElement root = jp.parse(new InputStreamReader((InputStream) request.getContent()));
                JsonObject rootobj = root.getAsJsonObject();
                
                Gson gson = new Gson();
                Direction d = gson.fromJson(rootobj, Direction.class);
                
                dist = d.getRoutes().get(0).getLegs().get(0).getDistance().getValue();
            } catch (MalformedURLException ex) {
                Logger.getLogger(AccessJSON.class.getName()).log(Level.SEVERE, null, ex);
            } catch (IOException ex) {
                Logger.getLogger(AccessJSON.class.getName()).log(Level.SEVERE, null, ex);
            }
            return dist;
    }
}
