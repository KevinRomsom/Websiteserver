package nl.fhict.s3.websiteserver;

public class LoginCheck {
    private final String id;
    private final String content;

    public LoginCheck(String id, String content) {
        this.id = id;
        this.content = content;
    }

    public String isResult() {
        return id;
    }

    public String getContent() {
        return content;
    }
}
