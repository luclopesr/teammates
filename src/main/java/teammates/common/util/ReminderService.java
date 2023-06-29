package teammates.common.util;

public class ReminderService {

    public boolean sendReminder(String userId, int daysUntilDeadline) {
        if (daysUntilDeadline <= 2) {
            System.out.println("Lembrete enviado para o usuário: " + userId);
            return true;
        } else {
            System.out.println("Nenhum lembrete enviado para o usuário: " + userId);
            return false;
        }
    }
}