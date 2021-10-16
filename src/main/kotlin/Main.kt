import java.io.File

fun main() {
	// - Part 1
	val newCar = Car("Toyota", 2020)
	newCar.printDetails()

	// - Part 2
	val firstBook = Book("Game of Thrones", "George R. R. Martin", 45.00)
	firstBook.bookDetails(true)

	val secondBook = Book("We Were Liars", "E. Lockhart", 30.00)
	secondBook.bookDetails(false)

	// - Part 3
	print("Please enter the length: ")
	val length = Integer.valueOf(readLine())

	print("Please enter the width: ")
	val width = Integer.valueOf(readLine())

	println("---------------")

	val rectangle = Rectangle(length, width)
	println("Rectangle perimeter is ${rectangle.getPer()}")
	println("Rectangle area is ${rectangle.getArea()}")

	rectangle.draw()

	// - Part 4
	val file = File("src/main/kotlin")
	val txtFiles = file.listFiles().filter { it.extension == "txt" }

	// - Part 5
	val isReadable = if (file.canRead()) "readable" else "unreadable"
	val isWriteable = if (file.canWrite()) "writeable" else "unwritable"

	println("File ${file.name} is $isReadable and $isWriteable")
}