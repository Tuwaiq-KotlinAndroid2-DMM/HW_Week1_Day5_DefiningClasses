class Book (var title: String, var author: String, var price: Double){

	fun bookDetails(inStock: Boolean) {
		println("--- Book Details ---\n" +
				"Name: $title \n" +
				"Author: $author\n" +
				"Price: $$price\n" +
				"Availability: ${if (inStock) "In stock" else "Out of stock"}\n")
	}

}