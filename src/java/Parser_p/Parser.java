/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Parser_p;
import org.json.*;

import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author Yagoubi
 */
public class Parser {
    public void ParseUser(String data) {
        try {
            JSONObject obj = new JSONObject(data);
            String firstname=obj.getString("firstname");
        } catch (JSONException ex) {
            Logger.getLogger(Parser.class.getName()).log(Level.SEVERE, null, ex);
        }
      
    }

}
