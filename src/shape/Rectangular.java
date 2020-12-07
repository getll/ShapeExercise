package shape;

import java.util.Random;

/**
 * Class for rectangles, second basic OOP exercise
 * @author Denmar Ermitano
 */
public class Rectangular {
    private int width;
    private int length;
    private String color;
    private static int numOfSide = 4;
    
    /**
     * Default constructor
     */
    public Rectangular() {
        Random rand = new Random();
        int minNum = 1;
        int maxNum = 10;
        
        this.width = rand.nextInt(maxNum) + minNum;
        this.length = rand.nextInt(maxNum) + minNum;
        this.color = "black";
    }
    
    /**
     * Constructor with all data members
     * @param width the width of a rectangular
     * @param length the length of a rectangular
     * @param color the color of a rectangular
     */
    public Rectangular(int width, int length, String color) {
        this.width = width;
        this.length = length;
        this.color = color;
    }
    
    /**
     * Copy constructor
     * @param rectangular the rectangular to copy
     */
    public Rectangular(Rectangular rectangular) {
        this.width = rectangular.width;
        this.length = rectangular.length;
        this.color = rectangular.color;
    }
    
    /**
     * To calculate the area of a rectangular
     * @return the area of the rectangular
     */
    public int calcArea() {
        return width * length;
    }
    
    /**
     * To calculate the perimeter of a rectangular
     * @return the perimeter of the rectangular
     */
    public int calcPerimeter() {
        return (width + length) * 2;
    }
    
    /**
     * to compare two rectangulars
     * @param rectangular another rectangular
     * @return true if the two rectangulars are the same, false if they are not
     */
    public boolean equals(Rectangular rectangular) {
        return this.width == rectangular.width &&
                this.length == rectangular.length &&
                this.color.equals(rectangular.color);
    }
    
    /**
     * To generate a string to represent a rectangular
     * @return the string representing the rectangular
     */
    @Override
    public String toString() {
       String str = "";
       
       str += String.format("%-10s: %d\n", "Width", width);
       str += String.format("%-10s: %d\n", "Length", length);
       str += String.format("%-10s: %s\n", "Color", color);
       str += String.format("%-10s: %d\n", "Area", calcArea());
       str += String.format("%-10s: %d\n", "Perimeter", calcPerimeter());
       
       return str;  
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
