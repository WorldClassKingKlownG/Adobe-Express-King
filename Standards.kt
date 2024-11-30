data class PhotoStandards(
    val dimensions: Map<String, Pair<Int, Int>> = mapOf(
        "portrait" to Pair(600, 800),
        "corporate" to Pair(400, 600),
        "event" to Pair(300, 400)
    ),
    val colorSpace: String = "RGB",
    val resolution: Int = 300
)
