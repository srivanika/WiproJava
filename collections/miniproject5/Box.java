package collections.miniproject5;

public class Box {

    private double length;
    private double width;
    private double height;

    public Box(double length, double width, double height) {
        this.length = length;
        this.width = width;
        this.height = height;
    }

    public double getLength() {
        return length;
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

    public double getVolume() {
        return length * width * height;
    }

    @Override
    public boolean equals(Object obj) {

        if (this == obj)
            return true;

        if (!(obj instanceof Box))
            return false;

        Box b = (Box) obj;

        return Double.compare(getVolume(), b.getVolume()) == 0;
    }

    @Override
    public int hashCode() {
        return Double.valueOf(getVolume()).hashCode();
    }
}
