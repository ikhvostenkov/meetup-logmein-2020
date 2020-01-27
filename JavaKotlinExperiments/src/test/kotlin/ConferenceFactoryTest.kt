import org.junit.Test


class ConferenceFactoryTest {

  @Test
  fun getConference() {
    val conferenceCall = ConferenceCall()
    for (i in 1..10) {
      println("Conference Call ID: ${conferenceCall.id}")
    }
  }
}
