package entities;

import com.fasterxml.jackson.annotation.JsonProperty;
import jdk.nashorn.internal.objects.annotations.Getter;
import jdk.nashorn.internal.objects.annotations.Setter;

import java.util.List;

public class Color {

    @JsonProperty(value = "color")
    private String color;

    @JsonProperty(value = "category")
    private String category;

    @JsonProperty(value = "type")
    private String type;

    @JsonProperty(value = "code")
    private List<Code> code;
}
