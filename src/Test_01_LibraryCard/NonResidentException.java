package Test_01_LibraryCard;

public class NonResidentException extends Throwable {
    public NonResidentException(String msg) {
        super(msg);
    }
}

class FailToCheckOutException extends Throwable {
    public FailToCheckOutException(String msg) {
        super(msg);
    }
}