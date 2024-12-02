package aggregateComposite;


//Component Interface
interface FileSystemComponent {
 void display(String indent);
}

//Leaf Class: File
class File implements FileSystemComponent {
 private String name;

 public File(String name) {
     this.name = name;
 }

 @Override
 public void display(String indent) {
     System.out.println(indent + "- File: " + name);
 }
}

//Composite Class: Folder
class Folder implements FileSystemComponent {
 private String name;
 private java.util.List<FileSystemComponent> components = new java.util.ArrayList<>();

 public Folder(String name) {
     this.name = name;
 }

 public void addComponent(FileSystemComponent component) {
     components.add(component);
 }

 public void removeComponent(FileSystemComponent component) {
     components.remove(component);
 }

 @Override
 public void display(String indent) {
     System.out.println(indent + "+ Folder: " + name);
     for (FileSystemComponent component : components) {
         component.display(indent + "  ");
     }
 
    }
}

public class CompoEXamp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  // Creating files
	     File file1 = new File("File1.txt");
	     File file2 = new File("File2.txt");
	     File file3 = new File("File3.txt");

	     // Creating folders
	     Folder folder1 = new Folder("Folder1");
	     Folder folder2 = new Folder("Folder2");
	     Folder rootFolder = new Folder("RootFolder");

	     // Building the file system structure
	     folder1.addComponent(file1);
	     folder1.addComponent(file2);

	     folder2.addComponent(file3);

	     rootFolder.addComponent(folder1);
	     rootFolder.addComponent(folder2);

	     // Displaying the structure
	     rootFolder.display("");

	}

}
