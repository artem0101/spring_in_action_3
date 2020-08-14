package quests;

import exception.QuestException;

public interface Quest {
    void embark() throws QuestException;
}
