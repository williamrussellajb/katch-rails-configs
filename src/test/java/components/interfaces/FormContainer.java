package components.interfaces;

/**
 * Created by william.russell on 8/28/17.
 */
public interface FormContainer {

    FormContainer setApplicantDobMM(String mm);
    FormContainer setApplicantDobDD(String dd);
    FormContainer setApplicantDobYYYY(String yyyy);
    FormContainer setBFGender(String value);
    FormContainer setTobaccoUser(String answer);

    FormContainer setSpouseApplicantDobMM(String mm);
    FormContainer setSpouseApplicantDobDD(String dd);
    FormContainer setSpouseApplicantDobYYYY(String yyyy);
    FormContainer setSpouseBFGender(String value);
    FormContainer setSpouseTobaccoUser(String answer);
    FormContainer clickAddSpouseButton();
}
