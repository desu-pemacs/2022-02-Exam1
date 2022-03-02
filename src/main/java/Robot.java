public class Robot {
    private String name;
    private double height;  // height in inches

    /**
     * Constructs a robot with a default name of C3PO that is
     * 67.0 cm tall.
     */
    public Robot(){
        name = "C3PO";
        height = 67.0;
    }

    /**
     * Constructs a robot with a name given by the parameter
     * name that is height tall
     * @param name the name of this Robot
     * @param height the height of this Robot
     */
    public Robot(String name, double height){
        // TODO: replace this line with your code
    }

    /**
     * Returns the name of this Robot.
     * @return a String representing the name of this Robot
     */
    public String getName(){
        return name;
    }

    /**
     * Returns the height of this Robot in inches
     * @return the height of this Robot in inches
     */
    public double getHeightInInches(){
        return height;
    }

    /**
     * Returns the height of this Robot in cm.
     * @return the height of this Robot in cm
     */
    public double getHeightInCentiMeters(){
        // use 1in = 2.54cm
        // TODO: replace this line with your code
    }

    /**
     * Sets the name of this Robot
     * @param name a string representing the new name of this Robot
     */
    public void setName(String name){
        this.name = name;
    }

    /**
     * Sets the new height of this Robot in inches
     * @param height the new height of this Robot in inches
     */
    public void setHeight(double height) {
        // TODO: replace this line with your code
    }

    //===================== Do not touch code below this line =================
    /**
     * Converts this Robot to a string representation.
     * @return a String representing this Robot.
     */
    public String toString(){
        return name+":"+height;
    }
}
