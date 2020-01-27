class Example {

  fun test() {
    val conference = Conference()

    val conferenceState = conference.state!!.name

    if (conferenceState == ConferenceState.ENDED.name) {
      conference.participants!!.forEach { p ->
        if (p.audioState!!.name != AudioState.CONNECTED.name) {
          p.disconnect()
        }
      }
    }
  }
}
