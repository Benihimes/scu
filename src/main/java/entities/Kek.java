package entities;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.xml.bind.annotation.XmlValue;

public class Kek {

    @JsonProperty(value = "fruit")
    private String fruit;

    @JsonProperty(value = "size")
    private String size;

    @JsonProperty(value = "color")
    private String color;

}
