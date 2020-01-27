public class Example {

  public void test() {
    Conference conference = new Conference();

    String conferenceState = conference.getState().name();

    if (conferenceState.equals(ConferenceState.ENDED.name())) {
      conference.getParticipants().forEach(p -> {
        if (!p.getAudioState().name().equals(AudioState.CONNECTED.name())) {
          p.disconnect();
        }
      });
    }
  }
}
