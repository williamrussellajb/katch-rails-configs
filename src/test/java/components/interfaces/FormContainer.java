package components.interfaces;

import pages.QLEFormPage;

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

    FormContainer setDependentApplicantDobMM(String mm);
    FormContainer setDependentApplicantDobDD(String dd);
    FormContainer setDependentApplicantDobYYYY(String yyyy);
    FormContainer setDependentBFGender(String value);
    FormContainer setDependentTobaccoUser(String answer);
    FormContainer clickAddDependentButton();

    FormContainer clickNextStep1();
    FormContainer clickBackStep1();
}

