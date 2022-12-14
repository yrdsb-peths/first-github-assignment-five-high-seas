public class Rectangle
{
    private int width;
    private int height;
 
    public Rectangle(int rectWidth, int rectHeight)
    {
        width = rectWidth;
        height = rectHeight;
    }
    
    public void setWidth(Rectangle other)
    {
        width = other.getWidth();
    }

    public void setHeight(Rectangle other)
    {
        height = other.getHeight();
    }

    public int getPerimeter()
    {
        return (width * 2) + (height * 2);
    }

    public int getArea()
    {
        return width * height;
    }
    
    public int getHeight()
    {
        return height;
    }
    
    public int getWidth()
    {
        return width;
    }
    
    public String toString()
    {
        return "Rectangle with width: " + width + " and height: " + height + 
        ".\nTherefore, the box has dimensions of " + width + "x" + height;
    }
}
