package edu.nwmissouri.zoo06group;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.Map;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Controller that handles the default request ("/").
 *
 * Use the new Java 15 text blocks to provide our menu. Thymeleaf:
 * https://spring.io/guides/gs/serving-web-content/
 *
 * @author Indu Chinthakuntla
 */
@Controller
public class ZooIndexController {

    private static final String GREETING_MESSAGE = "Welcome to our Zoo games!";
    private static final String GOODBYE_MESSAGE = "Thank you for visiting our zoo!";
    private static final int NUMBER_ANIMAL_TYPES = 60;

    /**
     * The @GetMapping annotation ensures that HTTP GET requests to / are mapped
     * to the index() method.Example:
     * https://spring.io/guides/gs/serving-web-content/
     *
     *
     * @param idParam - the id provided in the URL
     * @param model - the model that holds information from controller to view
     * @return
     */
    @GetMapping(path = "/")
    public String index(
            @RequestParam(name = "id", required = false, defaultValue = "0") String idParam,
            Model model) {
        model.addAttribute("id", idParam);
        model.addAttribute("name", "World");
        model.addAttribute("greeting", GREETING_MESSAGE);
        model.addAttribute("animalMap", ZooBuildSwitch.getAllAnimalMap());
        model.addAttribute("customAnimalGroup", getCustomAnimalGroup(idParam));
        // associated with index.hmtl in src/main/resources/templates
        return "index";
    }

    /**
     * Map GET request to "/about" to about() method.
     *
     * @return filename from src/main/resources/templates folder
     */
    @GetMapping(path = "/about")
    public String about() {
        return "about";
    }

    /**
     * Map GET request to "/games" to games() method.
     *
     * @return filename from src/main/resources/templates folder
     */
    @GetMapping(path = "/games")
    public String games() {
        return "games";
    }

    /**
     * Map GET request to "/persons" to persons() method.
     *
     * @return filename from src/main/resources/templates folder
     */
//    @GetMapping(path = "/persons")
//    public String persons() {
//        return "persons";
//    }

    /**
     * Map GET request to "/rides" to rides() method.
     *
     * @return filename from src/main/resources/templates folder
     */
//    @GetMapping(path = "/rides")
//    public String rides() {
//        return "rides";
//    }

    /**
     * Map GET request to "/vehicles" to vehicles() method.
     *
     * @return filename from src/main/resources/templates folder
     */
//    @GetMapping(path = "/vehicles")
//    public String vehicles() {
//        return "vehicles";
//    }

    private String getCustomAnimalGroup(String id) {
        // Create a stream to hold the output
        var newStream = new ByteArrayOutputStream();
        var newPrintStream = new PrintStream(newStream);
        // IMPORTANT: Save the old System.out!
        PrintStream old = System.out;
        // Tell Java to use your special stream
        System.setOut(newPrintStream);

        var intID = Integer.parseInt(id);

        switch (intID) {

            case 1 -> {
                CheetahGroup.create();
                CheetahGroup.run();
            }
            
            case 2 -> {
                GiraffeGroup.create();
                GiraffeGroup.run();
            }
            
            case 3 -> {
                HippopotamusGroup.create();
                HippopotamusGroup.run();
            }
            
            case 4 -> {
                LigerGroup.create();
                LigerGroup.run();
            }
            
            case 5 -> {
                LionGroup.create();
                LionGroup.run();
            }
            
            case 6 -> {
                RelayHorseGroup.create();
                RelayHorseGroup.run();
            }
            case 7 -> {
                KnockingGame k= new KnockingGame();
                
                k.resultOfGame();
                k.onlineBooking();
                KnockingGame.hit();
            }
            
            case 8 -> {
                JungleCruze k= new JungleCruze();
               
                k.resultOfGame();
                k.onlineBooking();
                JungleCruze.speed();
            }
            case 9 -> {
                JungleRiveBattle k= new JungleRiveBattle();
        
                k.resultOfGame();
                k.onlineBooking();
               
            }
            
            case 10 -> {
                RockClimbing k= new RockClimbing();
                
                k.resultOfGame();
                k.onlineBooking();
                RockClimbing.climb();
            }
            case 11 -> {
                RollerCoaster k= new RollerCoaster();
                
                k.resultOfGame();
                k.onlineBooking();
                RollerCoaster.rotations();
            }
            case 12 -> {
                ShootingArcade k= new ShootingArcade();
                
                k.resultOfGame();
                k.onlineBooking();
                ShootingArcade.speed();
            }
            case 13 -> {
                SkeeBallGame k= new SkeeBallGame();
                
                k.resultOfGame();
                k.onlineBooking();
                SkeeBallGame.goal();
            }
            case 14 -> {
                SplashMountain k= new SplashMountain();
               
                k.resultOfGame();
                k.onlineBooking();
                SplashMountain.speed();
            }
            
            case 15 -> {
                PanicRoom k= new PanicRoom();
               
                k.resultOfGame();
                k.onlineBooking();
                PanicRoom.darkRoom();
            }
           
          default -> {
            }
        }

        // Put things back
        System.out.flush();
        System.setOut(old);
        String stringOutput = newStream.toString();
        return stringOutput;
    }

}
