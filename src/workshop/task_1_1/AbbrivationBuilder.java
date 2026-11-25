package workshop.task_1_1;

import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

/**
 * Created by olenasyrota on 6/28/16.
 */
public class AbbrivationBuilder {


    public static String build(List<String> list) {
        // implement function body in order all tests to complete successfully
        return list.stream()
                .filter(s -> s != null && !s.isEmpty())
                .map(s -> s.substring(0, 1))
                .collect(Collectors.joining());
    }

}