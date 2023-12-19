package finalproject;

/* Class BTNode */
class BTNode {
    BTNode left, right;
    String[] data;

    /* Constructor */
    public BTNode() {
        left = null;
        right = null;
        data = new String[2]; // [0] = class name, [1] = time
    }

    /* Constructor */
    public BTNode(String[] n) {
        left = null;
        right = null;
        data = n;
    }

    /* Function to set left node */
    public void setLeft(BTNode n) {
        left = n;
    }

    /* Function to set right node */
    public void setRight(BTNode n) {
        right = n;
    }

    /* Function to get left node */
    public BTNode getLeft() {
        return left;
    }

    /* Function to get right node */
    public BTNode getRight() {
        return right;
    }

    /* Function to set data to node */
    public void setData(String[] d) {
        data = d;
    }

    /* Function to get data from node */
    public String getTime() {
        return data[1];
    }

    public String getClassName() {
        return data[0];
    }

    public String[] getData() {
        return data;
    }

}