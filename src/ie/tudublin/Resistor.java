package ie.tudublin;

import java.util.ArrayList;

import processing.core.PApplet;
import processing.data.Table;
import processing.data.TableRow;

public class Resistor
{
    //Declaring public fields.
    public int value;
    public int ones;
    public int tens;
    public int hundreds;

    public Resistor(int value) {
        int hundreds = (value / 100);
        int tens = (value - (hundreds * 100)) / 10;
        int ones = value - ((hundreds * 100)  + (tens * 10));
    }

    

    

}