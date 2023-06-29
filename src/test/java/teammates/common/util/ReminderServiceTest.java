package teammates.common.util;
import org.testng.annotations.Test;
import static org.junit.Assert.*;


public class ReminderServiceTest {

    @Test
    public void testSimpleReminder() {
        ReminderService reminderService = new ReminderService();
        boolean reminderSent = reminderService.sendReminder("user1", 2);
        assertTrue(reminderSent);
    }

    
    @Test
    public void testSendReminder() {
        ReminderService reminderService = new ReminderService();
        boolean reminderSent = reminderService.sendReminder("user1", 2);
        assertTrue(reminderSent);
    }

    @Test
    public void testSendNoReminder() {
        ReminderService reminderService = new ReminderService();
        boolean reminderSent = reminderService.sendReminder("user2", 10);
        assertFalse(reminderSent);
    }
}

