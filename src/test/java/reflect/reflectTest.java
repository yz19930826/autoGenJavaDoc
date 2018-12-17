package reflect;

import club.hellojava.Doc;
import com.alibaba.fastjson.JSON;
import io.github.yedaxia.apidocs.Docs;
import org.junit.Test;

import java.lang.annotation.Annotation;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class reflectTest {

    @Test
    public void test(){

        // 获取接口信息
        Docs.DocsConfig config = new Docs.DocsConfig();
        config.setProjectPath("D:\\Code\\docgen");
        Docs.buildHtmlDocs(config);
        // 展示
    }


    @Test
    public void testGetInterfaceInfo() throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        Class docClass = Doc.class;
        Method[] methods1 = docClass.getMethods();
        System.out.println(JSON.toJSONString(methods1));


        Method m1 = methods1[0];
        Class<?> returnType = m1.getReturnType();
        // 获取注释信息
        Annotation[] declaredAnnotations = m1.getDeclaredAnnotations();


        // 获取注解信息



        // 判断是否为基本类型
        boolean primitive = returnType.isPrimitive();

        //获取所有的方法
        Method[] methods = returnType.getMethods();





//        Map<String, Object> describe = PropertyUtils.describe(Doc.class);
//        Object methods = describe.get("methods");
//        PropertyUtilsBean propertyUtilsBean = new PropertyUtilsBean();
//        Map<String, Object> describe1 = propertyUtilsBean.describe(Doc.class);
//        Object methods2 = describe1.get("methods");
//        System.out.println(methods.getClass());
//        System.out.println(JSON.toJSONString(methods));
//        System.out.println("111");
    }

}
