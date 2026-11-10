package complicated_examples.doc_download_system;

public abstract class DocumentServiceDecorator implements DocumentService {
    protected final DocumentService documentService;

    public DocumentServiceDecorator(DocumentService documentService) {
        this.documentService = documentService;
    }

    public abstract void downloadDocument(String documentId, String userId);
    
}
