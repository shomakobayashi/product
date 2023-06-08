package com.practice.demo.service;

import com.practice.demo.entity.Item;
import com.practice.demo.entity.ItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@Service
public class ReadService {

    private ItemRepository itemRepository;
    @Autowired
    public ReadService(ItemRepository itemRepository){
        this.itemRepository = itemRepository;
    }

    public String getDisplayDate(){
        //システム日付を取得
        Date date = new Date();

        //yyyy年MM月dd日の形式に変換
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy年MM月dd日");
        String displayDate = simpleDateFormat.format(date);

        return displayDate;
    }
    @Transactional(readOnly = true)
    public List<Item> findAllItems(){
        return this.itemRepository.findAll();
    }

}
