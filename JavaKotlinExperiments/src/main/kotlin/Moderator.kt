import org.jetbrains.annotations.NotNull

data class Moderator(
    @field:NotNull
    val name: String,
    val conference: Conference
                    ) {
}
