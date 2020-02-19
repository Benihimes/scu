import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import entities.Color;
import entities.Colors;

import java.io.File;
import java.io.IOException;
import java.util.List;

public class ColorsParser {

    private static final String PATH_TO_COLORS = "C:\\Users\\79161\\IntelliJIDEAProjects\\scu\\src\\main\\java\\colors.json";

    public static Colors parseColors() throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        File file = new File(PATH_TO_COLORS);
        return mapper.readValue(file,new TypeReference<List<Color>>(){});
    }

}
