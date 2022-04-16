package tutorial6.task1;

public class Die {
    
    public int getRoll() {
        double randomNumber = Math.random();
        randomNumber *= 6;
        randomNumber++;
        return (int)randomNumber;
    }

}
