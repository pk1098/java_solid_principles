package complicated_examples.doc_download_system;

import java.util.HashMap;
import java.util.Map;

public class DocumentServiceProxy implements DocumentService{
    DocumentService documentServiceImpl;
    private final Map<String, String> cache = new HashMap<>();

    public DocumentServiceProxy(DocumentService documentServiceImpl) {
        this.documentServiceImpl = documentServiceImpl;
    }

    @Override 
    public void downloadDocument(String documentId, String userId) {
        // Add additional logic before calling the actual service
        
        System.out.println("Proxy: Checking permissions for user: " + userId);
        if(!checkPermission(userId)) {
            System.out.println("Proxy: User " + userId + " does not have permission to download the document.");
            throw new SecurityException("User does not have permission to download the document.");
        }

        if(cache.containsKey(documentId)) {
            System.out.println("Proxy: Document with ID: " + documentId + " is already downloaded. Fetching from cache.");
            return;
        }

        // Call the actual service
        documentServiceImpl.downloadDocument(documentId, userId);
        cache.put(documentId, userId); // Cache the downloaded document
        // Add additional logic after calling the actual service
        System.out.println("Proxy: Document download completed for user: " + userId);
    }

    private boolean checkPermission(String userId) {
        // Simulate permission check logic
        System.out.println("Checking permissions for user: " + userId);
        return true;
    }
}
