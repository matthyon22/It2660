class Main {
    public static void main(String[] args) {

        // Step 1 - Create a BST tree object called lab5Tree
        BST lab5Tree = new BST();

        // Step 2 - Insert the following values: 13, 22, 36, 5, 48, 17, 39, 2, 26, 40, 29, 34, 10
        lab5Tree.insert(13);
        lab5Tree.insert(22);
        lab5Tree.insert(36);
        lab5Tree.insert(5);
        lab5Tree.insert(48);
        lab5Tree.insert(17);
        lab5Tree.insert(39);
        lab5Tree.insert(2);
        lab5Tree.insert(26);
        lab5Tree.insert(40);
        lab5Tree.insert(29);
        lab5Tree.insert(34);
        lab5Tree.insert(10);

        // Step 3 - Delete the value 17
        lab5Tree.delete(17);

        // Step 4 - Traverse and output the values using inorder (sorted)
        System.out.println("Inorder traversal of BST (sorted):");
        lab5Tree.inOrderTraversal();

        // Step 5 - Traverse and output the values using postorder
        System.out.println("Postorder traversal of BST:");
        lab5Tree.postOrderTraversal();

        // Step 6 - Traverse and output the values using preorder
        System.out.println("Preorder traversal of BST:");
        lab5Tree.preOrderTraversal();

        // Step 7 - Display the result of a search for the value 36
        System.out.println("Searching for value 36...");
        boolean found = lab5Tree.search(36);
        if (found)
            System.out.println("Value 36 was found in the BST!");
        else
            System.out.println("Value 36 was NOT found in the BST.");

        // Step 8 - Display the result of a search for the value 37
        System.out.println("Searching for value 37...");
        boolean found37 = lab5Tree.search(37);
        if (found37)
            System.out.println("Value 37 was found in the BST!");
        else
            System.out.println("Value 37 was NOT found in the BST.");

        // Step 9 - Using the path() method, display the path from the root to 2
        System.out.println("Displaying path from root to 2:");
        lab5Tree.path(2);

        // Step 10 - Using the path() method, display the path from the root to 34
        System.out.println("Displaying path from root to 34:");
        lab5Tree.path(34);
    }
}