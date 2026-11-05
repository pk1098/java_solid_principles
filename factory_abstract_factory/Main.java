package factory_abstract_factory;

public class Main {
    public static void main(String[] args) {
        shape circle = ShapeFactory.getShape("circle");
        circle.draw();
        
        DocumentExporter exporter = DocumentExporterFactory.getDocumentExporter("pdf");
        exporter.export("Hello, World!");
    }
}
