package pl.psnc.dl.ege.types;

import java.util.List;

public class CustomizationSetting implements Comparable {

    private final String format;
    private final List<CustomizationSourceInputType> sources;
    private final List<CustomizationSourceInputType> customizations;
    private final List<String> outputFormats;

    public CustomizationSetting(String format, List<CustomizationSourceInputType> sources,
                                List<CustomizationSourceInputType> customizations, List<String> outputFormats) {
        this.format = format;
        this.sources = sources;
        this.customizations = customizations;
        this.outputFormats = outputFormats;
    }

    private String getFormat() {
        return format;
    }

    public List<CustomizationSourceInputType> getSources() {
        return sources;
    }

    public List<CustomizationSourceInputType> getCustomizations() {
        return customizations;
    }

    public List<String> getOutputFormats() {
        return outputFormats;
    }

    @Override
    public String toString() {
        return format;
    }

    @Override
    /**
     * Method returns <b>'false'</b> if:
     * <ol>
     * <li>input object is null</li>
     * <li>input object is not an instance of CustomizationSetting</li>
     * <li>format of both objects are not equal</li>
     * </ol>
     */
    public boolean equals(Object customizationSetting) {
        if(this == customizationSetting){
            return true;
        }
        if(customizationSetting == null){
            return false;
        }
        if(!(customizationSetting instanceof CustomizationSetting)){
            return false;
        }
        CustomizationSetting conv = (CustomizationSetting)customizationSetting;
        if((conv.getFormat() != null && this.format != null && conv.getFormat().equals(this.format))){
            return true;
        }
        return false;
    }

    public int compareTo(Object d) {
        return toString().compareToIgnoreCase(d.toString());
    }

}
