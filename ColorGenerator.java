import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class ColorGenerator {

    private Map<String, Color> colors = new LinkedHashMap<>();

    public ColorGenerator() {  
        colors.put("red", new Color(
            "Red", "Green", "Red-Orange", "Red-Yellow-Blue"));

        colors.put("blue", new Color(
            "Blue", "Orange", "Blue-Green", "Blue-Red-Yellow"));

        colors.put("yellow", new Color(
            "Yellow", "Purple", "Yellow-Orange", "Yellow-Red-Blue"));

        colors.put("green", new Color(
            "Green", "Red", "Yellow-Green", "Green-Orange-Purple"));

        colors.put("orange", new Color(
            "Orange", "Blue", "Red-Orange", "Orange-Green-Purple"));

        colors.put("purple", new Color(
            "Purple", "Yellow", "Blue-Purple", "Purple-Green-Orange"));

    }

    public Color getColor(String name) {
        return colors.get(name.toLowerCase());
    }

    public Set<String> getAvailableColors() {
        return colors.keySet();
    }
}