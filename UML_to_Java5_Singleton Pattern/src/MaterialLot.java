import java.util.ArrayList;
import java.util.List;

public class MaterialLot {
    private static MaterialLot instance = new MaterialLot();

    private MaterialDefinition materialDefinition;
    private List<MaterialSublot> isMadeUpOf = new ArrayList<>();
    private List<MaterialLotProperty> properties = new ArrayList<>();

    private MaterialLot() {}
    public static MaterialLot getInstance() {return instance;}
    public void setMaterialDefinition(MaterialDefinition materialDefinition) {this.materialDefinition = materialDefinition;}
    public void addIsMadeUpOf(MaterialSublot sublot) {isMadeUpOf.add(sublot);}
    public void addProperty(MaterialLotProperty property) {properties.add(property);}
    public MaterialDefinition getMaterialDefinition() {return materialDefinition;}
    public List<MaterialSublot> getIsMadeUpOf() {return isMadeUpOf;}
    public List<MaterialLotProperty> getProperties() {return properties;}
}
