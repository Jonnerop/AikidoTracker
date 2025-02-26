import java.util.ArrayList;
import java.util.List;

class AikidoTracker {
    List<TrainingSession> sessions;
    private int totalPracticeTime;

    public AikidoTracker() {
        this.sessions = new ArrayList<>();
        this.totalPracticeTime = 0;
    }

    public void addSession(String date, int duration) {
        sessions.add(new TrainingSession(date, duration));
        totalPracticeTime += duration;
    }

    public int getTotalPracticeTime() {
        return totalPracticeTime;
    }

    public boolean checkGraduationEligibility() {
        return totalPracticeTime >= 90 * 3 * 4 * 6 || sessions.size() >= 100;
    }
}