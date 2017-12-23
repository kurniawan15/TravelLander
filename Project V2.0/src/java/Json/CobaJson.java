/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Json;

import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

/**
 *
 * @author Fadhil-PC
 */
public class CobaJson {
    public static void main(String[] args) throws MalformedURLException, IOException {
        String origin = "politekniknegeribandung";
        String destination = "institutteknologibandung";
        String jsonUrl = "https://maps.googleapis.com/maps/api/directions/json?origin="+origin+"&"
                + "destination="+destination+"&alternatives=true&key=AIzaSyBZ2wO0LXgtNJg1xoCveTstgDs1jg2_w7I";
        URL url = new URL(jsonUrl);
        HttpURLConnection request = (HttpURLConnection) url.openConnection();
        
        JsonParser jp = new JsonParser();
        JsonElement root = jp.parse(new InputStreamReader((InputStream) request.getContent()));
        JsonObject rootobj = root.getAsJsonObject();
        
        Gson gson = new Gson();
        Direction d = gson.fromJson(rootobj, Direction.class);
        
        int i=0;
        System.out.println("Route from "+origin+" to "+destination+":");
        for(Route item:d.getRoutes()) {
            System.out.println("\n"+ ++i +". "+item.getSummary());
            for(Leg legItem:item.getLegs()) {
                System.out.println("Distance: "+legItem.getDistance().getText());
                System.out.println("Duration: "+legItem.getDuration().getText());
                System.out.println("Steps: ");
                int j=0;
                for(Step stepItem:legItem.getSteps()) {
                    System.out.println(++j+". ("+stepItem.getStart_location().getLat()+
                            ","+stepItem.getStart_location().getLng()+") to ("
                            +stepItem.getEnd_location().getLat()+","+stepItem.getEnd_location().getLng()+")");
                }
            }
        }
    }
}
