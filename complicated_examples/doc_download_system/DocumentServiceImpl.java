package complicated_examples.doc_download_system;

public class DocumentServiceImpl implements DocumentService {
    @Override
    public void downloadDocument(String documentId, String userId) {
        // Simulate document download logic
        System.out.println("Downloading document with ID: " + documentId + " for user: " + userId);
    }
    
}
