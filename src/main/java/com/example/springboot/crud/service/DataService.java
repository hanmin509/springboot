package com.example.springboot.crud.service;

import com.example.springboot.crud.vo.DataVO;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class DataService {

    private ArrayList array = new ArrayList();

    public void pushData(String param) {
        array.add(param);
    }

    public ArrayList selectDataList() {
        return array;
    }

    public void popData() {
        array.remove(array.size()-1);
    }

    public void updateData(DataVO dataVO) {
        array.set(dataVO.getIndex(), dataVO.getText());
    }

}
