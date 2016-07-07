class NotePad{
	public static void main{
	Runtime rt =runtime.getRuntime();
	try{
		rt.exec("notepad.exe");
		rt.exec("c:\\Programmeoffice12\\winword.exe");
	}
	catch(Exception e){
		System.out.println(e);
	}
	System.out.println("Hello SublimeText");
	}
}