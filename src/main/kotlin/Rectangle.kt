class Rectangle (var length: Int, var width: Int) {

	fun getPer() = 2 * (length + width)

	fun getArea() = width * length

	fun draw() {
		for (w in 1..length) {
			for (l in 1..width)
				print("* ")
			println()
		}
	}

}