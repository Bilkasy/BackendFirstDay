import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;

public class MainClass {

    public static void main(String[]args){
        Logger log = Logger.getLogger(MainClass.class.getName());
        ResourceBundle resourceBundle = ResourceBundle.getBundle("Profile");
        log.setLevel(Level.ALL);

        String profileName = resourceBundle.getString("profileNameRes");

        if(profileName.equals("01")){
            log.info("Hello World from Profile 1!");
        }
        else if (profileName.equals("02")) {
            log.info("Hello World from Profile 2!!");
        }
    }
}