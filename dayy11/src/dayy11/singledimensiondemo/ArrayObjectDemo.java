package dayy11.singledimensiondemo;

public class ArrayObjectDemo {

	public static void main(String[] args) {
		
		//Student s=new Student(0, null)
		
		Student [] arr;
		 //declare memory for 5 object or type students 
		
		arr=new Student[5];
		
		arr[0] = new. Student(101, "Heti");
		arr[1] = new Student(101, "Riya");
		arr[2] = new Student(101, "Piya");
		arr[3] = new Student(101, "Ram");
		arr[4] = new Student(101, "nema");
		//arr[5] = new Student(101 , "shruu"); not store this data 
		
		for(int i=0; i<=arr.length;i++);
		{
			System.out.println("Element at"+ i+);
		}
	}
}
