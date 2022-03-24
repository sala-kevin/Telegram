/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package botapitelegram;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.net.URL;
import java.nio.charset.Charset;
import org.json.*;

/**
 *
 * @author User
 */
public class Persona {

    int id;
    boolean is_bot;
    String first_name;
    String username;
    String language_code;

    public Persona() {
        this.id = 0;
        this.is_bot = false;
        this.first_name = "";
        this.username = "";
        this.language_code = "";
    }

    public Persona(int id, boolean is_bot, String first_name, String username, String language_code) {
        this.id = id;
        this.is_bot = is_bot;
        this.first_name = first_name;
        this.username = username;
        this.language_code = language_code;
    }

    static public Persona elaborateJSONObject(JSONObject object) {
        Persona from = new Persona();
        from.id = object.getInt("id");
        from.is_bot = object.getBoolean("is_bot");
        from.first_name = object.getString("first_name");
        from.username = object.getString("username");
        from.language_code = object.getString("language_code");
        return from;
    }

}
