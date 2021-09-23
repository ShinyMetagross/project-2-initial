package com.csc205.project2;

public class Pyramid extends Shape
{
    private double length;
    private double width;
    private double height;

    public Pyramid() { this.length = 0; this.width = 0; this.height = 0; }
    public Pyramid(double setLength, double setWidth, double setHeight)
    {
        this.length = setLength;
        this.width = setWidth;
        this.height = setHeight;
    }

    public double getLength() { return length; }
    public double getWidth() { return width; }
    public double getHeight() { return height; }
    public void setLength(double argLength) { this.length = argLength; }
    public void setWidth(double argWidth) { this.width = argWidth; }
    public void setHeight(double argHeight) { this.height = argHeight; }

    public double surfaceArea()
    {
        double sumA = length * width;
        double sumB = length * Math.sqrt(Math.pow(width / 2, 2) + Math.pow(height, 2));
        double sumC = width * Math.sqrt(Math.pow(length / 2, 2) + Math.pow(height, 2));
        return sumA + sumB + sumC;
    }

    public String toString()
    {
        final StringBuilder sb = new StringBuilder("Pyramid {");
        sb.append("length=").append(length);
        sb.append(", width=").append(width);
        sb.append(", height=").append(height);
        sb.append(", surface area=").append(surfaceArea());
        sb.append(", volume=").append(volume());
        sb.append('}');
        return sb.toString();
    }

    public double volume() { return (length * width * height) / 3; }
}
