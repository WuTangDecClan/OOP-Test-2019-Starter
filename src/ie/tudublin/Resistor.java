package ie.tudublin;

import processing.data.TableRow;

public class Resistor
{
    //Declaring public fields.
    public int value;
    public int ones;
    public int tens;
    public int hundreds;

    //1st Constructor.
    public Resistor(TableRow row)
    {
        
    }

    //Constructor that assigns all fields.
    public Resistor(int value) {
        this.hundreds = (value / 100);
        this.tens = (value - (hundreds * 100)) / 10;
        this.ones = value - ((hundreds * 100)  + (tens * 10));
    }

}