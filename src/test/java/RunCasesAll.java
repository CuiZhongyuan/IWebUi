
import com.iwebui.utils.BaseTestngInit;

import io.qameta.allure.Allure;
import io.qameta.allure.Story;
import org.testng.annotations.Test;

public class RunCasesAll {

    /**
     * 测试用例总入口
     * */
   @Test
    public void runCases(){
        //执行测试用例入口
        BaseTestngInit baseTestngInit = new BaseTestngInit();
        baseTestngInit.baseTestngInitCode();
    }
}
