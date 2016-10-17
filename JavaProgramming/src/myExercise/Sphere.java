package myExercise;

import java.text.DecimalFormat;

public class Sphere {
    private int diameter;
    private double volume, surfaceArea;
	
    public Sphere() {
    	this.diameter = 1;
    }
    
    public Sphere(int diameter) {
		this.diameter = diameter;
	}
    
    public double calcVolume() {
    	this.volume = (4.0/3.0)*Math.PI*Math.pow(this.diameter/2.0, 3);
    	return this.volume;
    }
    
    public double calcSurfaceArea() {
    	this.surfaceArea = 4*Math.PI*Math.pow(this.diameter/2.0, 2);
    	return this.surfaceArea;
    }

	public int getDiameter() {
		return diameter;
	}
	public void setDiameter(int diameter) {
		this.diameter = diameter;
	}
	
	public String toString() {
		DecimalFormat df = new DecimalFormat("#.###");
		return ("Diameter : " + df.format(this.diameter) + ", Volume : " + df.format(this.calcVolume()) + ", Surface Area : " + df.format(this.calcSurfaceArea()));
	}
}
