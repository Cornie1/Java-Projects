/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.prjjson;
import org.json.JSONObject;
import java.io.FileWriter;
import java.io.IOException;
/**
 *
 * @author ajkil
 */
public class PrjJSON {

    public static void main(String[] args) {
        JSONObject personDetails = new JSONObject();
        
        personDetails.put("name", "Aaron");
        personDetails.put("age", 20);
        personDetails.put("city", "PE");
        personDetails.put("are you a student", true);
        
        System.out.println("JSON object created: \n" + personDetails.toString(4));
        
        String fileName = "person.JSON";
        
        try (FileWriter file = new FileWriter(fileName)){
            file.write(personDetails.toString(4));
            file.flush();
            System.out.println("\n successfully wrote JSONObject to person.JSOn file" + fileName);
        } catch (IOException e) {
            System.out.println("\n successfully wrote JSONObject to person.JSOn file" + fileName);
        }
    }
}
