class Cylinder{
    private int radius;
    private int height;

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public int getRadius() {
        return radius;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getHeight() {
        return height;
    }
}
public class Practice_6 {
    public static void main(String[] args) {
        Cylinder obj=new Cylinder();
        obj.setRadius(13);
        obj.setHeight(9);

        // Method 1 to print the Radius and Height.
        System.out.println("Method 1 to print the Radius and Height.");
        int r = obj.getRadius();
        System.out.println("Radius is = "+r);
        int h = obj.getHeight();
        System.out.println("Height is = "+h);

        // Method 2 to print the Radius and Height.
        System.out.println("Method 2 to print the Radius and Height.");
        System.out.println("Radius is = "+obj.getRadius());
        System.out.println("Height is = "+obj.getHeight());
    }
}
