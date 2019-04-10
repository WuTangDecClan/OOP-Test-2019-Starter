package ie.tudublin;

import java.util.ArrayList;

import processing.core.PApplet;
import processing.data.Table;
import processing.data.TableRow;

public class Colour
{
    //Declaring public fields.
    public float r;
    public float g;
    public float b;
    public float value;
    //Declaring private fields.
    private String colour;

    //Constructor that takes inital values & assigns them to the fields.
    public Colour(TableRow tr)
    {
        this(tr.getString("colour"), tr.getFloat("r"), tr.getFloat("g"), tr.getFloat("b"), tr.getFloat("value"));
    }


    /**
     * @return the colour
     */
    public String getColour() {
        return colour;
    }

    /**
     * @param colour the colour to set
     */
    public void setColour(String colour) {
        this.colour = colour;
    }

    //Approriate toString() method.
    public String toString()
    {
        return r + "\t" + "\t" + b + "\t" + g + "\t" + value + "\t" + colour;  
    }

}