package exam;

import java.math.BigDecimal;

/**
 * Created by 42160 on 2017/3/20.
 */
public class Rectangle {
    private double width;
    private double height;

    public Rectangle(double width, double height) {
        BigDecimal d = new BigDecimal(width);
        d.setScale(2);
        this.width = d.doubleValue();
        this.height = height;
    }

    public double area() {
        return height * width;
    }
}
