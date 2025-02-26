import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class AikidoTrackerTest {
    private AikidoTracker tracker;

    @BeforeEach
    void setUp() {
        tracker = new AikidoTracker();
    }

    @Test
    void testAddSession() {
        tracker.addSession("2024-02-01", 90);
        assertEquals(90, tracker.getTotalPracticeTime());
        assertEquals(1, tracker.sessions.size());
    }

    @Test
    void testTotalPracticeTimeCalculation() {
        tracker.addSession("2024-02-01", 90);
        tracker.addSession("2024-02-02", 60);
        assertEquals(150, tracker.getTotalPracticeTime());
    }

    @Test
    void testGraduationEligibilityByTime() {
        for (int i = 0; i < 72; i++) {
            tracker.addSession("2024-02-01", 90);
        }
        assertTrue(tracker.checkGraduationEligibility());
    }

    @Test
    void testGraduationEligibilityBySessionCount() {
        for (int i = 0; i < 100; i++) {
            tracker.addSession("2024-02-01", 60);
        }
        assertTrue(tracker.checkGraduationEligibility());
    }

    @Test
    void testNotEligibleInitially() {
        assertFalse(tracker.checkGraduationEligibility());
    }

    @Test
    void testGetDate() {
        TrainingSession session = new TrainingSession("2024-02-01", 90);
        assertEquals("2024-02-01", session.getDate());
    }

    @Test
    void testGetDuration() {
        TrainingSession session = new TrainingSession("2024-02-01", 90);
        assertEquals(90, session.getDuration());
    }
}
