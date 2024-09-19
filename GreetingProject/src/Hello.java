
public class Hello {
	public static void main(String[] args) {
//		System.out.println("Java is easy");
		Book.notebook.brand();
	}
}

class Book{
	//              reference      object
	static NoteBook notebook = new NoteBook();
}

class NoteBook{
	void brand() {
		System.out.println("Notebook Brand : Classmate");
	}
}