package trees;
import java.util.ArrayList;
import java.util.List;

public class tree {
	// Taken from  https://stackoverflow.com/questions/3522454/java-tree-data-structure
	public class Tree<T> {
	    private Node<T> root;

	    public Tree(T rootData) {
	        root = new Node<T>();
	        root.data = rootData;
	        root.children = new ArrayList<Node<T>>();
	    }

	    public static class Node<T> {
	        private T data;
	        private Node<T> parent;
	        private List<Node<T>> children;
	    }
	}
}
