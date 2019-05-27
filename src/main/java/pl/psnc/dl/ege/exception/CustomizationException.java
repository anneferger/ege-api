package pl.psnc.dl.ege.exception;

import pl.psnc.dl.ege.component.Customization;
import pl.psnc.dl.ege.types.CustomizationSetting;
import pl.psnc.dl.ege.types.DataType;

/**
 * Exception occur when trying to perform
 * validate() method on unknown to {@link Customization} implementation
 * {@link DataType} or when some unpredicted error occurs within validation method. 
 * 
 * @author mariuszs
 *
 */
public class CustomizationException extends EGEException {

	public static final String NOT_SUPPORTED_CUSTOMIZATION_SETTING = "Specified CustomizationSetting not supported by Customization(s): ";

	public static final String INTERNAL_ERROR = "Internal error occured in customization method ";

	enum Type {
		NOT_SUPPORTED_SETTING, INTERNAL_ERROR;
	}

	private Type errorType = Type.INTERNAL_ERROR;

	/**
	 * Default constructor.
	 */
	public CustomizationException(){
		super(INTERNAL_ERROR);
	}

	/**
	 * Constructor with message parameter
	 *
	 * @param message message of exception
	 */
	public CustomizationException(String message){
		super(message);
	}

	/**
	 * Constructs exception with 'not supported data type' message.
	 * Instance of DataType is specified in exception message.
	 *
	 * @param customizationSetting argument of customization exception
	 */
	public CustomizationException(CustomizationSetting customizationSetting){
		 super(NOT_SUPPORTED_CUSTOMIZATION_SETTING + customizationSetting.toString());
		 this.errorType = Type.NOT_SUPPORTED_SETTING;
	}
	
	/**
	 * Returns type of error reported by this exception.
	 * 
	 * @return
	 */
	public Type getErrorType(){
		return errorType;
	}
	
}
