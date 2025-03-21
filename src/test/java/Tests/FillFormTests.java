package Tests;

import org.testng.annotations.*;
import Data.FillFormData;
import SetUpPackage.SetUp;
import Models.FillFormListModel;
import Models.FillFormListModel.Users;

public class FillFormTests extends SetUp{
	@Test(dataProvider = "FillFormData", dataProviderClass = FillFormData.class)
    void FillFormSteps(Users user, FillFormListModel fillFormData) {
        System.out.println(user);
    }
}
