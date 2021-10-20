package icu.sett.springmvc.customDataBinder;

import org.thymeleaf.util.StringUtils;

import java.beans.PropertyEditorSupport;

/**
 * @author sett
 * @date 2021年06月18日 22:59
 * @title
 */
public class StringToListPropertyEditor extends PropertyEditorSupport {
    @Override
    public void setAsText(String text) throws IllegalArgumentException {
        String[] result = null;
        if (!StringUtils.isEmpty(text)){
            result=text.split("_");
        }
        setValue(result);
    }
}
