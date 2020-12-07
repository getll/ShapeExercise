package shape;

/**
 *
 * @author Denmar Ermitano
 */
public class Ellipse {
    private double majorAxis;
    private double minorAxis;

    /**
     * Default constructor with both axis randomly generated in [5, 10]
     */
    public Ellipse() {
        int min = 5;
        int amount = 5;
        
        this.majorAxis = Math.random() * amount + min;
        this.minorAxis = Math.random() * amount + min;
    }

    /**
     * Constructor with all data members
     * @param majorAxis the major axis for the ellipse
     * @param minorAxis the minor axis for the ellipse
     */
    public Ellipse(double majorAxis, double minorAxis) {
        this.majorAxis = majorAxis;
        this.minorAxis = minorAxis;
    }
    
    /**
     * Copy constructor
     * @param ellipse the ellipse to copy
     */
    public Ellipse(Ellipse ellipse) {
        this.majorAxis = ellipse.majorAxis;
        this.minorAxis = ellipse.minorAxis;
    }
    
    /**
     * To calculate the area of an ellipse
     * @return the area of an ellipse
     */
    public double calcArea() {
        return Math.PI * majorAxis * minorAxis;
    }
    
    /**
     * To calculate the perimeter of an ellipse
     * @return the perimeter of an ellipse
     */
    public double calcPerimeter() {
        return 2 * Math.PI * Math.sqrt((Math.pow(minorAxis, 2) + Math.pow(majorAxis, 2)) / 2);
    }
    
    /**
     * To check if an ellipse is a circle
     * @return true if the ellipse is a circle, false if the ellipse is not a circle
     */
    public boolean isCircle() {
        return majorAxis == minorAxis;
    }
    
    /**
     * To check if the value of an axis is valid (bigger than 0)
     * @param axis the axis to check
     * @return true if the axis is valid, false if the axis is not valid
     */
    public boolean isAxisValid(double axis) {
        return axis > 0;
    }
    
    /**
     * To generate a string to represent an ellipse
     * @return the string representing the ellipse
     */
    @Override
    public String toString() {
        String str = "";
        
        str += String.format("%-20s : %.2f\n", "Major-Axis", majorAxis);
        str += String.format("%-20s : %.2f\n", "Minor-Axis", minorAxis);
        str += String.format("%-20s : %.2f\n", "Area", calcArea());
        str += String.format("%-20s : %.2f\n\n", "Perimiter", calcPerimeter());
        
        if (isCircle())
            str += "This ellipse is a circle";
        else
            str += "This ellipse is not a circle";
        
        return str;
    }
    
    /**
     * To compare two ellipses
     * @param ellipse the ellipse you want to compare
     * @return true if both ellipses are the same, false if the ellipses are different
     */
    public boolean equals(Ellipse ellipse) {
        return this.minorAxis == ellipse.minorAxis &&
                this.majorAxis == ellipse.majorAxis;
    }

    public double getMajorAxis() {
        return majorAxis;
    }

    public void setMajorAxis(double majorAxis) {
        if (isAxisValid(majorAxis))
            this.majorAxis = majorAxis;
        else
            System.out.println("The new value must be a positive value.");
    }

    public double getMinorAxis() {
        return minorAxis;
    }

    public void setMinorAxis(double minorAxis) {
        if (isAxisValid(minorAxis))
            this.minorAxis = minorAxis;
        else
            System.out.println("The new value must be a positive value.");
    }
}
