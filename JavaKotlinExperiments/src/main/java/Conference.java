import java.util.List;

import org.jetbrains.annotations.Nullable;

public class Conference {
  private List<Participant> participants;
  private ConferenceState state;

  @Nullable
  public List<Participant> getParticipants() {
    return participants;
  }

  @Nullable
  public ConferenceState getState() {
    return state;
  }
}
