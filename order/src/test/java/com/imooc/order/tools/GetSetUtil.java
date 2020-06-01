package com.imooc.order.tools;

import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.imooc.order.dataobject.OrderDetail;
import com.imooc.order.dataobject.OrderMaster;

import java.lang.reflect.Field;
import java.util.List;
import java.util.Map;

/**
 * @作者 宋寒冬
 * @日期 2020-03-15
 * @时间 00:48
 * @描述
 */
public class GetSetUtil {

    private Map<String,String> getFields(Class clazz){

        Map<String, String> fieldMap = Maps.newHashMap();

        Field[] fields = clazz.getDeclaredFields();
        for (Field field : fields) {
            String fieldName = field.getName();
            String className = field.getGenericType().toString();
            fieldMap.put(fieldName, className);
        }

        return fieldMap;

    }

    public List<String> methodSet(Class clazz){
        String className = clazz.getSimpleName().substring(0,1).toLowerCase()+clazz.getSimpleName().substring(1);
        List<String> methodNames = Lists.newArrayList();
        Map<String,String> fieldNames = this.getFields(clazz);

        for (Map.Entry<String,String> fieldName : fieldNames.entrySet()) {
            if (fieldName.getValue().equals("class java.lang.String")){
                String set = className+"."+"set"+fieldName.getKey().substring(0,1).toUpperCase()+fieldName.getKey().substring(1)+"(\"123\");";
                methodNames.add(set);
            } else if (fieldName.getValue().equals("class java.util.Date")) {
                String set = className+"."+"set"+fieldName.getKey().substring(0,1).toUpperCase()+fieldName.getKey().substring(1)+"(DateTimeUtil.longToDate(1559205990000L));";
                methodNames.add(set);
            } else if (fieldName.getValue().equals("class java.math.BigDecimal")) {
                String set = className+"."+"set"+fieldName.getKey().substring(0,1).toUpperCase()+fieldName.getKey().substring(1)+"(new BigDecimal(1));";
                methodNames.add(set);
            } else if (fieldName.getValue().equals("class java.lang.Integer")) {
                String set = className+"."+"set"+fieldName.getKey().substring(0,1).toUpperCase()+fieldName.getKey().substring(1)+"(1);";
                methodNames.add(set);
            } else if (fieldName.getValue().equals("class java.lang.Boolean")){
                String set = className+"."+"set"+fieldName.getKey().substring(0,1).toUpperCase()+fieldName.getKey().substring(1)+"(true);";
                methodNames.add(set);
            } else if (fieldName.getValue().equals("class java.lang.Byte")) {
                String set = className+"."+"set"+fieldName.getKey().substring(0,1).toUpperCase()+fieldName.getKey().substring(1)+"((Byte)1);";
                methodNames.add(set);
            } else if (fieldName.getValue().equals("class java.lang.Long")) {
                String set = className+"."+"set"+fieldName.getKey().substring(0,1).toUpperCase()+fieldName.getKey().substring(1)+"(1739054011948L);";
                methodNames.add(set);
            } else if (fieldName.getValue().equals("int")) {
                String set = className+"."+"set"+fieldName.getKey().substring(0,1).toUpperCase()+fieldName.getKey().substring(1)+"(1);";
                methodNames.add(set);
            } else if (fieldName.getValue().equals("long")) {
                String set = className+"."+"set"+fieldName.getKey().substring(0,1).toUpperCase()+fieldName.getKey().substring(1)+"(1739054011948L);";
                methodNames.add(set);
            } else if (fieldName.getValue().equals("boolean")) {
                String set = className+"."+"set"+fieldName.getKey().substring(0,1).toUpperCase()+fieldName.getKey().substring(1)+"(true);";
                methodNames.add(set);
            } else if (fieldName.getValue().equals("double")) {
                String set = className+"."+"set"+fieldName.getKey().substring(0,1).toUpperCase()+fieldName.getKey().substring(1)+"(1.0);";
                methodNames.add(set);
            } else {
                String set = className+"."+"set"+fieldName.getKey().substring(0,1).toUpperCase()+fieldName.getKey().substring(1)+"(null);";
                methodNames.add(set);
            }

        }
        return methodNames;
    }

    static class SetMethod{

        static GetSetUtil getSetUtil = new GetSetUtil();
        public static void methodSet(Class clazz){
            List<String> methodNames = getSetUtil.methodSet(clazz);
            for (String methodName : methodNames) {
                System.out.println(methodName);
            }
        }
    }


    public static void main(String[] args) {
        SetMethod.methodSet(OrderMaster.class);
    }

}
