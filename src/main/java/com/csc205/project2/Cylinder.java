package com.csc205.project2;

public class Cylinder extends Shape
{
    private double height;
    private double radius;

    public Cylinder() { this.height = 0; this.radius = 0; }
    public Cylinder(double setHeight, double setRadius) { this.height = setHeight; this.radius = setRadius; }

    public double getHeight() { return height; }
    public double getRadius() { return radius; }
    public void setHeight(double argHeight) { this.height = argHeight; }
    public void setRadius(double argRadius) { this.radius = argRadius; }

    public double surfaceArea() { return (2 * Math.PI * radius * height) + (2 * Math.PI * Math.pow(radius, 2)); }

    public String toString()
    {
        final StringBuilder sb = new StringBuilder("Cylinder {");
        sb.append("height=").append(height);
        sb.append(", radius=").append(radius);
        sb.append(", surface area=").append(surfaceArea());
        sb.append(", volume=").append(volume());
        sb.append('}');
        return sb.toString();
    }

    public double volume() { return Math.PI * Math.pow(radius,2) * height; }
}