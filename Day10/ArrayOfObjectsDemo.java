package C2TC_CORE_JAVA_PROGRAM.src.Day10;



public class ArrayOfObjectsDemo {

	public static void main(String[] args) {
		// declares an Array of integers.
		Student[] arr;
		// allocating memory for 5 objects of type Student.
		arr = new Student[5];
		// initialize the first elements of the array
		arr[0] = new Student(101,"Sheroll");
		// initialize the second elements of the array
		arr[1] = new Student(102,"Sheroll");
		// so on...
		arr[2] = new Student(103,"Sheroll");
		arr[3] = new Student(104,"Sheroll");
		arr[4] = new Student(105,"Sheroll");
		
		// accessing the elements of the specified array
		for (int i = 0; i < arr.length; i++)
			System.out.println("Element at " + i + " : " + arr[i].getRollNo()+ " " + arr[i].getName());
	}

}


