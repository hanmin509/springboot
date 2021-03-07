package com.example.springboot.crud.service;

import com.example.springboot.crud.vo.DataVO;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

@Service
public class DataService {

    private ArrayList array = new ArrayList();

    public void pushData(Map param) {
        for(Object key : param.keySet()){
            array.add(key);
        }
    }

    public ArrayList selectDataList() {
        return array;
    }

    public void popData() {
        array.remove(array.size()-1);
    }

    public void updateData(DataVO dataVO) {
        array.set(dataVO.getSeq(), dataVO.getText());
    }

}
