fun main() {
    fun part1(input: List<String>): Int {
        var calories = 0
        var maxCalories = 0
        for (line: String in input) {
            if (line.isBlank()) {
                if (calories > maxCalories) {
                    maxCalories = calories
                }
                calories = 0
            } else {
                calories += line.toInt()
            }
        }
        return maxCalories
    }

    fun part2(input: List<String>): Int {
        val allCalories = mutableListOf<Int>()
        var calories = 0
        for (line: String in input) {
            if (line.isBlank()) {
                allCalories.add(calories)
                calories = 0
            } else {
                calories += line.toInt()
            }
        }
        return allCalories.sortedDescending().take(3).sum()
    }

    // test if implementation meets criteria from the description, like:
    val testInput = readInput("Day01_test")
    check(part1(testInput) == 24000)

    val input = readInput("Day01")
    println(part1(input))
    println(part2(input))
}