package com.yun27jin.stream.b;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class FromDirectoryExample {
    public static void main(String[] args) throws IOException {
        Path path = Paths.get("E:\\workspace\\ACell");
        Stream<Path> stream = Files.list(path);
        stream.forEach(path1 -> System.out.println(path1.getFileName()));
    }
}
