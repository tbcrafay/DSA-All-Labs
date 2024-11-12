import java.util.Objects;

public class Color {
    private int red;
    private int green;
    private int blue;

    public Color(int red, int green, int blue) {
        this.red = red;
        this.green = green;
        this.blue = blue;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;
        Color color = (Color) o;
        return red == color.red && green == color.green && blue == color.blue;
    }

    @Override
    public int hashCode() {
        return Objects.hash(red, green, blue);
    }

    // Getters and setters (optional)

    public static void main(String[] args) {
        Color color1 = new Color(255, 0, 0);
        Color color2 = new Color(255, 0, 0);
        Color color3 = new Color(0, 255, 0);
        System.out.println(color1.equals(color2));
        System.out.println(color1.equals(color3));
    }
}