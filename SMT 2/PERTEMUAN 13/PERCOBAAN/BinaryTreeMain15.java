public class BinaryTreeMain15 {
    public static void main(String[] args) {
        BinaryTree15 bt = new BinaryTree15();
        bt.addRec(6);
        bt.addRec(4);
        bt.addRec(8);
        bt.addRec(3);
        bt.addRec(5);
        bt.addRec(7);
        bt.addRec(9);
        bt.addRec(10);
        bt.addRec(15);
        System.out.println();
        System.out.println("Nilai terkecil      : " + bt.minValue());
        System.out.println("Nilai terbesar      : " + bt.maxValue());
        System.out.print("Data Leaf           : ");
        bt.displayLeafData();
        System.out.println();
        System.out.println("Jumlah Data Leaf    : " + bt.countLeaf());
        System.out.print("PreOrder Traversal  : ");
        bt.traversePreOrder(bt.root);
        System.out.println("");
        System.out.print("inOrder Traversal   : ");
        bt.traverseInOrder(bt.root);
        System.out.println("");
        System.out.print("PostOrder Traversal : ");
        bt.traversePostOrder(bt.root);
        System.out.println("");
        System.out.println("Find Node : "+bt.find(5));
        System.out.println("Delete Node 8 ");
        bt.delete(8);
        System.out.println("");
        System.out.print("PreOrder Traversal  : ");
        bt.traversePreOrder(bt.root);
        System.out.println("");
    }
}