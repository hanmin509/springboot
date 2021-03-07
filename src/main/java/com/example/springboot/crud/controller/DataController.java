package com.example.springboot.crud.controller;

import com.example.springboot.crud.vo.DataVO;
import com.example.springboot.crud.service.DataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Map;

@RestController
public class DataController {

    @Autowired
    DataService dataService;

    @RequestMapping(value = "/insertData", method = RequestMethod.POST)
    public void insertData(@RequestBody Map<String, Object> param) {
        dataService.pushData(param);
    }

    @RequestMapping(value = "/selectData", method = RequestMethod.GET)
    public ArrayList data() {
        return dataService.selectDataList();
    }

    @RequestMapping(value = "/deleteData", method = RequestMethod.DELETE)
    public void deleteData() {
        dataService.popData();
    }

    @RequestMapping(value = "/deleteData", method = RequestMethod.POST)
    public void updateData(@RequestBody DataVO dataVO) {
        dataService.updateData(dataVO);
    }
}
