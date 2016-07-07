class link{
	public int iData;
	public link next;
	public link (int id){
    iData=id;
	}

public String toString(){
	return"{"+iData+"}";
}

class linklist{

	private linkfirst;
	public linklist(){
		first =null;
	}
}
public boolean isEmpty(){
	return(first == null);
}

public void insertfirst(int id){
	link newlink=newlink;
	newlink.next=first;
	first =newlink;
}

public String linkDeletefirst(){
	linktemp=first;
	first=firstnext;
	return temp;
} 

public String toString(){
	string str =" ";
	while(current!=null)
		current =current.toString();
	    current =current.next;
	    return string;
}

public class mylinkedlist{

}

public static void main(String[] args){
	linklist thelist =new linklist();
	thelist.insertfirst(22);
	thelist.insertfirst(44);
	thelist.insertfirst(66);
	thelist.insertfirst(88);
    System.out.println(thelist);
    System.out.println(thelist.Deletefirst);
    System.out.println(thelist);
    while(!thelist.isEmpty()){
	link alink = thelist.Deletefirst();

	System.out.println("Deleted"+ alink);
	System.out.println(" ");
 }
   System.out.println(thelist);
}
}



