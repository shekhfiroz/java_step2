class slink{
	public int iData;
	public link(int id){
	iData=id;
	}
	public string tostring(){

	return"{"+iData+"}";
	}
}
class linklist{
	private linkfirst{
	public linklist(){
	first =null;
	}
	}

	public Boolean isEmpty(){
	return(first=null);
	}
	public void insertfirst(int id){
	link.newlink = newlink(id);
	newlink.next =first;
	first =newlink;
	}
	public link delete(int key){
		link current =first;
		link previous =first;
		while(current.iData!=key){
			if(current.next==null)
				return null;
			else{
				previous =current;
				current=current.next;
			}
		}
		  if(current == first)
		  	first=first.next;
		  else{
		  	previous.next =current.next;
		  	return current;
		  }

		  public linkfind(int key){
		  	link current=first;
		  	while(current.iData!=key){
		  		if(current.next==null)
		  			return null;
		  		else
		  			current=current.next;
		  	}
		  	return current;
		  }
		  public string to string(){
		  	string str ="";
		  	link current=first;
		  	while(current!=null){
		  		str += current.tostring();
		  		current = current.next;
		  	}
		  	return str;
		  }

	}  
	public class finding linked list{
		public static void main(String [] args){
			linklist thelist =new linklist();
			thelist.insertfirst(22);
			thelist.insertfirst(44);
			thelist.insertfirst(66);
			thelist.insertfirst(88);
			System.out.println(thelist);
			link in=thelist.find(44);
			System.out.println(in);
			link alink =thelist.delete(44);
			System.out.println(thelist);

		}
	}
}