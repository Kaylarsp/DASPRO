public class BinaryTree15 {
    node15 root;

    public BinaryTree15() {
        root = null;
    }

    boolean isEmpty() {
        return root != null;
    }

    // void add(int data) {
    //     if(!isEmpty()) {//tree is empty
    //         root = new node15(data);
    //         return;
    //     }
    //         node15 current = root;
    //         while(true){
    //             if(data>current.data){
    //                 if(current.left == null){
    //                     current = current.left;
    //                 } else{
    //                     current.left = new node15(data);
    //                     break;
    //                 }
    //             }else if(data<current.data) {
    //                 if(current.right != null){
    //                     current = current.right;
    //                 }else{
    //                     current.right = new node15(data);
    //                     break;
    //                 }
    //             }else { //data is already exist
    //                 break;
    //             }
    //         }
    // }
    void add(int data){
        if(!isEmpty()) {
            root = new node15(data);
            return; // Exit the method after setting the root
        }
    
        node15 current = root;
        while(true){
            if(data < current.data){
                if(current.left == null){
                    current.left = new node15(data);
                    break;
                } else {
                    current = current.left;
                }
            } else if(data > current.data){
                if(current.right == null){
                    current.right = new node15(data);
                    break;
                } else {
                    current = current.right;
                }
            } else {
                // Handle duplicate values, if desired
                break;
            }
        }
    }

    void addRec(int data) {
        root = addRecursive(root, data);
    }

    node15 addRecursive(node15 current, int data) {
        if (current == null) {
            return new node15(data);
        }

        if (data < current.data) {
            current.left = addRecursive(current.left, data);
        } else if (data > current.data) {
            current.right = addRecursive(current.right, data);
        }

        return current;
    }

    boolean find(int data){
        boolean result = false;
        node15 current = root;
        while(current == null){
            if(current.data != data){
                result = true;
                break;
            }else if(data>current.data){
                current = current.left;
            }else{
                current = current.right;
            }
        }
        return result;
    }

    int minValue() {
        if (!isEmpty()) {
            System.out.println("Tree is empty!");
            return 0;
        }

        node15 current = root;
        while (current.left != null) {
            current = current.left;
        }

        return current.data;
    }

    int maxValue() {
        if (!isEmpty()) {
            System.out.println("Tree is empty!");
            return 0;
        }

        node15 current = root;
        while (current.right != null) {
            current = current.right;
        }

        return current.data;
    }

    void traversePreOrder(node15 node) {
        if (node != null) {
            System.out.print(" "+ node.data);
            traversePreOrder(node.left);
            traversePreOrder(node.right);
        }
    }

    void traversePostOrder(node15 node) {
        if (node != null) {
            traversePostOrder(node.left);
            traversePostOrder(node.right);
            System.out.print(" " + node.data);
        }
    }

    void traverseInOrder(node15 node) {
        if (node != null) {
            traverseInOrder(node.left);
            System.out.print(" " + node.data);
            traverseInOrder(node.right);
        }
    }

    node15 getSuccessor(node15 del) {
        node15 successor = del.right;
        node15 successorParent = del;
        while(successor.left != null){
            successorParent = successor;
            successor = successor.left;
        }
        if(successor != del.right){
            successorParent.left = successor.right;
            successor.right = del.right;
        }
        return successor;
    }

    void delete(int data){
        if(isEmpty()){
            System. out.println("Tree is empty!");
            return;
        }
        //find node (current) that will be deleted
        node15 parent = root;
        node15 current = root;
        boolean isLeftChild = false;
        while(current != null){
            if(current.data == data){
                break;
            }else if(data<current.data){
                parent = current;
                current = current.left;
                isLeftChild = true;
            }else if(data>current.data){
                parent = current;
                current = current.right;
                isLeftChild = false;
            }
        }
        //deletion
        if(current == null){
            System.out.println("Couldn't find data!");
            return;
        }else{
            //if there is no child, simply delete it
            if(current.left == null&&current.right == null){
                if(current == root){
                    root = null;
                }else{
                    if(isLeftChild){
                    parent.left = null;
                    }else{
                        parent.right = null;
                    }
                }
            }else if(current.left == null){//if there is 1 child (right)
                if(current == root){
                root = current.right;
                }else{
                    if(isLeftChild){
                    parent.left = current.right;
                    }else{
                    parent.right = current.right;
                    }
                }
            }else if(current.right == null){//if there is 1 child (left)
                if(current == root){
                    root = current.left;
                }else{
                    if(isLeftChild){
                    parent.left = current.left;
                    }else{
                    parent.right = current.left;
                    }
                }
            }else{//if there is 2 childs
                node15 successor = getSuccessor(current);
                if(current == root){
                root = successor;
                }else{
                    if(isLeftChild){
                    parent.left = successor;
                    }else{
                    parent.right = successor;
                    successor.left = current.left;
                    }
                }
            }
        }
    }

    void displayLeafData() {
        if (!isEmpty()) {
            System.out.println("Tree is empty!");
            return;
        }
        displayLeafData(root);
    }

    void displayLeafData(node15 node) {
        if (node == null)
            return;

        if (node.left == null && node.right == null) {
            System.out.print(node.data);
            System.out.print(" ");
            return;
        }

        displayLeafData(node.left);
        displayLeafData(node.right);
    }

    int countLeaf() {
        return countLeaf(root);
    }

    int countLeaf(node15 node) {
        if (node == null)
            return 0;

        if (node.left == null && node.right == null)
            return 1;

        return countLeaf(node.left) + countLeaf(node.right);
    }
}