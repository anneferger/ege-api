package pl.psnc.dl.ege.types;

public class CustomizationSourceInputType {

    public static final String TYPE_SERVER_FILE = "type_server-file";
    public static final String TYPE_CLIENT_FILE = "type_client-file";

    private final String id;
    private final String name;
    private final String type;
    private final String path;

    public CustomizationSourceInputType(String id, String name, String type) {
        this.id = id;
        this.name = name;
        this.type = type;
        this.path = null;
    }

    public CustomizationSourceInputType(String id, String name, String type, String path) {
        this.id = id;
        this.name = name;
        this.type = type;
        this.path = path;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public String getPath() {
        return path;
    }
}