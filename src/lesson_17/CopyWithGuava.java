package lesson_17;

import com.google.common.io.Files;
import java.io.File;
import java.io.IOException;

public class CopyWithGuava implements ICopyUtils {
    @Override
    public void copy(String from, String to) throws IOException {
        File source = new File(from);
        File dest = new File(to);

        Files.copy(source, dest);
    }
}
