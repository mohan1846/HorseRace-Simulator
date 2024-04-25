/**
 * The Horse class represents a horse participating in a race. 
 * Each horse has a name, symbol, confidence level, distance travelled, 
 * and a status indicating whether it has fallen during the race.
 * 
 * @author Mohanprasad Baskaran
 * @version Final 24/04/24
 */
public class Horse {
    private String name;
    private char symbol;
    private int distanceTravelled;
    private boolean fallen;
    private double confidence;

    //Constructor
    public Horse(char horseSymbol, String horseName, double horseConfidence) {
        this.symbol = horseSymbol;
        this.name = horseName;
        this.confidence = Math.min(Math.max(horseConfidence, 0), 1);
        this.distanceTravelled = 0;
        this.fallen = false;
    }
    // Marks the horse as fallen.
    public void fall() {
        this.fallen = true;
    }
    
    // Retrieves the confidence level of the horse.
    public double getConfidence() {
        return confidence;
    }
    
    // Retrieves the distance travelled by the horse.
    public int getDistanceTravelled() {
        return distanceTravelled;
    }
    
    // Retrieves the name of the horse.
    public String getName() {
        return name;
    }
    
    // Retrieves the symbol of the horse.
    public char getSymbol() {
        return symbol;
    }
    
    // Resets the distance travelled and fallen status of the horse.
    public void goBackToStart() {
        this.distanceTravelled = 0;
        this.fallen = false;
    }
    
    // Checks if the horse has fallen.
    public boolean hasFallen() {
        return fallen;
    }
    
    // Moves the horse forward if it hasn't fallen.
    public void moveForward() {
        if (!hasFallen()) {
            distanceTravelled++;
        }
    }
    
    // Sets the confidence level of the horse within the range [0, 1].    
    public void setConfidence(double newConfidence) {
        this.confidence = Math.min(Math.max(newConfidence, 0), 1);
    }
    
    // Sets the symbol of the horse.
    public void setSymbol(char newSymbol) {
        this.symbol = newSymbol;
    }
}
