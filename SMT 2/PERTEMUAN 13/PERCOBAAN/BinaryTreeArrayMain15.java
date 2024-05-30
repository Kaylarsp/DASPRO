public class BinaryTreeArrayMain15 {
    public static void main(String[] args) {
        BinaryTreeArray15 bta = new BinaryTreeArray15();
        // int[] data = {6,4,8,3,5,7,9,0,0,0};
        int idxLast = 6;
        // bta.populateData(data, idxLast);

        bta.add(3);
        bta.add(4);
        bta.add(2);
        bta.add(5);
        bta.add(1);

        System.out.print("\nInOrder Traversal    : ");
        bta.traverseInOrder(0);
        System.out.println();

        System.out.print("Pre-order traversal  : ");
        bta.traversePreOrder();
        System.out.println();

        System.out.print("Post-order traversal : ");
        bta.traversePostOrder();
        System.out.println();
    }
}