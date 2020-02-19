package entities;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;

import java.util.List;

@JsonRootName(value = "colors")
public class Colors {

    @JsonProperty("color")
    private List<Color> color;

    public List<Color> getColor() {
        return color;
    }

    public void setColor(List<Color> color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "МАТЬ ЕБАЛ)";
    }
}
