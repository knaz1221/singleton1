package practice2.college.practice2.Strategy;
import java.time.LocalDateTime;
public class Document {
    private String documentName;
    private LocalDateTime dateCreated;
    private String documentContent;
    private String signatureBy;
    public Document(String documentName, LocalDateTime dateCreated, String documentContent, String signatureBy) {
        this.documentName = documentName;
        this.dateCreated = dateCreated;
        this.documentContent = documentContent;
        this.signatureBy = signatureBy;
    }

    public String getDocumentName() {
        return documentName;
    }

    public LocalDateTime getDateCreated() {
        return dateCreated;
    }

    public String getDocumentContent() {
        return documentContent;
    }

    public String getSignatureBy() {
        return signatureBy;
    }
}
