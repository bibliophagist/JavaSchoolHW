package lection4;

import java.time.LocalDate;

public class Logger {
    private final int ERROR = 0;
    private final int INFO = 0;
    private final int DEBUG = 0;

    private int level;
    private int messageNumber=0;

    Logger(int level){
        this.level=level;
    }
    public void log (int level, String message){
        if (level<=this.level){
            System.out.println(messageNumber + " " + LocalDate.now() + " " + level + ": " + message);
            increaseMessageNumber();
        }
    }

    public String toString() {
        return messageNumber + " " + level;
    }

    int getLevel() {
        return level;
    }

    private void increaseMessageNumber(){
        this.messageNumber++;
    }
}
