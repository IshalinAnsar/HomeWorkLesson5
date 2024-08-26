package ru.gb.family_tree.family_tree;

import java.util.List;

public interface FamilyTreeView {
    void showChildrenOfFather(List<Human> children);
    void showChildrenOfMother(List<Human> children);
}
