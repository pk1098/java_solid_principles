package complicated_examples.doc_download_system;

public class DocumentServiceFactory {
    

    public static DocumentService getDocumentService(String serviceType) {
        DocumentService documentService;
        switch(serviceType.toLowerCase())
        {
            case "cloud":
                documentService = new DocumentServiceProxy(new DocumentServiceImpl());
                break;
            default:
                throw new IllegalArgumentException("Invalid service type");
        }
        return documentService;
    }
}
