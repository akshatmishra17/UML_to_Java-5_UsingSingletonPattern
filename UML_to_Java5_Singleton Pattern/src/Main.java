import java.util.List;

public class Main {
    public static void main(String[] args) {

        MaterialDefinition mat1Definition = MaterialDefinition.getInstance();
        MaterialClass mat1Class = MaterialClass.getInstance();
        MaterialLot mat1Lot = MaterialLot.getInstance();
        MaterialSublot mat1Sublot1 = new MaterialSublot();
        MaterialSublot mat1Sublot2 = new MaterialSublot();

        mat1Definition.addProperty(new MaterialDefinitionProperty("Density", "8 g/cm^3"));
        mat1Definition.addProperty(new MaterialDefinitionProperty("Tensile Strength", "300 MPa"));

        mat1Class.addProperty(new MaterialClassProperty("Name", "Steel"));
        mat1Class.addProperty(new MaterialClassProperty("Type", "Metallic Substance"));

        mat1Lot.setMaterialDefinition(mat1Definition);
        mat1Lot.addIsMadeUpOf(mat1Sublot1);
        mat1Lot.addIsMadeUpOf(mat1Sublot2);

        System.out.println("Material Definition Properties:");
        List<MaterialDefinitionProperty> mat1DefinitionProperties = mat1Definition.getProperties();
        for (int i = 0; i < mat1DefinitionProperties.size(); i++) {
            MaterialDefinitionProperty property = mat1DefinitionProperties.get(i);
            System.out.println("MAT1 - " + property.getName() + ": " + property.getValue());
        }

        System.out.println();
        System.out.println("Material Class Properties:");
        List<MaterialClassProperty> mat1ClassProperties = mat1Class.getProperties();
        for (int i = 0; i < mat1ClassProperties.size(); i++) {
            MaterialClassProperty property = mat1ClassProperties.get(i);
            System.out.println("MAT1 - " + property.getName() + ": " + property.getDescription());
        }

        System.out.println();
        System.out.println("Material Lot Properties:");
        System.out.println("MAT1 - Defined by Material Definition");

        System.out.println();
        System.out.println("Material Sublot Properties:");
        List<MaterialSublot> mat1Sublots = mat1Lot.getIsMadeUpOf();
        for (int i = 0; i < mat1Sublots.size(); i++) {
            System.out.println("MAT1 - is Assembled From Material Sublot " + (i + 1));
        }
    }
}
