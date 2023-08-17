import java.util.ArrayList;
import java.util.List;

class MaterialDefinition {
    private static MaterialDefinition instance;

    private List<MaterialDefinitionProperty> properties = new ArrayList<>();

    private MaterialDefinition() {}
    public static MaterialDefinition getInstance() {
        if (instance == null) {
            instance = new MaterialDefinition();}
        return instance;}
    public void addProperty(MaterialDefinitionProperty property) {properties.add(property);}
    public List<MaterialDefinitionProperty> getProperties() {return properties;}
}