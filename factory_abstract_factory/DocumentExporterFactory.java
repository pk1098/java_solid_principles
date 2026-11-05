package factory_abstract_factory;

public class DocumentExporterFactory {
    public static DocumentExporter getDocumentExporter(String type) {
        switch (type.toLowerCase()) {
            case "pdf":
                return new PdfExporter();
            default:
                throw new IllegalArgumentException("Unknown document exporter type: " + type);
        }
    }
}
