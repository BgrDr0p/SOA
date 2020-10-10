package exceptions;


import javax.xml.ws.WebFault;

@WebFault(name="LeftLifeException")
public class LifeLeftException extends Exception {

    private LifeLeftErrors Error;

    public LifeLeftException(String message, LifeLeftErrors Error) {
        super(message);
        this.Error = Error;
    }

    public LifeLeftException(String message, Throwable cause, LifeLeftErrors error) {
        super(message, cause);
        Error = error;
    }

    public LifeLeftErrors getErrorInfo() {
        return Error;
    }
}
