package complicated_examples.doc_download_system;

public class Main {
    public static void main(String[] args) {
        DocumentService documentService = DocumentServiceFactory.getDocumentService("cloud");
        DocumentService loggingService = new DocumentServiceLogging(documentService);
        loggingService.downloadDocument("doc123", "user456");
    }
}
