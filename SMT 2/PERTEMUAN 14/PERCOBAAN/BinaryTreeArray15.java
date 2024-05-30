public class BinaryTreeArray15 {
    int[] data;
    int idxLast;
    int maxSize;

    public BinaryTreeArray15(){
    data = new int[10];
    maxSize = 10;
    idxLast = -1;
    }

    void add(int data) {
        if (idxLast < maxSize - 1) {
            idxLast++;
            this.data[idxLast] = data;
        } else {
            System.out.println("Tree is full!");
        }
    }

    void populateData(int data[], int idxLast){
    this.data = data;
    this.idxLast = idxLast;
    }

    void traverseInOrder(int idxStart){
        if(idxStart <= idxLast){
        traverseInOrder(2*idxStart+1);
        System.out.print(data[idxStart]+" ");
        traverseInOrder(2*idxStart+2);
        }
    }

    void traversePreOrder() {
        traversePreOrder(0);
    }

    void traversePreOrder(int idxStart) {
        if (idxStart <= idxLast) {
            System.out.print(data[idxStart] + " ");
            traversePreOrder(2 * idxStart + 1);
            traversePreOrder(2 * idxStart + 2);
        }
    }

    void traversePostOrder() {
        traversePostOrder(0);
    }

    void traversePostOrder(int idxStart) {
        if (idxStart <= idxLast) {
            traversePostOrder(2 * idxStart + 1);
            traversePostOrder(2 * idxStart + 2);
            System.out.print(data[idxStart] + " ");
        }
    }
}