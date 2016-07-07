class Link
{
	public int iData;
	public Link next;
	public Link(int id)
	{
		iData=id;
	}
	public String toString()
	{
		return {"+iData+"};
	}
}

class LinkList
{
	private Link first;
	public LinkList()
	{
		first=null;
	}
	public boolean isEmpty()
	{
		return(first==null);
	}
	public void insertFirst(int id)
	{
		Link  newLink=new Link(id);
		newLink.next=first;
		first=newLink;
	}
	public Link deleteFirst()
	{
		Link temp=first;
		first=first.next;
		return temp;
	}
	public String toString()
	{
		String str="";
		Link current=first;
		while(current!=null)
		{
			str+=current.toString();
			current=current.next;
		}
		return str;
	}
}
public class MyLinkedList
{
	public static void main(String []s)
	{
		LinkList thelist=new LinkList();
		thelist.insertFirst(22);
		thelist.insertFirst(44);
		thelist.insertFirst(66);
		thelist.insertFirst(88);
		System.out.println(thelist);
		System.out.println(thelist.deleteFirst());
		System.out.println(thelist);
		while(!thelist.isEmpty())
		{
			Link aLink=thelist.deleteFirst();
			System.out.println("Deleted "+aLink);
		}
		System.out.println(thelist);
	}
}