package nl.fhict.s3.websiteserver;

import java.util.concurrent.atomic.AtomicLong;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ObjectNode;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    private final AtomicLong counter = new AtomicLong();

    @Autowired
    private ObjectMapper jacksonObjectMapper;

    @CrossOrigin(origins = "http://localhost:9001")
    @GetMapping("/login")
    public ObjectNode login(@RequestParam(value = "username", defaultValue = "")String username,
                            @RequestParam(value = "password", defaultValue = "")String password){
        //todo: functionaliteit voor het checken van de credentials
        ObjectNode objectNode = jacksonObjectMapper.createObjectNode();
        if(!(username.isEmpty() || username.equals("") || password.isEmpty() || password.equals(""))){
            if(true){
                String message = "Login geslaagd";
                int id = (int) counter.incrementAndGet();
                String idtosend = String.valueOf(id);
                objectNode.put("id", idtosend);
                objectNode.put("message", message);
                //eindelijk werkend!
                return objectNode;
            }
            String message = "niet geslaagd";
            objectNode.put("message", message);
            return objectNode;
        }
        String message = "Waarde niet meegekregen";
        objectNode.put("message", message);
        return objectNode;
    }
}
