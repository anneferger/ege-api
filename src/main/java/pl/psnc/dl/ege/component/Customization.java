package pl.psnc.dl.ege.component;

import pl.psnc.dl.ege.exception.CustomizationException;
import pl.psnc.dl.ege.exception.EGEException;
import pl.psnc.dl.ege.types.CustomizationSetting;
import pl.psnc.dl.ege.types.CustomizationSourceInputType;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.List;

/**
 * <p>Main EGE customization interface.</p>
 *
 *
 *
 * @author roewenstrunk
 */
public interface Customization {

    /**
     * <p>Customization method</p>
     *
     * @param customizationSetting specified {@link CustomizationSetting} of streamed data.
     * @throws IOException
     * @throws {@link CustomizationException}
     * @throws {@link EGEException}
     */
    void customize(CustomizationSetting customizationSetting, CustomizationSourceInputType sourceId,
                   CustomizationSourceInputType customizationId, String outputFormat, OutputStream outputStream,
                   File localSourceFile, File localCustomizationFile)
            throws IOException, EGEException;

    /**
     * <p>Supported customization settings</p>
     *
     * Method returns list of all supported <code>CustomizationSetting</code>s.
     *
     * @return list of <code>CustomizationSetting</code>.
     */
    List<CustomizationSetting> getSupportedCustomizationSettings();

}
