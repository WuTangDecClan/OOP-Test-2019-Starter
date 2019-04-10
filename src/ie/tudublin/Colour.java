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
        //this(tr.getString("colour"), tr.getFloat("r"), tr.getFloat("g"), tr.getFloat("b"), tr.getFloat("value"));
        
        colour = tr.getString("Display Name");
        r = tr.getFloat("r");
        g = tr.getFloat("g");
        b = tr.getFloat("Zg");
        value = tr.getFloat("value");
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

    /**
     * @return the r
     */
    public float getR() {
        return r;
    }

    /**
     * @param r the r to set
     */
    public void setR(float r) {
        this.r = r;
    }

    /**
     * @return the g
     */
    public float getG() {
        return g;
    }

    /**
     * @param g the g to set
     */
    public void setG(float g) {
        this.g = g;
    }

    /**
     * @return the b
     */
    public float getB() {
        return b;
    }

    /**
     * @param b the b to set
     */
    public void setB(float b) {
        this.b = b;
    }

    /**
     * @return the value
     */
    public float getValue() {
        return value;
    }

    /**
     * @param value the value to set
     */
    public void setValue(float value) {
        this.value = value;
    }

}