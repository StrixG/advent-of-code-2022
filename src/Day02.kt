fun main() {

    fun part1(input: List<String>): Int {
        var score = 0
        for (line in input) {
            val (enemyMove, move) = line.let { it[0] - 'A' to it[2] - 'X' }
             val outcome = ((move - enemyMove).mod(3) + 1) % 3
             score += move + 1 + outcome * 3
        }
        return score
    }

    fun part2(input: List<String>): Int {
        var score = 0
        for (line in input) {
            val (enemyMove, strategy) = line.let { it[0] - 'A' to it[2] - 'X' }

            val move = (enemyMove + strategy - 1).mod(3)
            score += move + 1 + strategy * 3
        }
        return score
    }

    // test if implementation meets criteria from the description, like:
    val testInput = readInput("Day02_test")
    check(part1(testInput) == 15)

    val input = readInput("Day02")
    println(part1(input))
    println(part2(input))
}