public class Die {
    private int sides;
    //sets initial value to -1 in case readLastRoll is called without roll being called first :)
    public static int lastRoll = -1;

//sets die to have numSides number of sides
public Die(int numSides) {
    sides = numSides;
}
//defines Die as having 6 sides if not stated when calling it
public Die() {
    sides = 6;
}
//returns number of sides of the die (6 if not explicitly stated)
public int numSides() {
    return sides;
}
//Sets static int lastRoll and returns it's value (so doesnt return -1 anymore)
public int roll() {
    lastRoll = (int)((Math.random() * sides) + 1);
    return lastRoll;
}
//returns last roll(will be -1 if roll() is not called)
public static int readLastRoll() {
    return lastRoll;
}

}
