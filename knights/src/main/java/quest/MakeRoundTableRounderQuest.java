package quest;

import exception.QuestException;

public class MakeRoundTableRounderQuest implements Quest {
    @Override
    public void embark() throws QuestException {
        System.out.println("Making round table rounder");
    }
}
