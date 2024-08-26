package ru.gb.family_tree;

import ru.gb.family_tree.family_tree.FamilyTree;
import ru.gb.family_tree.human.Human;
import ru.gb.family_tree.human.Gender;
import ru.gb.family_tree.writer.FileHandler;

import java.time.LocalDate;

public class Main implements FamilyTreeView {
    private FamilyTreeModel model;
    private static FamilyTree<Human> familyTree;

    public Main() {
        model = new FamilyTreeModel();
    }

    public void addHumanToFamilyTree(Human human) {
        model.addHuman(human);
    }

    public void fetchChildrenOfFather(Human father) {
        List<Human> children = model.getChildrenOfFather(father);
        showChildrenOfFather(children);
    }

    public void fetchChildrenOfMother(Human mother) {
        List<Human> children = model.getChildrenOfMother(mother);
        showChildrenOfMother(children);
    }

    @Override
    public void showChildrenOfFather(List<Human> children) {
        System.out.println("Children of Father:");
        for (Human child : children) {
            System.out.println(child.getFirstName() + " " + child.getLastName());
        }
    }

    @Override
    public void showChildrenOfMother(List<Human> children) {
        // Update the UI to show the children of the mother.
        // For example, display a list of children's names.
        System.out.println("Children of Mother:");
        for (Human child : children) {
            System.out.println(child.getFirstName() + " " + child.getLastName());
        }
    }
    public static void main(String[] args) {
        Main main = new Main();

        // Создаем несколько объектов Human
        Human father = new Human("Oleg", "Ivanov", LocalDate.of(1970, 5, 10), Gender.MALE);
        Human mother = new Human("Olga", "Ivanova", LocalDate.of(1975, 8, 15), Gender.FEMALE);
        public static void main(String[] args) {
            child2.setFather(father);
            child2.setMother(mother);

            main.addHumanToFamilyTree(father);
            main.addHumanToFamilyTree(mother);
            main.addHumanToFamilyTree(child1);
            main.addHumanToFamilyTree(child2);

            main.fetchChildrenOfFather(father);
            main.fetchChildrenOfMother(mother);

            // Определяем связи между родителями и детьми с помощью класса Communications
            Communications relationship1 = new Communications(father, child1, "Father-Daughter");
            Communications relationship2 = new Communications(mother, child1, "Mother-Daughter");
            public static void main(String[] args) {
                System.out.println(relationship4);

                // Создаем FamilyTree и добавляем людей
                FamilyTree<Human> familyTree = new FamilyTree<>();
                familyTree.addHuman(father);
                familyTree.addHuman(mother);
                familyTree.addHuman(child1);
                familyTree.addHuman(child2);
                // FamilyTree<Human> familyTree = new FamilyTree<>();
                // familyTree.addHuman(father);
                // familyTree.addHuman(mother);
                // familyTree.addHuman(child1);
                // familyTree.addHuman(child2);

                // Сохраняем FamilyTree в файл
                FileHandler<Human> fileHandler = new FileHandler<>(familyTree);
                 public static void main(String[] args) {
                    System.out.println(child);
                }
            }

        }}