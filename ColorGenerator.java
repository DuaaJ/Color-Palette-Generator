import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class ColorGenerator {

    private Map<String, Color> colors = new LinkedHashMap<>();

    public ColorGenerator() {

    }

    public Color getColor(String name) {
        return colors.get(name.toLowerCase());
    }

    public Set<String> getAvailableColors() {
        return colors.keySet();
    }
}