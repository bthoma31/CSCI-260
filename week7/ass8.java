package week7;

import java.util.Scanner;

public class ass8 {
    public static void main(String[] args) {
        BT tree = new BT();
        Scanner keyboard = new Scanner(System.in);
        while (true) {
            System.out.println("Enter house address: (type no to exit)");
            if (keyboard.hasNextInt()) {
                tree.insert(keyboard.nextInt());
            } else {
                break;
            }

        }
        System.out.println("The tree is: ");
        tree.inorder();
        System.out.println();
        searchTree(tree);

    }

    public static void searchTree(BT tree) {
        Scanner keyboard = new Scanner(System.in);
        while (true) {
            System.out.println("Enter address to search for (type no to exit) ");
            if (keyboard.hasNextInt()) {
                int address = keyboard.nextInt();
                if (tree.search(address)) {
                    System.out.println("Address found!");
                } else {
                    System.out.println("Address not found!");
                }
            } else {
                break;
            }
        }
    }
}
