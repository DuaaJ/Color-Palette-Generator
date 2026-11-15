public class Color {

    private String name;
    private String complementary;
    private String analogous;
    private String triadic;

    public Color(String name, String complementary,
                 String analogous, String triadic) {

        this.name = name;
        this.complementary = complementary;
        this.analogous = analogous;
        this.triadic = triadic;
    }

    public String getName() {
        return name;
    }

    public String getComplementary() {
        return complementary;
    }

    public String getAnalogous() {
        return analogous;
    }

    public String getTriadic() {
        return triadic;
    }
}