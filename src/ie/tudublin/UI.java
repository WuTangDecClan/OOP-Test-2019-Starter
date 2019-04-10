package ie.tudublin;

import java.util.ArrayList;

import processing.core.PApplet;
import processing.data.Table;
import processing.data.TableRow;

public class UI extends PApplet

{	public void separate(int value)
	{

		int hundreds = (value / 100);
		int tens = (value - (hundreds * 100)) / 10;
		int ones = value - ((hundreds * 100)  + (tens * 10));
		print(hundreds + ",");
		print(tens + ",");
		println(ones);
	}

	public void settings()
	{
		size(500, 800);
		
		separate(381);
		separate(1);
		separate(92);
	}

	public void setup() 
	{
	}
	//Load Colours method populates the ArrayList from the rows in the colours.csv.
	public void loadColours() {
        Table table = loadTable("colours.csv", "header");

        for (TableRow row : table.rows()) {
            Colour colour = new Colour(row);
            colours.add(colour);
        }
	}
	//printColours method prints the contents of the colours ArrayList to the console.
	public void printColours() {
        for (Colour colour : colours) {
            System.out.println(colour);
        }
    }
	//method that returns the colour object associated with the value parameter.
	//public Colour findColour(int value) {
		
		//return colours;
	//}

	//Load Resistors method populates the ArrayList from the rows in the resistors.csv.
	public void loadResistors()
	{
		Table rr = loadTable("resistors.csv");
		for(TableRow row : rr.rows())
		{
			Resistor resistor = new Resistor(row);
			resistors.add(resistor);
		}
	}



	public void draw()
	{			
		render();
	}
	//Declaring an ArrayList called colours that can hold instances of the Colour class.
	ArrayList<Colour> colours = new ArrayList<Colour>();
	//Declaring an ArrayList called resistors to hold instances of the Resistor class.
	ArrayList<Resistor> resistors = new ArrayList<Resistor>();

	public void render(){
		
		stroke(255);
		float position = height/3;

		line(width/3, position, 100, position);
		rect(100, position, 40, 40); 
		
		line(width/2, position, 200, position);
		rect(100, position, 40, 40); 

		line(width/1, position, 300, position);
		rect(100, position, 40, 40); 
	}

}
