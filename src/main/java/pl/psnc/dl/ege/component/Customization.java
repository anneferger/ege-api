package pl.psnc.dl.ege.component;

import pl.psnc.dl.ege.exception.CustomizationException;
import pl.psnc.dl.ege.exception.EGEException;
import pl.psnc.dl.ege.types.CustomizationSetting;

import java.io.IOException;
import java.io.InputStream;
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
     * @param inputData data to customize as {@link InputStream}
     * @param customizationSetting specified {@link CustomizationSetting} of streamed data.
     * @throws IOException
     * @throws {@link CustomizationException}
     * @throws {@link EGEException}
     */
    public void customize(InputStream inputData, CustomizationSetting customizationSetting) throws IOException, CustomizationException, EGEException;

    /**
     * <p>Supported customization settings</p>
     *
     * Method returns list of all supported <code>CustomizationSetting</code>s.
     *
     * @return list of <code>CustomizationSetting</code>.
     */
    public List<CustomizationSetting> getSupportedCustomizationSettings();
}
