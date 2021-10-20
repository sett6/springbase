package icu.sett.service;

import icu.sett.dao.baseDao;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author sett
 * @date 2021年05月30日 12:06
 * @title
 */
public class BaseService<T> {

    @Autowired
    baseDao<T> basedao;

    public void save(){
        basedao.save();
    }

}
