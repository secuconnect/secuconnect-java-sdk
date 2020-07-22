package io.secuconnect.client.cache;

import io.secuconnect.client.auth.tokens.AccessToken;

import java.io.*;
import java.nio.file.FileAlreadyExistsException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FileCache extends CacheItem {

    @Override
    public void set(String name, AccessToken accessToken) {
        createDirectory();
        createFile(name);

        try {
            FileOutputStream file = new FileOutputStream("tmp/" + name + ".ser");
            ObjectOutputStream out = new ObjectOutputStream(file);
            out.writeObject(accessToken);

            out.close();
            file.close();
        } catch (IOException ex) {
            System.out.println("IOException is caught - SET");
        }
    }

    @Override
    public AccessToken get(String name) {
        AccessToken accessToken = null;
        String filename = "tmp/" + name + ".ser";

        Path path = Paths.get(filename);

        if (Files.notExists(path)) {
            return null;
        }

        try (FileInputStream file = new FileInputStream(filename); ObjectInputStream in = new ObjectInputStream(file)) {
            accessToken = (AccessToken) in.readObject();
        } catch (IOException ex) {
            System.out.println("IOException is caught - GET");
        } catch (ClassNotFoundException ex) {
            System.out.println("ClassNotFoundException is caught");
        }


        if (accessToken != null && wasExpiring(accessToken) && !accessToken.getClass().getName().contains("OAuthDeviceToken")) {
            accessToken = null;
        }

        return accessToken;
    }

    @Override
    public void delete(String name) {
        String filename = "tmp/" + name + ".ser";
        Path path = Paths.get(filename);

        try {
            Files.deleteIfExists(path);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void createDirectory() {
        if (!new File("tmp").exists()) {
            File tmp = new File("tmp");
            tmp.mkdir();
        }
    }

    private void createFile(String name) {
        Path path = Paths.get("tmp/" + name + ".ser");

        try {
            Files.createDirectories(path.getParent());
        } catch (IOException e) {
            e.printStackTrace();
        }

        try {
            Files.createFile(path);
        } catch (FileAlreadyExistsException e) {
            return;
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
