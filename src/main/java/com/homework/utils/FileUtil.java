package com.homework.utils;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class FileUtil {

    public static String readSystemPathFile(String filePath) {
        StringBuilder sb = new StringBuilder();
        //java7开始引入的try-with-resource写法
        try (Stream<String> stream = Files.lines(Paths.get(filePath), StandardCharsets.UTF_8)) {
            //给每一行末尾加上换行符
            stream.forEach(s -> sb.append(s).append("\n"));
        } catch (IOException e) {
            e.printStackTrace();
        }
        return sb.toString();
    }



}
