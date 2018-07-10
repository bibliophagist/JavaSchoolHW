package lection4;

public class NameableLogger extends Logger {
    private String loggerName;

    NameableLogger(int level, String name) {
        super(level);
        this.loggerName = name;
    }

    @Override
    public void log(int level, String message) {
        if (level <= super.getLevel()) {
            System.out.print(this.loggerName + ": ");
            super.log(level, message);
        }
    }

    @Override
    public String toString() {
        return super.toString() + loggerName;
    }
}
