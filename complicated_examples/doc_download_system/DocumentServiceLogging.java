package complicated_examples.doc_download_system;

public class DocumentServiceLogging extends DocumentServiceDecorator {
    public DocumentServiceLogging(DocumentService documentService) {
        super(documentService);
    }

    @Override
    public void downloadDocument(String documentId, String userId) {
        System.out.println("Logging: User " + userId + " is downloading document " + documentId);
        documentService.downloadDocument(documentId, userId);
    }
    
}
