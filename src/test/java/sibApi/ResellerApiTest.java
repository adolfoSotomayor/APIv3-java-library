/*
 * SendinBlue API
 * SendinBlue provide a RESTFul API that can be used with any languages. With this API, you will be able to :   - Manage your campaigns and get the statistics   - Manage your contacts   - Send transactional Emails and SMS   - and much more...  You can download our wrappers at https://github.com/orgs/sendinblue  **Possible responses**   | Code | Message |   | :-------------: | ------------- |   | 200  | OK. Successful Request  |   | 201  | OK. Successful Creation |   | 202  | OK. Request accepted |   | 204  | OK. Successful Update/Deletion  |   | 400  | Error. Bad Request  |   | 401  | Error. Authentication Needed  |   | 402  | Error. Not enough credit, plan upgrade needed  |   | 403  | Error. Permission denied  |   | 404  | Error. Object does not exist |   | 405  | Error. Method not allowed  | 
 *
 * OpenAPI spec version: 3.0.0
 * Contact: contact@sendinblue.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package sibApi;

import sendinblue.ApiException;
import sibModel.AddCredits;
import sibModel.CreateChild;
import sibModel.CreateReseller;
import sibModel.ErrorModel;
import sibModel.GetChildInfo;
import sibModel.GetChildrenList;
import sibModel.ManageIp;
import sibModel.RemainingCreditModel;
import sibModel.RemoveCredits;
import sibModel.UpdateChild;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for ResellerApi
 */
@Ignore
public class ResellerApiTest {

    private final ResellerApi api = new ResellerApi();

    
    /**
     * Add Email and/or SMS credits to a specific child account
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void addCreditsTest() throws ApiException {
        String childAuthKey = null;
        AddCredits addCredits = null;
        RemainingCreditModel response = api.addCredits(childAuthKey, addCredits);

        // TODO: test validations
    }
    
    /**
     * Associate a dedicated IP to the child
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void associateIpToChildTest() throws ApiException {
        String childAuthKey = null;
        ManageIp ip = null;
        api.associateIpToChild(childAuthKey, ip);

        // TODO: test validations
    }
    
    /**
     * Creates a reseller child
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createResellerChildTest() throws ApiException {
        CreateChild resellerChild = null;
        CreateReseller response = api.createResellerChild(resellerChild);

        // TODO: test validations
    }
    
    /**
     * Deletes a single reseller child based on the childAuthKey supplied
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteResellerChildTest() throws ApiException {
        String childAuthKey = null;
        api.deleteResellerChild(childAuthKey);

        // TODO: test validations
    }
    
    /**
     * Dissociate a dedicated IP to the child
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void dissociateIpFromChildTest() throws ApiException {
        String childAuthKey = null;
        ManageIp ip = null;
        api.dissociateIpFromChild(childAuthKey, ip);

        // TODO: test validations
    }
    
    /**
     * Gets the info about a specific child account
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getChildInfoTest() throws ApiException {
        String childAuthKey = null;
        GetChildInfo response = api.getChildInfo(childAuthKey);

        // TODO: test validations
    }
    
    /**
     * Gets the list of all reseller&#39;s children accounts
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getResellerChildsTest() throws ApiException {
        GetChildrenList response = api.getResellerChilds();

        // TODO: test validations
    }
    
    /**
     * Remove Email and/or SMS credits from a specific child account
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void removeCreditsTest() throws ApiException {
        String childAuthKey = null;
        RemoveCredits removeCredits = null;
        RemainingCreditModel response = api.removeCredits(childAuthKey, removeCredits);

        // TODO: test validations
    }
    
    /**
     * Updates infos of reseller&#39;s child based on the childAuthKey supplied
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateResellerChildTest() throws ApiException {
        String childAuthKey = null;
        UpdateChild resellerChild = null;
        api.updateResellerChild(childAuthKey, resellerChild);

        // TODO: test validations
    }
    
}
