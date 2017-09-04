package components.interfaces;

/**
 * Created by william.russell on 8/28/17.
 */
public interface ZipContainer {

	ZipContainer setZipInput(String zipCode);

	ZipContainer clickZipButton();

	ZipContainer clickLMDiscountIcon();

	ZipContainer clickLMACAIcon();

	ZipContainer clickLMMedicareIcon();

	ZipContainer clickLMBasicIcon();

}
