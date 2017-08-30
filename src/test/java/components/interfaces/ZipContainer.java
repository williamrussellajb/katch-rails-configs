package components.interfaces;

/**
 * Created by william.russell on 8/28/17.
 */
public interface ZipContainer {

    ZipContainer setZipInput(String zipCode);
    ZipContainer clickZipButton();
    ZipContainer setApplicantDobMM(String mm);
    ZipContainer setApplicantDobDD(String dd);
    ZipContainer setApplicantDobYYYY(String yyyy);



}
