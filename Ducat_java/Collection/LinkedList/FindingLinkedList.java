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
		return "{"+iData+"}";
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
	public Link delete(int Key)
	{
		Link current=first;
		Link previous=first;
		while(current.iData!=Key)
		{
			if(current.next==null)
			return null;
			else
			{
				previous=current;
				current=current.next;
			}
		}
		if(current==first)
			first=first.next;
			else
			previous.next=current.next;
			return current;
	}
	public Link find(int Key)
	{
		Link current=first;
		while(current.iData!=Key)
		{
			if(current.next==null)
			return null;
			else
			current=current.next;
		}
		return current;
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
public class FindingLinkedList
{
	public static void main(String []s)
	{
		LinkList thelist=new LinkList();
		thelist.insertFirst(22);
		thelist.insertFirst(44);
		thelist.insertFirst(66);
		thelist.insertFirst(88);
		System.out.println(thelist);
		Link ln=thelist.find(44);
		System.out.println(ln);
		Link aLink=thelist.delete(44);
		System.out.println(thelist);	
	}
}