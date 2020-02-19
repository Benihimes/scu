package entities;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class Code {

    @JsonProperty(value = "rgba")
    private int[] rgba;

    @JsonProperty(value = "hex")
    private String hex;

    public int[] getRgba() {
        return rgba;
    }

    public void setRgba(int[] rgba) {
        this.rgba = rgba;
    }

    public String getHex() {
        return hex;
    }

    public void setHex(String hex) {
        this.hex = hex;
    }
}
