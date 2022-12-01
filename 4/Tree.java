
public class Tree <T extends Comparable<T>> {
	private T data;
	private Tree<T> left;
	private Tree<T> right;
	
	public Tree(T nodedata) {
		this.data = nodedata;
     	this.left = null;
	    this.right = null;
	}
	
	public T getData() {
		return data;
	}
	public Tree<T> getLeft() {
		return left;
	}
	public Tree<T> getRight() {
		return right;
	}
	
	public void Insert (T newItem) {
		T currentNodedata = this.data;
	    if (currentNodedata.compareTo(newItem) > 0)
	    	//Inserer du cote gauche
	    	{if (this.left == null){
	    		this.left = new Tree<T>(newItem);
	    	}
	        else
	        {
	        	this.left.Insert(newItem);
	        }
	    }
	    else// Inserer du cote droit
	    	{if (this.right == null){
	    		this.right = new Tree<T>(newItem);
	    	}
		    else
		    {
		    	this.right.Insert(newItem);
		    }
		
		    }
	}
	
	public void Parcours()
	{
		if (this.left != null)
		{
			this.left.Parcours();
		}
		System.out.println(this.data.toString());
		if (this.right != null)
		{
			this.right.Parcours();
		}
	}
	

}
