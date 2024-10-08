package ru.gb.family_tree.family_tree;

import java.io.IOException;

public interface FileIO   {
    void saveToFile(String filename) throws IOException;
    void loadFromFile(String filename) throws IOException, ClassNotFoundException;
}