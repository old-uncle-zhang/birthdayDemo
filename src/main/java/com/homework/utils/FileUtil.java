package com.homework.utils;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class FileUtil {

    public static List<String> readFile(String filePath) {
        List<String> content = new ArrayList<>();
        try (Stream<String> stream = Files.lines(Paths.get(filePath), StandardCharsets.UTF_8)) {
            stream.forEach(content::add);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return content;
    }


}
