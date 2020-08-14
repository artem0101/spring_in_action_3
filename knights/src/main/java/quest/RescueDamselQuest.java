package quest;

import exception.QuestException;

public class RescueDamselQuest implements Quest {
    @Override
    public void embark() throws QuestException {
        System.out.println("Rescuing damsel in distress");
    }
}
