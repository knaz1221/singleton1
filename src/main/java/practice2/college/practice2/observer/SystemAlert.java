package practice2.college.practice2.observer;

import java.time.LocalDate;

public class SystemAlert {
    private AlertSeverity _severity;
    private String _message;
    private int _executionCode;
    private LocalDate _timesTamp;
    private String _procces;

    public SystemAlert(AlertSeverity severity, String message, int executionCode, LocalDate timesTamp, String procces) {
        this._severity = severity;
        this._message = message;
        this._executionCode = executionCode;
        this._timesTamp = timesTamp;
        this._procces = procces;
    }

    public AlertSeverity getSeverity() {
        return _severity;
    }

    public String getMessage() {
        return _message;
    }

    public int getExecutionCode() {
        return _executionCode;
    }

    public LocalDate getTimesTamp() {
        return _timesTamp;
    }

    public String getProcces() {
        return _procces;
    }
}