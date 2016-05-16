public class BinaryTree{
	//data field
	int size = 0;
	Node own;
	//define Node
	public class Node<E> { 
		E element; 
		Node<E> left;
		Node<E> right;
		
		public Node(E e) { 
		element = e;
		} 
	}
	//pass each number to judge method
	public BinaryTree(int num[]){ 
		for(int i = 0 ; i < 20 ; i++){
			judge(num[i]);
		}
	}
	//judge its situation
	public void judge(int num){
		//if their is nothing in the sort, create a new node
		if(size == 0){
			own = new Node(num);
			size++;
		}
		//if their is not empty,compare the number and decide which direction to go
		if(size > 0){
			if(num < (int)own.element){
				addleft(num,own);
			}
			else{
				addright(num,own);
			}
		}
	}
	//add to the left side
	public void addleft(int num,Node node){
		//if it's empty, create a new node on the left side
		if(node.left == null){
			node.left = new Node(num);
			size++;
		}
		//if it isn't empty, decide which direction to go
		else{
			if(num > (int)((node.left).element)){
				addright(num,node.left);
			}
			else{
				addleft(num,node.left);
			}
		}
	
	}
	//add to the right side
	public void addright(int num,Node node){
		//if it's empty, create a new node on the right side
		if(node.right == null){
			node.right = new Node(num);
			size++;
		}
		//if it isn't empty, decide which direction to go
		else{
			if(num > (int)((node.right).element)){
				addright(num,node.right);
			}
			else{
				addleft(num,node.right);
			}
		}
	}
	//display the result by passing the number to the show method
	public void display(){
		//if their are something in the left then print
		if(own.left != null){
			show(own.left);
		}
		//if their are something in the left then print
		if(own.right != null){
			show(own.right);
		}
	}
	//using recursive to display the order
	public void show(Node node){
		if(node.left != null){
			show(node.left);
		}
		System.out.print(node.element + " ");
		if(node.right != null){
			show(node.right);
		}
		
	}
}