package TheDailyByte.Trees;

import java.util.*;

public class Tree_Node {

    public int value;
    public ArrayList<Tree_Node> children = new ArrayList<>();

    public Tree_Node(int value){
        this.value = value;
    }

    public Tree_Node(int value, ArrayList<Tree_Node> children){
        this.value = value;
        this.children = children;
    }

}
