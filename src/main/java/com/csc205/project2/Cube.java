package com.csc205.project2;

public class Cube extends Shape
{
    private double width;

    public Cube() { this.width = 0; }
    public Cube(double setWidth) { this.width = setWidth; }

    public double getWidth() { return width; }
    public void setWidth(double argWidth) { this.width = argWidth; }

    public double surfaceArea() { return Math.pow(width, 2) * 6; }

    public String toString()
    {
        final StringBuilder sb = new StringBuilder("Cube {");
        sb.append("width=").append(width);
        sb.append(", surface area=").append(surfaceArea());
        sb.append(", volume=").append(volume());
        sb.append('}');
        return sb.toString();
    }

    public double volume() { return Math.pow(width, 3); }
}
