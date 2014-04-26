import java.util.ArrayList;

public class PopulatingNextRIghtPointers {
	// Method 1, better method
	public void connect(TreeLinkNode root){
		if(root == null) {
			return;
		}
		if(root.left != null){
			root.left.next = root.right;
		}
		if(root.right != null){
			root.right.next = (root.next == null ? null : root.next.left);
		}
		connect(root.left);
		connect(root.right);
	}
	
	//Method 2, using extra not constant data structure
	/*
    public void connect(TreeLinkNode root) {
        if(root == null){
        	return;
        }
        ArrayList<TreeLinkNode> pre = new ArrayList<TreeLinkNode>();
        ArrayList<TreeLinkNode> cur;
        pre.add(root);
        while(!pre.isEmpty()){
        	cur = new ArrayList<TreeLinkNode>();
        	for(int i = 0; i < pre.size(); ++i){
        		TreeLinkNode n = pre.get(i);
        		if(n.left != null){
        			cur.add(n.left);
        		}
        		if(n.right != null){
        			cur.add(n.right);
        		}
        		n.next =  (i+1 == pre.size()? null : pre.get(i+1));
        	}
        	pre = cur;
        } 
    }*/
}
