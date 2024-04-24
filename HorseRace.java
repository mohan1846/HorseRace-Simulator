/**
 * The HorseRace class serves as the entry point for the Horse Racing Simulator.
 * It allows users to create a race, add horses to the race, and start the race simulation.
 * 
 * @author Mohanprasad Baskaran 
 * @version 24/04/24
 */
public class HorseRace {

    public static void main(String[] args) {
        int raceLength = 30;

        // Creates a race
        Race race = new Race(raceLength);

        // Creates horses
        Horse horse1 = new Horse('J', "JACKOHORSE", 0.5);
        Horse horse2 = new Horse('D', "DARKHORSE", 0.3);
        Horse horse3 = new Horse('K', "KINGHORSE", 0.8);

        // Add horses to the race
        race.addHorse(horse1, 1);
        race.addHorse(horse2, 2);
        race.addHorse(horse3, 3);

        // Start the race
        race.startRace();


    }
}

