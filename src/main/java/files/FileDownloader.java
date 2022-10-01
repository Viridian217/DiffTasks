package files;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FileDownloader {
    public static void main(String[] args) throws IOException {
        Path passwords = downloadFile("https://javarush.ru/testdata/secretPasswords.txt", Paths.get("D:/MyDownloads"));

        for (String line : Files.readAllLines(passwords)) {
            System.out.println(line);
        }
    }

    public static Path downloadFile(String urlString, Path downloadDirectory) throws IOException {
        URL url = new URL(urlString);
        String fileName = urlString.split("/")[urlString.split("/").length - 1];
        Path downloadPath = downloadDirectory.resolve(fileName);
        try (InputStream inputStream = url.openStream()) {
            Path tempFile = Files.createTempFile("secretPasswords", ".txt");
            Files.copy(inputStream, tempFile);
            Files.move(tempFile, downloadPath);
            return downloadPath;
        }
    }
}
