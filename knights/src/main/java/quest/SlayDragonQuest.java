package quest;

import exception.QuestException;

public class SlayDragonQuest implements Quest {
    @Override
    public void embark() throws QuestException {
        System.out.println("Slaying Dragon!");
    }
}
