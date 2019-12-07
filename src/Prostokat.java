import static java.lang.Math.*;

public class Prostokat {
    int height ;
    int width;

    public Prostokat(int height, int width) {
        this.height = height;
        this.width = width;
    }

    public int perimeter() {
        return height * width;
    }
    public int diagonal() {
        return (int) sqrt(height*height+width*width);
    }
}

