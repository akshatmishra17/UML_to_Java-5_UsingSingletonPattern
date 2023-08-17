class MaterialProperty {
    private String name;
    private String type;
    private String value;

    private MaterialProperty(String name, String type, String value) {
        this.name = name;
        this.type = type;
        this.value = value;}
    public static MaterialProperty getInstance(String name, String type, String value) {
        return new MaterialProperty(name, type, value);}
    public String getName() {return name;}
    public String getType() {return type;}
    public String getValue() {return value;}

    @Override
    public String toString() {return "Property: " + name + " (Type: " + type + ", Value: " + value + ")";}
}
