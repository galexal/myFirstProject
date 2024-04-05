package lesson_17;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        ICopyUtils copyWithFileChannel = new CopyWithFileChannel();
        long start = System.currentTimeMillis();
        copyWithFileChannel.copy("file", "fileChannelCopy");
        long end = System.currentTimeMillis();
        System.out.println("Время копирования с помощью FileChannel " + (end - start));

        ICopyUtils copyWithGuava = new CopyWithGuava();
        start = System.currentTimeMillis();
        copyWithGuava.copy("file", "guavaCopy");
        end = System.currentTimeMillis();
        System.out.println("Время копирования с помощью Guava " + (end - start));
    }
}
