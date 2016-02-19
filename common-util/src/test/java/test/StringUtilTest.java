package test;

import com.devilmole.common.util.StringUtil;
import org.junit.Test;

/**
 * Created by Administrator on 2016/2/19 0019.
 */
public class StringUtilTest{

    @Test
    public void testName() throws Exception {
        String target=null;
        int result=StringUtil.countLength(target);
        System.out.println(result);
    }

    @Test
    public void testAnother() throws Exception {
        String target="ataewra";
        System.out.println(StringUtil.getUpper(target));
    }
}
